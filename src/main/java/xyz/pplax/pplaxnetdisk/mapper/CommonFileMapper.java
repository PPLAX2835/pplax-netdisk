package xyz.pplax.pplaxnetdisk.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import xyz.pplax.pplaxnetdisk.domain.CommonFile;
import xyz.pplax.pplaxnetdisk.vo.commonfile.CommonFileListVo;
import xyz.pplax.pplaxnetdisk.vo.commonfile.CommonFileUser;

import java.util.List;

@Mapper
public interface CommonFileMapper extends BaseMapper<CommonFile> {
    List<CommonFileUser> selectCommonFileUser(@Param("userId") Long userId);
    List<CommonFileListVo> selectCommonFileByUser(@Param("userId") String userId, @Param("sessionUserId") String sessionUserId);

}
