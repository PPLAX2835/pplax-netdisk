package xyz.pplax.pplaxnetdisk.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.pplax.pplaxnetdisk.domain.ShareFile;
import xyz.pplax.pplaxnetdisk.vo.share.ShareFileListVO;

import java.util.List;

public interface ShareFileService extends IService<ShareFile> {

    List<ShareFileListVO> selectShareFileList(String shareBatchNum, String filePath);
}
