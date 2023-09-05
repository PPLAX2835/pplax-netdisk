package xyz.pplax.pplaxnetdisk.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import xyz.pplax.pplaxnetdisk.domain.RecoveryFile;
import xyz.pplax.pplaxnetdisk.vo.file.RecoveryFileListVo;

import java.util.List;

@Mapper
public interface RecoveryFileMapper extends BaseMapper<RecoveryFile> {
    List<RecoveryFileListVo> selectRecoveryFileList(@Param("userId") String userId);
}
