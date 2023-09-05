package xyz.pplax.pplaxnetdisk.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import xyz.pplax.pplaxnetdisk.domain.UploadTaskDetail;

import java.util.List;

@Mapper
public interface UploadTaskDetailMapper extends BaseMapper<UploadTaskDetail> {
    List<Integer> selectUploadedChunkNumList(String identifier);
}
