package xyz.pplax.pplaxnetdisk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import xyz.pplax.pplaxnetdisk.service.CommonFileService;
import xyz.pplax.pplaxnetdisk.domain.CommonFile;
import xyz.pplax.pplaxnetdisk.mapper.CommonFileMapper;
import xyz.pplax.pplaxnetdisk.vo.commonfile.CommonFileListVo;
import xyz.pplax.pplaxnetdisk.vo.commonfile.CommonFileUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
@Transactional(rollbackFor=Exception.class)
public class CommonFileServiceImpl extends ServiceImpl<CommonFileMapper, CommonFile> implements CommonFileService {

    @Autowired
    CommonFileMapper commonFileMapper;

    @Override
    public List<CommonFileUser> selectCommonFileUser(String userId) {
        return commonFileMapper.selectCommonFileUser(Long.valueOf(userId));
    }

    @Override
    public List<CommonFileListVo> selectCommonFileByUser(String userId, String sessionUserId) {
        return commonFileMapper.selectCommonFileByUser(userId, sessionUserId);
    }


}
