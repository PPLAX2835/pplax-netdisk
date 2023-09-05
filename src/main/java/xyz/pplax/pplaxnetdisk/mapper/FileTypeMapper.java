package xyz.pplax.pplaxnetdisk.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import xyz.pplax.pplaxnetdisk.domain.FileType;

import java.util.List;

@Mapper
public interface FileTypeMapper extends BaseMapper<FileType> {
    List<String> selectExtendNameByFileType(@Param("fileTypeId") Integer fileTypeId);

}
