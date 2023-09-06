package xyz.pplax.pplaxnetdisk.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.pplax.pplaxnetdisk.domain.Share;
import xyz.pplax.pplaxnetdisk.dto.sharefile.ShareListDTO;
import xyz.pplax.pplaxnetdisk.vo.share.ShareListVO;

import java.util.List;

public interface ShareService  extends IService<Share> {
    List<ShareListVO> selectShareList(ShareListDTO shareListDTO, String userId);
    int selectShareListTotalCount(ShareListDTO shareListDTO, String userId);
}
