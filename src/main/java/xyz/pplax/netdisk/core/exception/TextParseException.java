package xyz.pplax.netdisk.core.exception;

/**
 * 文件解析异常
 */
public class TextParseException extends PPLAXRuntimeException {

    public TextParseException(String message) {
        super(message);
    }
    
    public TextParseException(String message, Throwable cause) {
        super(message, cause);
    }
}