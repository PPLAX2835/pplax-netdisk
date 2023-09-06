package xyz.pplax.pplaxnetdisk.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.pplax.pplaxnetdisk.domain.Storage;

public interface StorageService extends IService<Storage> {
    Long getTotalStorageSize(String userId);
    boolean checkStorage(String userId, Long fileSize);
}
