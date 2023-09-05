package xyz.pplax.pplaxnetdisk.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import xyz.pplax.pplaxnetdisk.domain.ShareFile;
import xyz.pplax.pplaxnetdisk.vo.share.ShareFileListVO;

import java.util.List;

@Mapper
public interface ShareFileMapper extends BaseMapper<ShareFile> {
    List<ShareFileListVO> selectShareFileList(@Param("shareBatchNum") String shareBatchNum, @Param("shareFilePath") String filePath);
}
