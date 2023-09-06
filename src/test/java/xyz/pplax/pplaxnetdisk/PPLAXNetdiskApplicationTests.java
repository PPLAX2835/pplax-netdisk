package xyz.pplax.pplaxnetdisk;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.pplax.pplaxnetdisk.domain.*;
import xyz.pplax.pplaxnetdisk.domain.user.Role;
import xyz.pplax.pplaxnetdisk.domain.user.User;
import xyz.pplax.pplaxnetdisk.dto.notice.NoticeListDTO;
import xyz.pplax.pplaxnetdisk.io.PPLAXFile;
import xyz.pplax.pplaxnetdisk.mapper.*;
import xyz.pplax.pplaxnetdisk.service.CommonFileService;
import xyz.pplax.pplaxnetdisk.service.NoticeService;
import xyz.pplax.pplaxnetdisk.service.OperationLogService;
import xyz.pplax.pplaxnetdisk.vo.commonfile.CommonFileListVo;
import xyz.pplax.pplaxnetdisk.vo.commonfile.CommonFileUser;
import xyz.pplax.pplaxnetdisk.vo.file.FileListVO;
import xyz.pplax.pplaxnetdisk.vo.file.RecoveryFileListVo;
import xyz.pplax.pplaxnetdisk.vo.share.ShareFileListVO;
import xyz.pplax.pplaxnetdisk.vo.share.ShareListVO;

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
        List<CommonFileUser> commonFileUsers = commonFileMapper.selectCommonFileUser(1L);
        List<CommonFileListVo> commonFileListVos = commonFileMapper.selectCommonFileByUser("1", "1");
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
        List<String> strings = fileTypeMapper.selectExtendNameByFileType(2);
        System.out.println(fileType);
        System.out.println(strings);
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

    @Autowired
    NoticeMapper noticeMapper;
    @Test
    void PPLAXNoticeMapperTest() {
        NoticeListDTO noticeListDTO = new NoticeListDTO();
        noticeListDTO.setBeginTime("2002-03-07");
        noticeListDTO.setPage(1);
        noticeListDTO.setEndTime("2030-07-08");
        noticeListDTO.setPlatform(1);
        noticeListDTO.setPublisher(1l);
        noticeListDTO.setTitle("PPLAX");
        noticeListDTO.setPageSize(10);
        Page<Notice> page = new Page<>(noticeListDTO.getPage(), noticeListDTO.getPageSize());

        IPage<Notice> noticeIPage = noticeMapper.selectPageVo(page, noticeListDTO);
        System.out.println(noticeIPage);
    }

    @Autowired
    RecoveryFileMapper recoveryFileMapper;
    @Test
    void PPLAXRecoveryFileMapperTest() {

        List<RecoveryFileListVo> recoveryFileListVos = recoveryFileMapper.selectRecoveryFileList("1");
        System.out.println(recoveryFileListVos);
    }

    @Autowired
    ShareFileMapper shareFileMapper;
    @Test
    void PPLAXShareFileMapperTest() {

        List<ShareFileListVO> listVOS = shareFileMapper.selectShareFileList("lax", "/");
        System.out.println(listVOS);
    }

    @Autowired
    ShareMapper shareMapper;
    @Test
    void PPLAXShareMapperMapperTest() {

        List<ShareListVO> shareListVOS = shareMapper.selectShareList("/", "1", 10L, 1L, "1");
        int i = shareMapper.selectShareListTotalCount("/", "1", "1");
        System.out.println(shareListVOS);
        System.out.println(i);
    }

    @Autowired
    UploadTaskDetailMapper uploadTaskDetailMapper;
    @Test
    void PPLAXUploadTaskDetailMapperTest() {
        List<Integer> integers = uploadTaskDetailMapper.selectUploadedChunkNumList("1");
        System.out.println(integers);
    }

    @Autowired
    UserFileMapper userFileMapper;
    @Test
    void PPLAXUserFileMapperTest() {
        Page<FileListVO> page = new Page<>(0, 10);
        List<UserFile> userFiles = userFileMapper.selectUserFileByLikeRightFilePath("/", "1");
        IPage<FileListVO> fileListVOIPage = userFileMapper.selectPageVo(page, new UserFile(), 1);
        Long aLong = userFileMapper.selectStorageSizeByUserId("1");


        System.out.println(userFiles);
        System.out.println(fileListVOIPage);
        System.out.println(aLong);
    }

    @Autowired
    UserMapper userMapper;
    @Test
    void PPLAXUserMapperTest() {
//        User user = new User();
//        user.setUserid("23412");
//        user.setUsername("PPLAX");
//        user.setSalt("pplax");
//        user.setPassword("fadsadfs adfs adfsfadsadfs ");
//        user.setTelephone("18830292772");
//        user.setSex("1");
//        user.setImageurl("/");
//        user.setRegistertime("2023-04-08");
//
//        int i = userMapper.insertUser(user);
//        List<Role> roles = userMapper.selectRoleListByUserId("23412");
//        String s = userMapper.selectSaltByTelephone("18830292772");
//        User user1 = userMapper.selectUserByTelephoneAndPassword("18830292772", "fadsadfs adfs adfsfadsadfs ");
//
//        System.out.println(i);
//        System.out.println(roles);
//        System.out.println(s);
//        System.out.println(user1);
    }

    @Autowired
    CommonFileService commonFileService;
    @Test
    void PPLAXCommonFileServiceTest() {
        List<CommonFileListVo> commonFileListVos = commonFileService.selectCommonFileByUser("1", "1");
        List<CommonFileUser> commonFileUsers = commonFileService.selectCommonFileUser("1");

        System.out.println(commonFileUsers);
        System.out.println(commonFileListVos);
    }

    @Autowired
    NoticeService noticeService;
    @Test
    void PPLAXNoticeServiceTest() {
        NoticeListDTO noticeListDTO = new NoticeListDTO();
        noticeListDTO.setBeginTime("2002-03-07");
        noticeListDTO.setPage(1);
        noticeListDTO.setEndTime("2030-07-08");
        noticeListDTO.setPlatform(1);
        noticeListDTO.setPublisher(1l);
        noticeListDTO.setTitle("PPLAX");
        noticeListDTO.setPageSize(10);
        IPage<Notice> noticeIPage = noticeService.selectUserPage(noticeListDTO);
        System.out.println(noticeIPage);
    }


    @Autowired
    OperationLogService operationLogService;
    @Test
    void PPLAXOperationLogServiceTest() {
        IPage<OperationLog> operationLogIPage = operationLogService.selectOperationLogPage(1, 10);
        List<OperationLog> operationLogs = operationLogService.selectOperationLog();
        System.out.println(operationLogIPage);
        System.out.println(operationLogs);
    }

}
