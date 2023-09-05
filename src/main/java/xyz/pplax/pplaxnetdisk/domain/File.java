package xyz.pplax.pplaxnetdisk.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import cn.hutool.core.util.IdUtil;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.qiwenshare.common.util.DateUtil;
import com.qiwenshare.ufop.operation.upload.domain.UploadFileResult;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
* 
* @TableName file
*/
@Data
@Table(name = "file")
@Entity
@TableName("file")
public class File implements Serializable {

    /**
    * 
    */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @TableId(type = IdType.AUTO)
    @Column(columnDefinition="varchar(20)")
    @NotBlank(message="[]不能为空")
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("")
    @Length(max= 20,message="编码长度不能超过20")
    private String fileid;
    /**
    * 创建时间
    */
    @Column(columnDefinition="varchar(25) comment '创建时间'")
    @Size(max= 25,message="编码长度不能超过25")
    @ApiModelProperty("创建时间")
    @Length(max= 25,message="编码长度不能超过25")
    private String createtime;
    /**
    * 创建用户id
    */
    @Column(columnDefinition="varchar(20) comment '创建用户id'")
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("创建用户id")
    @Length(max= 20,message="编码长度不能超过20")
    private String createuserid;
    /**
    * 文件大小
    */
    @Column(columnDefinition="bigint(10) comment '文件大小'")
    @ApiModelProperty("文件大小")
    private Long filesize;
    /**
    * 文件状态(0-失效，1-生效)
    */
    @Column(columnDefinition="int(1) comment '文件状态(0-失效，1-生效)'")
    @ApiModelProperty("文件状态(0-失效，1-生效)")
    private Integer filestatus;
    /**
    * 文件url
    */
    @Column(columnDefinition="varchar(500) comment '文件url'")
    @Size(max= 500,message="编码长度不能超过500")
    @ApiModelProperty("文件url")
    @Length(max= 500,message="编码长度不能超过500")
    private String fileurl;
    /**
    * md5唯一标识
    */
    @Column(columnDefinition="varchar(200) comment 'md5唯一标识'")
    @Size(max= 200,message="编码长度不能超过200")
    @ApiModelProperty("md5唯一标识")
    @Length(max= 200,message="编码长度不能超过200")
    private String identifier;
    /**
    * 修改时间
    */
    @Column(columnDefinition="varchar(25) comment '修改时间'")
    @Size(max= 25,message="编码长度不能超过25")
    @ApiModelProperty("修改时间")
    @Length(max= 25,message="编码长度不能超过25")
    private String modifytime;
    /**
    * 修改用户id
    */
    @Column(columnDefinition="varchar(20) comment '修改用户id'")
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("修改用户id")
    @Length(max= 20,message="编码长度不能超过20")
    private String modifyuserid;
    /**
    * 存储类型
    */
    @Column(columnDefinition="int(1) comment '存储类型'")
    @ApiModelProperty("存储类型")
    private Integer storagetype;


    public File(){

    }

    public File(UploadFileResult uploadFileResult) {
        this.fileid = IdUtil.getSnowflakeNextIdStr();
        this.fileurl = uploadFileResult.getFileUrl();
        this.filesize = uploadFileResult.getFileSize();
        this.filestatus = 1;
        this.storagetype = uploadFileResult.getStorageType().getCode();
        this.identifier = uploadFileResult.getIdentifier();
        this.createtime = DateUtil.getCurrentTime();

    }

    public File(String fileUrl, Long fileSize, Integer storageType, String identifier, String userId) {
        this.fileid = IdUtil.getSnowflakeNextIdStr();
        this.fileurl = fileUrl;
        this.filesize = fileSize;
        this.filestatus = 1;
        this.storagetype = storageType;
        this.identifier = identifier;
        this.createtime = DateUtil.getCurrentTime();
        this.createuserid = userId;

    }

}
