package xyz.pplax.netdisk.core.exception;


public class PPLAXRuntimeException extends RuntimeException {
	
	public PPLAXRuntimeException(String message) {
		super(message);
	}
	
	public PPLAXRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}
}