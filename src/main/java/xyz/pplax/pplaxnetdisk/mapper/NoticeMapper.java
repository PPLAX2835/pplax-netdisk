package xyz.pplax.pplaxnetdisk.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import xyz.pplax.pplaxnetdisk.domain.Notice;
import xyz.pplax.pplaxnetdisk.dto.notice.NoticeListDTO;

@Mapper
public interface NoticeMapper extends BaseMapper<Notice> {

    IPage<Notice> selectPageVo(Page<?> page, @Param("noticeListDTO") NoticeListDTO noticeListDTO);

}
