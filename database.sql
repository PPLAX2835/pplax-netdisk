drop database if exists pplax_file;

create database pplax_file
default character set utf8
default collate utf8_general_ci;

use pplax_file;

create table commonfile
(
    commonFileId varchar(20) not null
        primary key,
    userFileId   bigint      null comment '用户文件id'
);

create table file
(
    fileId       varchar(20)  not null
        primary key,
    createTime   varchar(25)  null comment '创建时间',
    createUserId varchar(20)  null comment '创建用户id',
    fileSize     bigint       null comment '文件大小',
    fileStatus   int          null comment '文件状态(0-失效，1-生效)',
    fileUrl      varchar(500) null comment '文件url',
    identifier   varchar(200) null comment 'md5唯一标识',
    modifyTime   varchar(25)  null comment '修改时间',
    modifyUserId varchar(20)  null comment '修改用户id',
    storageType  int          null comment '存储类型'
);

create table fileclassification
(
    fileClassificationId bigint auto_increment
        primary key,
    fileExtendName       varchar(25) null comment '文件扩展名',
    fileTypeId           bigint      null comment '文件类型id'
);

create table fileextend
(
    fileExtendName   varchar(25)  not null
        primary key,
    fileExtendDesc   varchar(25)  null comment '文件扩展名描述',
    fileExtendImgUrl varchar(100) null comment '文件扩展名预览图'
);

create table filepermission
(
    filePermissionId   bigint auto_increment
        primary key,
    commonFileId       varchar(20) null comment '共享文件id',
    filePermissionCode int         null comment '用户对文件的权限码',
    userId             bigint      null comment '用户id'
);

create table filetype
(
    fileTypeId   int         not null
        primary key,
    fileTypeName varchar(50) null comment '文件类型名',
    orderNum     int         null comment '次序'
);

create table hibernate_sequence
(
    next_val bigint null
);

create table image
(
    imageId     bigint auto_increment
        primary key,
    fileId      varchar(20) null comment '文件id',
    imageHeight int         null comment '图像的高',
    imageWidth  int         null comment '图像的宽'
);

create table music
(
    musicId        bigint auto_increment
        primary key,
    album          varchar(255)   null,
    albumArtist    varchar(255)   null,
    albumImage     mediumblob     null,
    artist         varchar(255)   null,
    comment        varchar(255)   null,
    composer       varchar(255)   null,
    copyright      varchar(255)   null,
    encoder        varchar(255)   null,
    fileId         bigint         null comment '文件id',
    genre          varchar(255)   null,
    lyrics         varchar(10000) null comment '歌词',
    originalArtist varchar(255)   null,
    publicer       varchar(255)   null,
    title          varchar(255)   null,
    track          varchar(255)   null,
    trackLength    float          null,
    url            varchar(255)   null,
    year           varchar(255)   null
);

create table notice
(
    noticeId        bigint auto_increment
        primary key,
    content         longtext     null comment 'html内容',
    createTime      varchar(25)  null comment '创建时间',
    createUserId    bigint       null comment '创建用户id',
    isLongValidData int          null comment '是否长期有效(0-否,1-是)',
    markdownContent longtext     null comment 'markdown原文',
    modifyTime      varchar(25)  null comment '修改时间',
    modifyUserId    bigint       null comment '修改用户id',
    platform        int          null comment '平台(1-社区,2-管理端,3-网盘,4-股票)',
    title           varchar(100) not null comment '标题',
    validDateTime   varchar(25)  null comment '有效时间'
);

create table operationlog
(
    operationLogId bigint auto_increment
        primary key,
    detail         varchar(100) null comment '操作详情',
    logLevel       int          null,
    operation      varchar(50)  null comment '操作',
    operationObj   varchar(255) null,
    platform       int          null comment '平台(1-社区,2-管理端,3-网盘,4-股票)',
    requestMethod  varchar(255) null,
    requestURI     varchar(255) null,
    result         varchar(20)  null comment '操作结果',
    source         varchar(255) null,
    terminal       varchar(20)  null comment '终端ip地址',
    time           varchar(25)  null comment '操作时间',
    userId         varchar(20)  null comment '用户id'
);

create table permission
(
    permissionId   bigint auto_increment
        primary key,
    createTime     varchar(30) null comment '创建时间',
    createUserId   bigint      null comment '创建用户id',
    modifyTime     varchar(30) null comment '修改时间',
    modifyUserId   bigint      null comment '修改用户id',
    orderNum       int         null comment '次序',
    parentId       bigint      null comment '父编号',
    permissionCode varchar(30) null comment '权限标识码',
    permissionName varchar(30) null comment '权限名称',
    resourceType   int         null comment '资源类型'
);

create table picturefile
(
    pictureFileId bigint auto_increment
        primary key,
    createTime    varchar(25)  null comment '创建时间',
    createUserId  bigint       null comment '创建用户id',
    extendName    varchar(100) null comment '扩展名',
    fileName      varchar(100) null comment '文件名',
    fileSize      bigint       null comment '文件大小',
    fileUrl       varchar(500) null comment '文件url',
    modifyTime    varchar(25)  null comment '修改时间',
    modifyUserId  bigint       null comment '修改用户id',
    storageType   int          null comment '存储类型',
    userId        bigint       null comment '用户id'
);

create table recoveryfile
(
    recoveryFileId bigint auto_increment
        primary key,
    deleteBatchNum varchar(50) null comment '删除批次号',
    deleteTime     varchar(25) null comment '删除时间',
    userFileId     bigint      null comment '用户文件id',
    constraint user_file_id_index3
        unique (userFileId)
);

create table role
(
    roleId       bigint auto_increment
        primary key,
    available    int          null comment '是否可用(0-不可用,1-可用)',
    createTime   varchar(30)  null comment '创建时间',
    createUserId bigint       null comment '创建用户id',
    description  varchar(100) null comment '角色描述',
    modifyTime   varchar(30)  null comment '修改时间',
    modifyUserId bigint       null comment '修改用户id',
    roleName     varchar(20)  null comment '角色名'
);

create table role_permission
(
    id           bigint auto_increment
        primary key,
    permissionId bigint null comment '权限id',
    roleId       bigint null comment '角色id'
);

create table share
(
    shareId        varchar(255) not null
        primary key,
    endTime        varchar(30)  null comment '失效时间',
    extractionCode varchar(10)  null comment '提取码',
    shareBatchNum  varchar(40)  null comment '分享批次号',
    shareStatus    int          null comment '分享状态(0正常,1已失效,2已撤销)',
    shareTime      varchar(30)  null comment '分享时间',
    shareType      int          null comment '分享类型(0公共,1私密,2好友)',
    userId         varchar(20)  null comment '用户id'
);

create table sharefile
(
    shareFileId   varchar(255) not null
        primary key,
    shareBatchNum varchar(50)  null comment '分享批次号',
    shareFilePath varchar(100) null comment '分享文件路径',
    userFileId    varchar(20)  null comment '用户文件id'
);

create table storage
(
    storageId        bigint auto_increment
        primary key,
    modifyTime       varchar(25) null comment '修改时间',
    modifyUserId     bigint      null comment '修改用户id',
    storageSize      bigint      null comment '占用存储大小',
    totalStorageSize bigint      null comment '总存储大小',
    userId           varchar(20) null,
    constraint userid_index
        unique (userId)
);

create table sysparam
(
    sysParamId    bigint auto_increment
        primary key,
    groupName     varchar(50) null,
    sysParamDesc  varchar(50) null,
    sysParamKey   varchar(50) null,
    sysParamValue varchar(50) null
);

create table uploadtask
(
    uploadTaskId bigint auto_increment
        primary key,
    extendName   varchar(100) null comment '扩展名',
    fileName     varchar(100) null comment '文件名称',
    filePath     varchar(500) null comment '文件路径',
    identifier   varchar(200) null comment 'md5唯一标识',
    uploadStatus int          null comment '上传状态(1-成功,0-失败或未完成)',
    uploadTime   varchar(25)  null comment '上传时间',
    userId       bigint       null comment '用户id'
);

create table uploadtaskdetail
(
    uploadTaskDetailId bigint auto_increment
        primary key,
    chunkNumber        int          null comment '当前分片数',
    chunkSize          bigint       null comment '当前分片大小',
    filePath           varchar(500) null comment '文件路径',
    filename           varchar(100) null comment '文件名称',
    identifier         varchar(200) null comment '文件md5唯一标识',
    relativePath       varchar(500) null comment '文件相对路径',
    totalChunks        int          null comment '文件总分片数',
    totalSize          bigint       null comment '文件总大小'
);

create table user
(
    userId        varchar(20)   not null
        primary key,
    addrArea      varchar(10)   null comment '区',
    addrCity      varchar(10)   null comment '市',
    addrProvince  varchar(10)   null comment '省',
    available     int           null comment '是否可用(0-不可用,1-可用)',
    birthday      varchar(30)   null comment '生日',
    email         varchar(100)  null comment '邮箱',
    imageUrl      varchar(100)  null comment '头像',
    industry      varchar(50)   null comment '行业',
    intro         varchar(5000) null comment '个人简介',
    lastLoginTime varchar(30)   null comment '最后登录时间',
    modifyTime    varchar(30)   null comment '修改时间',
    modifyUserId  bigint        null comment '修改用户id',
    password      varchar(35)   null comment '密码',
    position      varchar(50)   null comment '地区',
    registerTime  varchar(30)   null comment '注册时间',
    salt          varchar(20)   null comment '盐',
    sex           varchar(3)    null comment '性别',
    telephone     varchar(15)   null comment '手机号',
    username      varchar(30)   null comment '用户名',
    wxOpenId      varchar(28)   null comment 'open id'
);

create table user_role
(
    userRoleId bigint auto_increment
        primary key,
    roleId     bigint       null,
    userId     varchar(255) null
);

create table userfile
(
    userFileId     varchar(20)             not null
        primary key,
    createTime     varchar(30)             null comment '创建时间',
    createUserId   varchar(20)             null comment '创建用户id',
    deleteBatchNum varchar(50)             null comment '删除批次号',
    deleteFlag     int                     null comment '删除标识(0-未删除，1-已删除)',
    deleteTime     varchar(25)             null comment '删除时间',
    extendName     varchar(100) default '' null comment '扩展名',
    fileId         varchar(20)             null comment '文件id',
    fileName       varchar(100)            null comment '文件名',
    filePath       varchar(500)            null comment '文件路径',
    isDir          int                     null comment '是否是目录(0-否,1-是)',
    modifyTime     varchar(30)             null comment '修改时间',
    modifyUserId   varchar(20)             null comment '修改用户id',
    uploadTime     varchar(25)             null comment '修改时间',
    userId         bigint                  null comment '用户id',
    constraint fileindex
        unique (userId, filePath, fileName, extendName, deleteFlag, isDir)
);

create table userlogininfo
(
    userLoginId   bigint auto_increment
        primary key,
    userId        varchar(20) null comment '用户id',
    userloginDate varchar(30) null comment '用户登录日期'
);

delete from user where userId = 1;
insert into user (userId, username, telephone, salt, password, available) values (1, 'admin', 'admin', 'admin', 'df655ad8d3229f3269fad2a8bab59b6c', 1);

delete from role where roleId in (1, 2);
INSERT INTO `role` (`roleId`, `available`, `description`, `roleName`, `createTime`, `createUserId`, `modifyTime`, `modifyUserId`) VALUES (1, 1, '超级管理员', '超级管理员', NULL, NULL, '2021-11-10 20:46:06', NULL);
INSERT INTO `role` (`roleId`, `available`, `description`, `roleName`, `createTime`, `createUserId`, `modifyTime`, `modifyUserId`) VALUES (2, 1, '普通用户', '普通用户', NULL, NULL, NULL, NULL);

delete from sysparam where sysParamId in (1, 2, 3);
insert into sysparam (sysParamId, sysParamKey, sysParamValue, sysParamDesc) values (1, 'totalStorageSize', '1024', '总存储大小（单位M）');
insert into sysparam (sysParamId, sysParamKey, sysParamValue, sysParamDesc) values (2, 'initDataFlag', '1', '系统初始化数据标识');
insert into sysparam (sysParamId, sysParamKey, sysParamValue, sysParamDesc) values (3, 'version', '1.1.2', '当前脚本的版本号');

delete from filetype where fileTypeId in (0, 1, 2, 3, 4, 5);
INSERT INTO `filetype` (`fileTypeId`, `fileTypeName`) VALUES (0, '全部');
INSERT INTO `filetype` (`fileTypeId`, `fileTypeName`) VALUES (1, '图片');
INSERT INTO `filetype` (`fileTypeId`, `fileTypeName`) VALUES (2, '文档');
INSERT INTO `filetype` (`fileTypeId`, `fileTypeName`) VALUES (3, '视频');
INSERT INTO `filetype` (`fileTypeId`, `fileTypeName`) VALUES (4, '音乐');
INSERT INTO `filetype` (`fileTypeId`, `fileTypeName`) VALUES (5, '其他');

delete from fileextend where 1 = 1;
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('bmp');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('jpg');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('png');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('tif');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('gif');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('jpeg');

INSERT INTO `fileextend` (`fileExtendName`) VALUES ('doc');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('docx');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('docm');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('dot');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('dotx');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('dotm');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('odt');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('fodt');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('ott');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('rtf');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('txt');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('html');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('htm');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('mht');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('xml');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('pdf');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('djvu');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('fb2');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('epub');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('xps');

INSERT INTO `fileextend` (`fileExtendName`) VALUES ('xls');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('xlsx');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('xlsm');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('xlt');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('xltx');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('xltm');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('ods');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('fods');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('ots');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('csv');

INSERT INTO `fileextend` (`fileExtendName`) VALUES ('pps');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('ppsx');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('ppsm');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('ppt');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('pptx');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('pptm');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('pot');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('potx');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('potm');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('odp');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('fodp');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('otp');

INSERT INTO `fileextend` (`fileExtendName`) VALUES ('hlp');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('wps');

INSERT INTO `fileextend` (`fileExtendName`) VALUES ('avi');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('mp4');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('mpg');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('mov');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('swf');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('wav');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('aif');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('au');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('mp3');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('ram');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('wma');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('mmf');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('amr');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('aac');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('flac');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('java');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('js');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('css');
INSERT INTO `fileextend` (`fileExtendName`) VALUES ('json');

delete from fileclassification where 1 = 1;
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (1, 1, 'bmp');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (2, 1, 'jpg');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (3, 1, 'png');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (4, 1, 'tif');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (5, 1, 'gif');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (6, 1, 'jpeg');

INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (7, 2, 'doc');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (8, 2, 'docx');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (9, 2, 'docm');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (10, 2, 'dot');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (11, 2, 'dotx');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (12, 2, 'dotm');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (13, 2, 'odt');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (14, 2, 'fodt');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (15, 2, 'ott');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (16, 2, 'rtf');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (17, 2, 'txt');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (18, 2, 'html');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (19, 2, 'htm');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (20, 2, 'mht');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (21, 2, 'xml');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (22, 2, 'pdf');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (23, 2, 'djvu');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (24, 2, 'fb2');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (25, 2, 'epub');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (26, 2, 'xps');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (27, 2, 'xls');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (28, 2, 'xlsx');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (29, 2, 'xlsm');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (30, 2, 'xlt');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (31, 2, 'xltx');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (32, 2, 'xltm');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (33, 2, 'ods');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (34, 2, 'fods');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (35, 2, 'ots');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (36, 2, 'csv');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (37, 2, 'pps');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (38, 2, 'ppsx');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (39, 2, 'ppsm');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (40, 2, 'ppt');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (41, 2, 'pptx');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (42, 2, 'pptm');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (43, 2, 'pot');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (44, 2, 'potx');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (45, 2, 'potm');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (46, 2, 'odp');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (47, 2, 'fodp');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (48, 2, 'otp');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (49, 2, 'hlp');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (50, 2, 'wps');

INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (51, 2, 'java');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (52, 2, 'js');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (53, 2, 'css');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (54, 2, 'json');


INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (55, 3, 'avi');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (56, 3, 'mp4');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (57, 3, 'mpg');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (58, 3, 'mov');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (59, 3, 'swf');

INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (60, 4, 'wav');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (61, 4, 'aif');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (62, 4, 'au');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (63, 4, 'mp3');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (64, 4, 'ram');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (65, 4, 'wma');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (66, 4, 'mmf');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (67, 4, 'amr');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (68, 4, 'aac');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (69, 4, 'flac');

INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (70, 2, 'md');
INSERT INTO `fileclassification` (`fileClassificationId`, `fileTypeId`, `fileExtendName`) VALUES (71, 2, 'markdown');
