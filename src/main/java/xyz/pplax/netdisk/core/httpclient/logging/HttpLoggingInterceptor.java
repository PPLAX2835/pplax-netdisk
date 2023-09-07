/*
 * Copyright (C) 2015 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package xyz.pplax.netdisk.core.httpclient.logging;

import lombok.extern.slf4j.Slf4j;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.BufferedSource;
import okio.GzipSource;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import static okhttp3.internal.platform.Platform.INFO;

/**
 * 此类代码来源于 logging-interceptor.
 * <br>
 * An OkHttp interceptor which logs request and response information. Can be applied as an
 * {@linkplain OkHttpClient#interceptors() application interceptor} or as a {@linkplain
 * OkHttpClient#networkInterceptors() network interceptor}. <p> The format of the logs created by
 * this class should not be considered stable and may change slightly between releases. If you need
 * a stable logging format, use your own interceptor.
 * <br>
 * 实现OkHttp拦截器
 * @author zhaojun
 */
@Slf4j
public final class HttpLoggingInterceptor implements Interceptor {

	private static final Charset UTF8 = StandardCharsets.UTF_8;

	/**
	 * 枚举类型Level：
	 *
	 * 枚举类型Level定义了不同的日志级别，包括NONE、BASIC、HEADERS和BODY。
	 * 这些级别决定了日志输出的详细程度。
	 */
	public enum Level {
		/** No logs. */
		NONE,
		/**
		 * Logs request and response lines.
		 *
		 * <p>Example:
		 * <pre>{@code
		 * --> POST /greeting http/1.1 (3-byte body)
		 *
		 * <-- 200 OK (22ms, 6-byte body)
		 * }</pre>
		 */
		BASIC,
		/**
		 * Logs request and response lines and their respective headers.
		 *
		 * <p>Example:
		 * <pre>{@code
		 * --> POST /greeting http/1.1
		 * Host: example.com
		 * Content-Type: plain/text
		 * Content-Length: 3
		 * --> END POST
		 *
		 * <-- 200 OK (22ms)
		 * Content-Type: plain/text
		 * Content-Length: 6
		 * <-- END HTTP
		 * }</pre>
		 */
		HEADERS,
		/**
		 * Logs request and response lines and their respective headers and bodies (if present).
		 *
		 * <p>Example:
		 * <pre>{@code
		 * --> POST /greeting http/1.1
		 * Host: example.com
		 * Content-Type: plain/text
		 * Content-Length: 3
		 *
		 * Hi?
		 * --> END POST
		 *
		 * <-- 200 OK (22ms)
		 * Content-Type: plain/text
		 * Content-Length: 6
		 *
		 * Hello!
		 * <-- END HTTP
		 * }</pre>
		 */
		BODY
	}

	/**
	 * 接口Logger：
	 *
	 * 定义了一个Logger接口，用于日志输出。
	 * 提供了默认的Logger.DEFAULT实例，以及额外的DEBUG和TRACE实例。
	 */
	public interface Logger {
		void log(String message);

		/** A {@link Logger} defaults output appropriate for the current platform. */
		Logger DEFAULT = message -> Platform.get().log(INFO, message, null);

		Logger DEBUG = log::debug;
		Logger TRACE = log::trace;

	}

	public HttpLoggingInterceptor() {
		this(Logger.DEFAULT);
	}

	public HttpLoggingInterceptor(Logger logger) {
		this.logger = logger;
	}

	private final Logger logger;

	private volatile Set<String> headersToRedact = Collections.emptySet();

	public void redactHeader(String name) {
		Set<String> newHeadersToRedact = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
		newHeadersToRedact.addAll(headersToRedact);
		newHeadersToRedact.add(name);
		headersToRedact = newHeadersToRedact;
	}

	private volatile Level level = Level.NONE;

	/** Change the level at which this interceptor logs. */
	public HttpLoggingInterceptor setLevel(Level level) {
		if (level == null) throw new NullPointerException("level == null. Use Level.NONE instead.");
		this.level = level;
		return this;
	}

	public Level getLevel() {
		return level;
	}

	/**
	 * 实现了Interceptor接口的intercept()方法，用于拦截HTTP请求和响应。
	 * 根据日志级别确定是否记录请求和响应的信息，以及是否记录请求和响应的头部信息和主体。
	 * 在请求发起前，记录请求的起始信息，包括请求方法、URL、协议等。
	 * 在请求和响应的各个阶段记录相关信息，包括头部、主体、耗时等。
	 * 根据是否有主体内容和主体内容的编码方式，输出不同的日志信息。
	 * 最终返回响应对象。
	 * @param chain
	 * @return
	 * @throws IOException
	 */
	@Override public Response intercept(Chain chain) throws IOException {
		Level level = this.level;

		Request request = chain.request();
		if (level == Level.NONE) {
			return chain.proceed(request);
		}

		boolean logBody = level == Level.BODY;
		boolean logHeaders = logBody || level == Level.HEADERS;

		RequestBody requestBody = request.body();
		boolean hasRequestBody = requestBody != null;

		Connection connection = chain.connection();
		String requestStartMessage = "--> "
				+ request.method()
				+ ' ' + request.url()
				+ (connection != null ? " " + connection.protocol() : "");
		if (!logHeaders && hasRequestBody) {
			requestStartMessage += " (" + requestBody.contentLength() + "-byte body)";
		}
		logger.log(requestStartMessage);

		if (logHeaders) {
			if (hasRequestBody) {
				// Request body headers are only present when installed as a network interceptor. Force
				// them to be included (when available) so there values are known.
				if (requestBody.contentType() != null) {
					logger.log("Content-Type: " + requestBody.contentType());
				}
				if (requestBody.contentLength() != -1) {
					logger.log("Content-Length: " + requestBody.contentLength());
				}
			}

			Headers headers = request.headers();
			for (int i = 0, count = headers.size(); i < count; i++) {
				String name = headers.name(i);
				// Skip headers from the request body as they are explicitly logged above.
				if (!"Content-Type".equalsIgnoreCase(name) && !"Content-Length".equalsIgnoreCase(name)) {
					logHeader(headers, i);
				}
			}

			if (!logBody || !hasRequestBody) {
				logger.log("--> END " + request.method());
			} else if (bodyHasUnknownEncoding(request.headers())) {
				logger.log("--> END " + request.method() + " (encoded body omitted)");
			} else if (requestBody.isDuplex()) {
				logger.log("--> END " + request.method() + " (duplex request body omitted)");
			} else {
				Buffer buffer = new Buffer();
				requestBody.writeTo(buffer);

				Charset charset = UTF8;
				MediaType contentType = requestBody.contentType();
				if (contentType != null) {
					charset = contentType.charset(UTF8);
				}

				logger.log("");
				if (isPlaintext(buffer)) {
					logger.log(buffer.readString(charset));
					logger.log("--> END " + request.method()
							+ " (" + requestBody.contentLength() + "-byte body)");
				} else {
					logger.log("--> END " + request.method() + " (binary "
							+ requestBody.contentLength() + "-byte body omitted)");
				}
			}
		}

		long startNs = System.nanoTime();
		Response response;
		try {
			response = chain.proceed(request);
		} catch (Exception e) {
			logger.log("<-- HTTP FAILED: " + e);
			throw e;
		}
		long tookMs = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - startNs);

		ResponseBody responseBody = response.body();
		long contentLength = responseBody.contentLength();
		String bodySize = contentLength != -1 ? contentLength + "-byte" : "unknown-length";
		logger.log("<-- "
				+ response.code()
				+ (response.message().isEmpty() ? "" : ' ' + response.message())
				+ ' ' + response.request().url()
				+ " (" + tookMs + "ms" + (!logHeaders ? ", " + bodySize + " body" : "") + ')');

		if (logHeaders) {
			Headers headers = response.headers();
			for (int i = 0, count = headers.size(); i < count; i++) {
				logHeader(headers, i);
			}

			if (!logBody || !HttpHeaders.hasBody(response)) {
				logger.log("<-- END HTTP");
			} else if (bodyHasUnknownEncoding(response.headers())) {
				logger.log("<-- END HTTP (encoded body omitted)");
			} else {
				BufferedSource source = responseBody.source();
				source.request(Long.MAX_VALUE); // Buffer the entire body.
				Buffer buffer = source.getBuffer();

				Long gzippedLength = null;
				if ("gzip".equalsIgnoreCase(headers.get("Content-Encoding"))) {
					gzippedLength = buffer.size();
					try (GzipSource gzippedResponseBody = new GzipSource(buffer.clone())) {
						buffer = new Buffer();
						buffer.writeAll(gzippedResponseBody);
					}
				}

				Charset charset = UTF8;
				MediaType contentType = responseBody.contentType();
				if (contentType != null) {
					charset = contentType.charset(UTF8);
				}

				if (!isPlaintext(buffer)) {
					logger.log("");
					logger.log("<-- END HTTP (binary " + buffer.size() + "-byte body omitted)");
					return response;
				}

				if (contentLength != 0) {
					logger.log("");
					logger.log(buffer.clone().readString(charset));
				}

				if (gzippedLength != null) {
					logger.log("<-- END HTTP (" + buffer.size() + "-byte, "
							+ gzippedLength + "-gzipped-byte body)");
				} else {
					logger.log("<-- END HTTP (" + buffer.size() + "-byte body)");
				}
			}
		}

		return response;
	}

	/**
	 * 用于记录头部信息，可以根据配置决定是否隐藏某些敏感头部信息。
	 * @param headers
	 * @param i
	 */
	private void logHeader(Headers headers, int i) {
		String value = headersToRedact.contains(headers.name(i)) ? "██" : headers.value(i);
		logger.log(headers.name(i) + ": " + value);
	}

	/**
	 * Returns true if the body in question probably contains human readable text. Uses a small sample
	 * of code points to detect unicode control characters commonly used in binary file signatures.
	 * 用于判断主体内容是否为纯文本。
	 * 通过检查主体内容的前64个字节，检查是否包含非可见字符。
	 */
	static boolean isPlaintext(Buffer buffer) {
		try {
			Buffer prefix = new Buffer();
			long byteCount = buffer.size() < 64 ? buffer.size() : 64;
			buffer.copyTo(prefix, 0, byteCount);
			for (int i = 0; i < 16; i++) {
				if (prefix.exhausted()) {
					break;
				}
				int codePoint = prefix.readUtf8CodePoint();
				if (Character.isISOControl(codePoint) && !Character.isWhitespace(codePoint)) {
					return false;
				}
			}
			return true;
		} catch (EOFException e) {
			return false; // Truncated UTF-8 sequence.
		}
	}

	/**
	 * 用于检查主体内容是否包含未知的编码方式，例如不是"identity"或"gzip"。
	 * @param headers
	 * @return
	 */
	private static boolean bodyHasUnknownEncoding(Headers headers) {
		String contentEncoding = headers.get("Content-Encoding");
		return contentEncoding != null
				&& !contentEncoding.equalsIgnoreCase("identity")
				&& !contentEncoding.equalsIgnoreCase("gzip");
	}
}