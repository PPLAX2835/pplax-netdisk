package xyz.pplax.pplaxnetdisk.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import xyz.pplax.pplaxnetdisk.domain.Notice;
import xyz.pplax.pplaxnetdisk.dto.notice.NoticeListDTO;

public interface NoticeService extends IService<Notice> {


    IPage<Notice> selectUserPage(NoticeListDTO noticeListDTO);

}
