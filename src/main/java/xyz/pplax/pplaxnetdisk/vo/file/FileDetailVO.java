package xyz.pplax.pplaxnetdisk.vo.file;

import lombok.Data;
import xyz.pplax.pplaxnetdisk.domain.Image;
import xyz.pplax.pplaxnetdisk.domain.Music;


@Data
public class FileDetailVO {
    private String fileId;

    private String timeStampName;

    private String fileUrl;

    private Long fileSize;

    private Integer storageType;

    private Integer pointCount;

    private String identifier;

    private String userFileId;

    private Long userId;


    private String fileName;

    private String filePath;

    private String extendName;

    private Integer isDir;

    private String uploadTime;

    private Integer deleteFlag;

    private String deleteTime;

    private String deleteBatchNum;

    private Image image;

    private Music music;
}
