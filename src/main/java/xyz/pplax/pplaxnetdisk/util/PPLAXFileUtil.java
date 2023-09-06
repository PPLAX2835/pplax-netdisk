package xyz.pplax.pplaxnetdisk.util;

import cn.hutool.core.util.IdUtil;
import com.qiwenshare.common.util.DateUtil;
import com.qiwenshare.common.util.security.SessionUtil;
import xyz.pplax.pplaxnetdisk.domain.UserFile;
import xyz.pplax.pplaxnetdisk.io.PPLAXFile;

public class PPLAXFileUtil {


    public static UserFile getDir(String userId, String filePath, String fileName) {
        UserFile userFile = new UserFile();
        userFile.setUserfileid(IdUtil.getSnowflakeNextIdStr());
        userFile.setUserid(Long.valueOf(userId));
        userFile.setFileid(null);
        userFile.setFilename(fileName);
        userFile.setFilepath(PPLAXFile.formatPath(filePath));
        userFile.setExtendname(null);
        userFile.setIsdir(1);
        userFile.setUploadtime(DateUtil.getCurrentTime());
        userFile.setCreateuserid(SessionUtil.getUserId());
        userFile.setCreatetime(DateUtil.getCurrentTime());
        userFile.setDeleteflag(0);
        userFile.setDeletebatchnum(null);
        return userFile;
    }

    public static UserFile getFile(String userId, String fileId, String filePath, String fileName, String extendName) {
        UserFile userFile = new UserFile();
        userFile.setUserfileid(IdUtil.getSnowflakeNextIdStr());
        userFile.setUserid(Long.valueOf(userId));
        userFile.setFileid(fileId);
        userFile.setFilename(fileName);
        userFile.setFilepath(PPLAXFile.formatPath(filePath));
        userFile.setExtendname(extendName);
        userFile.setIsdir(0);
        userFile.setUploadtime(DateUtil.getCurrentTime());
        userFile.setCreatetime(DateUtil.getCurrentTime());
        userFile.setCreateuserid(SessionUtil.getUserId());
        userFile.setDeleteflag(0);
        userFile.setDeletebatchnum(null);
        return userFile;
    }

    public static UserFile searchFileParam(UserFile userFile) {
        UserFile param = new UserFile();
        param.setFilepath(PPLAXFile.formatPath(userFile.getFilepath()));
        param.setFilename(userFile.getFilename());
        param.setExtendname(userFile.getExtendname());
        param.setDeleteflag(0);
        param.setUserid(userFile.getUserid());
        param.setIsdir(0);
        return param;
    }

    public static String formatLikePath(String filePath) {
        String newFilePath = filePath.replace("'", "\\'");
        newFilePath = newFilePath.replace("%", "\\%");
        newFilePath = newFilePath.replace("_", "\\_");
        return newFilePath;
    }

}
