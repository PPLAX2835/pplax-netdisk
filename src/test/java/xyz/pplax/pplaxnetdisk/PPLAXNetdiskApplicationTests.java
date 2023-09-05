package xyz.pplax.pplaxnetdisk;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.pplax.pplaxnetdisk.domain.*;
import xyz.pplax.pplaxnetdisk.io.PPLAXFile;
import xyz.pplax.pplaxnetdisk.mapper.*;
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

    @Autowired
    ImageMapper imageMapper;
    @Test
    void PPLAXImageMapperTest() {
        Image image = imageMapper.selectById(1);
        System.out.println(image);
    }

    @Autowired
    MusicMapper musicMapper;
    @Test
    void PPLAXMusicMapperTest() {
        Music music = musicMapper.selectById(1);
        System.out.println(music);
    }

    @Autowired
    OperationLogMapper operationLogMapper;
    @Test
    void PPLAXOperationLogMapperTest() {
        OperationLog operationLog = operationLogMapper.selectById(1);
        System.out.println(operationLog);
    }

    @Autowired
    PictureFileMapper pictureFileMapper;
    @Test
    void PPLAXPictureFileMapperTest() {
        PictureFile pictureFile = pictureFileMapper.selectById(1);
        System.out.println(pictureFile);
    }

    @Autowired
    StorageMapper storageMapper;
    @Test
    void PPLAXStorageMapperTest() {
        Storage storage = storageMapper.selectById(1);
        System.out.println(storage);
    }

    @Autowired
    SysParamMapper sysParamMapper;
    @Test
    void PPLAXSysParamMapperTest() {
        SysParam sysParam = sysParamMapper.selectById(1);
        System.out.println(sysParam);
    }

    @Autowired
    UploadTaskMapper uploadTaskMapper;
    @Test
    void PPLAXUploadTaskMapperTest() {
        UploadTask uploadTask = uploadTaskMapper.selectById(1);
        System.out.println(uploadTask);
    }

    @Autowired
    UserLoginInfoMapper userLoginInfoMapper;
    @Test
    void PPLAXUserLoginInfoMapperTest() {
        UserLoginInfo userLoginInfo = userLoginInfoMapper.selectById(1);
        System.out.println(userLoginInfo);
    }


}
