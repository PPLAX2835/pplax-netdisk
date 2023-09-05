package xyz.pplax.pplaxnetdisk;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.pplax.pplaxnetdisk.io.PPLAXFile;
import xyz.pplax.pplaxnetdisk.mapper.CommonFileMapper;
import xyz.pplax.pplaxnetdisk.vo.commonfile.CommonFileListVo;
import xyz.pplax.pplaxnetdisk.vo.commonfile.CommonFileUser;

import java.util.List;

@SpringBootTest
class PPLAXNetdiskApplicationTests {

    @Test
    void firstTest() {
        System.out.println("Hello World!");
    }

    @Test
    void PPLAXFileTest() {
        PPLAXFile pplaxFile = new PPLAXFile("G:\\tmp", true);
        System.out.println(pplaxFile.getParent());
    }

    @Autowired
    CommonFileMapper commonFileMapper;
    @Test
    void PPLAXCommonFileMapperTest() {
        List<CommonFileUser> commonFileUsers = commonFileMapper.selectCommonFileUser(1l);
        List<CommonFileListVo> commonFileListVos = commonFileMapper.selectCommonFileByUser(1l, 1l);
        System.out.println(commonFileUsers.toString());
        System.out.println(commonFileListVos.toString());
    }

}
