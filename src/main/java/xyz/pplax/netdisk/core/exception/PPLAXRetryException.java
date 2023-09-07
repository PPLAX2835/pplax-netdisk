package xyz.pplax.netdisk.core.exception;

/**
 * @author zhaojun
 */
public class PPLAXRetryException extends RuntimeException {
	
	public PPLAXRetryException() {
	}
	
	public PPLAXRetryException(String message) {
		super(message);
	}
	
	public PPLAXRetryException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public PPLAXRetryException(Throwable cause) {
		super(cause);
	}
	
	public PPLAXRetryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}