package xyz.pplax.netdisk.core.exception.file.operator;

import xyz.pplax.netdisk.core.exception.StorageSourceException;
import xyz.pplax.netdisk.core.util.CodeMsg;
import lombok.Getter;

/**
 * 存储源文件操作异常
 * @author zhaojun
 */
@Getter
public class StorageSourceFileOperatorException extends StorageSourceException {
	
	public StorageSourceFileOperatorException(CodeMsg codeMsg, Integer storageId, String message, Throwable cause) {
		super(codeMsg, storageId, message, cause);
	}
	
}