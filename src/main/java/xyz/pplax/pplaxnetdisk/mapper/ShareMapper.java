package xyz.pplax.pplaxnetdisk.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import xyz.pplax.pplaxnetdisk.domain.Share;
import xyz.pplax.pplaxnetdisk.vo.share.ShareListVO;

import java.util.List;

@Mapper
public interface ShareMapper extends BaseMapper<Share> {

    List<ShareListVO> selectShareList(@Param("shareFilePath") String shareFilePath,@Param("shareBatchNum") String shareBatchNum,@Param("beginCount") Long beginCount,@Param("pageCount") Long pageCount,@Param("userId") String userId);
    int selectShareListTotalCount(@Param("shareFilePath")String shareFilePath,@Param("shareBatchNum")String shareBatchNum,@Param("userId") String userId);
}
