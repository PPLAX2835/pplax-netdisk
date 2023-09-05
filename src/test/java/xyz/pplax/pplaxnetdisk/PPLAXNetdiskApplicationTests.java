package xyz.pplax.pplaxnetdisk;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.pplax.pplaxnetdisk.domain.CommonFile;
import xyz.pplax.pplaxnetdisk.domain.File;
import xyz.pplax.pplaxnetdisk.domain.FilePermission;
import xyz.pplax.pplaxnetdisk.domain.FileType;
import xyz.pplax.pplaxnetdisk.io.PPLAXFile;
import xyz.pplax.pplaxnetdisk.mapper.CommonFileMapper;
import xyz.pplax.pplaxnetdisk.mapper.FileMapper;
import xyz.pplax.pplaxnetdisk.mapper.FilePermissionMapper;
import xyz.pplax.pplaxnetdisk.mapper.FileTypeMapper;
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
        CommonFile commonFile = commonFileMapper.selectById(1);
        System.out.println(commonFileUsers.toString());
        System.out.println(commonFileListVos.toString());
        System.out.println(commonFile);
    }

    @Autowired
    FilePermissionMapper filePermissionMapper;
    @Test
    void PPLAXFilePermissionMapperTest() {
        FilePermission filePermission = filePermissionMapper.selectById(1);
        System.out.println(filePermission);
    }


    @Autowired
    FileMapper fileMapper;
    @Test
    void PPLAXFileMapperTest() {
        File file = fileMapper.selectById(1);
        System.out.println(file);
    }

    @Autowired
    FileTypeMapper fileTypeMapper;
    @Test
    void PPLAXFileTypeMapperTest() {
        FileType fileType = fileTypeMapper.selectById(1);
        System.out.println(fileType);
    }


}
