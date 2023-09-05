package xyz.pplax.pplaxnetdisk.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import xyz.pplax.pplaxnetdisk.domain.File;

import java.util.List;

@Mapper
public interface FileMapper extends BaseMapper<File> {


//    void batchInsertFile(List<File> fileList);

}
