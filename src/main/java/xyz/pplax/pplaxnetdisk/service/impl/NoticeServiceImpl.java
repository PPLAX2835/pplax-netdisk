package xyz.pplax.pplaxnetdisk.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import xyz.pplax.pplaxnetdisk.service.NoticeService;
import xyz.pplax.pplaxnetdisk.domain.Notice;
import xyz.pplax.pplaxnetdisk.dto.notice.NoticeListDTO;
import xyz.pplax.pplaxnetdisk.mapper.NoticeMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class NoticeServiceImpl extends ServiceImpl<NoticeMapper, Notice> implements NoticeService {
    @Resource
    NoticeMapper noticeMapper;


    @Override
    public IPage<Notice> selectUserPage(NoticeListDTO noticeListDTO) {
        Page<Notice> page = new Page<>(noticeListDTO.getPage(), noticeListDTO.getPageSize());
        return noticeMapper.selectPageVo(page, noticeListDTO);
    }
}
