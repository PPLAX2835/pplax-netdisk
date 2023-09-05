package xyz.pplax.pplaxnetdisk.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 
* @TableName file
*/
public class File implements Serializable {

    /**
    * 
    */
    @NotBlank(message="[]不能为空")
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("")
    @Length(max= 20,message="编码长度不能超过20")
    private String fileid;
    /**
    * 创建时间
    */
    @Size(max= 25,message="编码长度不能超过25")
    @ApiModelProperty("创建时间")
    @Length(max= 25,message="编码长度不能超过25")
    private String createtime;
    /**
    * 创建用户id
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("创建用户id")
    @Length(max= 20,message="编码长度不能超过20")
    private String createuserid;
    /**
    * 文件大小
    */
    @ApiModelProperty("文件大小")
    private Long filesize;
    /**
    * 文件状态(0-失效，1-生效)
    */
    @ApiModelProperty("文件状态(0-失效，1-生效)")
    private Integer filestatus;
    /**
    * 文件url
    */
    @Size(max= 500,message="编码长度不能超过500")
    @ApiModelProperty("文件url")
    @Length(max= 500,message="编码长度不能超过500")
    private String fileurl;
    /**
    * md5唯一标识
    */
    @Size(max= 200,message="编码长度不能超过200")
    @ApiModelProperty("md5唯一标识")
    @Length(max= 200,message="编码长度不能超过200")
    private String identifier;
    /**
    * 修改时间
    */
    @Size(max= 25,message="编码长度不能超过25")
    @ApiModelProperty("修改时间")
    @Length(max= 25,message="编码长度不能超过25")
    private String modifytime;
    /**
    * 修改用户id
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("修改用户id")
    @Length(max= 20,message="编码长度不能超过20")
    private String modifyuserid;
    /**
    * 存储类型
    */
    @ApiModelProperty("存储类型")
    private Integer storagetype;

    /**
    * 
    */
    private void setFileid(String fileid){
    this.fileid = fileid;
    }

    /**
    * 创建时间
    */
    private void setCreatetime(String createtime){
    this.createtime = createtime;
    }

    /**
    * 创建用户id
    */
    private void setCreateuserid(String createuserid){
    this.createuserid = createuserid;
    }

    /**
    * 文件大小
    */
    private void setFilesize(Long filesize){
    this.filesize = filesize;
    }

    /**
    * 文件状态(0-失效，1-生效)
    */
    private void setFilestatus(Integer filestatus){
    this.filestatus = filestatus;
    }

    /**
    * 文件url
    */
    private void setFileurl(String fileurl){
    this.fileurl = fileurl;
    }

    /**
    * md5唯一标识
    */
    private void setIdentifier(String identifier){
    this.identifier = identifier;
    }

    /**
    * 修改时间
    */
    private void setModifytime(String modifytime){
    this.modifytime = modifytime;
    }

    /**
    * 修改用户id
    */
    private void setModifyuserid(String modifyuserid){
    this.modifyuserid = modifyuserid;
    }

    /**
    * 存储类型
    */
    private void setStoragetype(Integer storagetype){
    this.storagetype = storagetype;
    }


    /**
    * 
    */
    private String getFileid(){
    return this.fileid;
    }

    /**
    * 创建时间
    */
    private String getCreatetime(){
    return this.createtime;
    }

    /**
    * 创建用户id
    */
    private String getCreateuserid(){
    return this.createuserid;
    }

    /**
    * 文件大小
    */
    private Long getFilesize(){
    return this.filesize;
    }

    /**
    * 文件状态(0-失效，1-生效)
    */
    private Integer getFilestatus(){
    return this.filestatus;
    }

    /**
    * 文件url
    */
    private String getFileurl(){
    return this.fileurl;
    }

    /**
    * md5唯一标识
    */
    private String getIdentifier(){
    return this.identifier;
    }

    /**
    * 修改时间
    */
    private String getModifytime(){
    return this.modifytime;
    }

    /**
    * 修改用户id
    */
    private String getModifyuserid(){
    return this.modifyuserid;
    }

    /**
    * 存储类型
    */
    private Integer getStoragetype(){
    return this.storagetype;
    }

}
