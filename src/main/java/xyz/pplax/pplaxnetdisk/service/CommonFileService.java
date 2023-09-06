package xyz.pplax.pplaxnetdisk.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;
import xyz.pplax.pplaxnetdisk.domain.CommonFile;
import xyz.pplax.pplaxnetdisk.vo.commonfile.CommonFileListVo;
import xyz.pplax.pplaxnetdisk.vo.commonfile.CommonFileUser;

import java.util.List;

@Service
public interface CommonFileService extends IService<CommonFile> {
    List<CommonFileUser> selectCommonFileUser(String userId);
    List<CommonFileListVo> selectCommonFileByUser(String userId, String sessionUserId);
}