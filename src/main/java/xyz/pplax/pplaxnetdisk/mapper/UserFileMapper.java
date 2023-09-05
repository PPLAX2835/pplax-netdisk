package xyz.pplax.pplaxnetdisk.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import xyz.pplax.pplaxnetdisk.domain.UserFile;
import xyz.pplax.pplaxnetdisk.vo.file.FileListVO;

import java.util.List;

@Mapper
public interface UserFileMapper extends BaseMapper<UserFile> {

    List<UserFile> selectUserFileByLikeRightFilePath(@Param("filePath") String filePath, @Param("userId") String userId);

    IPage<FileListVO> selectPageVo(Page<?> page, @Param("userFile") UserFile userFile, @Param("fileTypeId") Integer fileTypeId);
    Long selectStorageSizeByUserId(@Param("userId") String userId);
}
