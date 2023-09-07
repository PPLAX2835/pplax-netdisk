package xyz.pplax.netdisk.core.exception.file.init;

import xyz.pplax.netdisk.core.exception.StorageSourceException;
import xyz.pplax.netdisk.core.util.CodeMsg;

/**
 * 存储源初始化异常
 *
 * @author zhaojun
 */
public class InitializeStorageSourceException extends StorageSourceException {
    
    public InitializeStorageSourceException(CodeMsg codeMsg, Integer storageId, String message) {
        super(codeMsg, storageId, message);
    }
    
    public InitializeStorageSourceException(CodeMsg codeMsg, Integer storageId, String message, Throwable cause) {
        super(codeMsg, storageId, message, cause);
    }
    
}