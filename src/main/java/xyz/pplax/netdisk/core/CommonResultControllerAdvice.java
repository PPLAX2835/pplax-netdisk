package xyz.pplax.netdisk.core;

import xyz.pplax.netdisk.core.util.AjaxJson;
import org.slf4j.MDC;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * 全局响应结果处理增强类
 * 用于在响应体写出之前对响应结果进行增强处理
 */
@ControllerAdvice
public class CommonResultControllerAdvice implements ResponseBodyAdvice<Object> {

	/**
	 * 确定是否要应用此增强器。
	 *
	 * @param returnType     方法的返回类型信息
	 * @param converterType  使用的HttpMessageConverter的类型
	 * @return 如果应该应用此增强器，则返回true；否则返回false。
	 */
	@Override
	public boolean supports(MethodParameter returnType,
							@NonNull Class<? extends HttpMessageConverter<?>> converterType) {
		// 判断是否应该应用此增强器，通常检查返回类型和使用的消息转换器类型
		// 只有当使用Jackson2HttpMessageConverter时才应用此增强器
		return AbstractJackson2HttpMessageConverter.class.isAssignableFrom(converterType);
	}

	/**
	 * 在响应体写出之前对响应结果进行增强处理。
	 *
	 * @param body            响应体内容
	 * @param returnType      方法的返回类型信息
	 * @param contentType     响应的内容类型
	 * @param converterType   使用的HttpMessageConverter的类型
	 * @param request         当前HTTP请求对象
	 * @param response        当前HTTP响应对象
	 * @return 经过增强处理后的响应体内容
	 */
	@Override
	@NonNull
	public final Object beforeBodyWrite(@Nullable Object body,
										@NonNull MethodParameter returnType,
										@NonNull MediaType contentType,
										@NonNull Class<? extends HttpMessageConverter<?>> converterType,
										@NonNull ServerHttpRequest request,
										@NonNull ServerHttpResponse response) {
		// 获取或创建响应体的容器，使用MappingJacksonValue进行处理
		MappingJacksonValue container = getOrCreateContainer(body);
		// The contain body will never be null
		// 在将响应体写出之前，进行内部的增强处理
		beforeBodyWriteInternal(container, contentType, returnType, request, response);
		return container;
	}

	/**
	 * Wrap the body in a {@link MappingJacksonValue} value container (for providing
	 * additional serialization instructions) or simply cast it if already wrapped.
	 * 获取或创建响应体的容器，用于提供额外的序列化指令或者直接将响应体包装在容器中
	 */
	private MappingJacksonValue getOrCreateContainer(Object body) {
		return body instanceof MappingJacksonValue ? (MappingJacksonValue) body :
				new MappingJacksonValue(body);
	}

	/**
	 * 内部方法，用于在将响应体写出之前对响应体进行进一步的增强处理。
	 *
	 * @param bodyContainer 响应体的容器
	 * @param contentType   响应的内容类型
	 * @param returnType    方法的返回类型信息
	 * @param request       当前HTTP请求对象
	 * @param response      当前HTTP响应对象
	 */
	private void beforeBodyWriteInternal(MappingJacksonValue bodyContainer,
										 MediaType contentType,
										 MethodParameter returnType,
										 ServerHttpRequest request,
										 ServerHttpResponse response) {
		// Get return body
		Object returnBody = bodyContainer.getValue();

		if (returnBody instanceof AjaxJson) {
			// If the return body is instance of BaseResponse, then just do nothing
			AjaxJson<?> baseResponse = (AjaxJson<?>) returnBody;
			baseResponse.setTraceId(MDC.get("traceId"));
		}
	}

}