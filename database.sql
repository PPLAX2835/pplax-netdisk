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

