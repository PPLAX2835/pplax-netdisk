package xyz.pplax.pplaxnetdisk.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.pplax.pplaxnetdisk.domain.RecoveryFile;
import xyz.pplax.pplaxnetdisk.vo.file.RecoveryFileListVo;

import java.util.List;

public interface RecoveryFileService extends IService<RecoveryFile> {
    void deleteUserFileByDeleteBatchNum(String deleteBatchNum);
    void restoreFile(String deleteBatchNum, String filePath, String sessionUserId);
    List<RecoveryFileListVo> selectRecoveryFileList(String userId);
}
