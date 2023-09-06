package xyz.pplax.pplaxnetdisk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import xyz.pplax.pplaxnetdisk.service.ShareFileService;
import xyz.pplax.pplaxnetdisk.domain.ShareFile;
import xyz.pplax.pplaxnetdisk.mapper.ShareFileMapper;
import xyz.pplax.pplaxnetdisk.vo.share.ShareFileListVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
@Transactional(rollbackFor=Exception.class)
public class ShareFileServiceImpl extends ServiceImpl<ShareFileMapper, ShareFile> implements ShareFileService {
    @Autowired
    ShareFileMapper shareFileMapper;

    @Override
    public List<ShareFileListVO> selectShareFileList(String shareBatchNum, String filePath) {
        return shareFileMapper.selectShareFileList(shareBatchNum, filePath);
    }

}
