package xyz.pplax.pplaxnetdisk.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 
* @TableName picture_file
*/
public class PictureFile implements Serializable {

    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Long picturefileid;
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
    @ApiModelProperty("创建用户id")
    private Long createuserid;
    /**
    * 扩展名
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("扩展名")
    @Length(max= 100,message="编码长度不能超过100")
    private String extendname;
    /**
    * 文件名
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("文件名")
    @Length(max= 100,message="编码长度不能超过100")
    private String filename;
    /**
    * 文件大小
    */
    @ApiModelProperty("文件大小")
    private Long filesize;
    /**
    * 文件url
    */
    @Size(max= 500,message="编码长度不能超过500")
    @ApiModelProperty("文件url")
    @Length(max= 500,message="编码长度不能超过500")
    private String fileurl;
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
    @ApiModelProperty("修改用户id")
    private Long modifyuserid;
    /**
    * 存储类型
    */
    @ApiModelProperty("存储类型")
    private Integer storagetype;
    /**
    * 用户id
    */
    @ApiModelProperty("用户id")
    private Long userid;

    /**
    * 
    */
    private void setPicturefileid(Long picturefileid){
    this.picturefileid = picturefileid;
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
    private void setCreateuserid(Long createuserid){
    this.createuserid = createuserid;
    }

    /**
    * 扩展名
    */
    private void setExtendname(String extendname){
    this.extendname = extendname;
    }

    /**
    * 文件名
    */
    private void setFilename(String filename){
    this.filename = filename;
    }

    /**
    * 文件大小
    */
    private void setFilesize(Long filesize){
    this.filesize = filesize;
    }

    /**
    * 文件url
    */
    private void setFileurl(String fileurl){
    this.fileurl = fileurl;
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
    private void setModifyuserid(Long modifyuserid){
    this.modifyuserid = modifyuserid;
    }

    /**
    * 存储类型
    */
    private void setStoragetype(Integer storagetype){
    this.storagetype = storagetype;
    }

    /**
    * 用户id
    */
    private void setUserid(Long userid){
    this.userid = userid;
    }


    /**
    * 
    */
    private Long getPicturefileid(){
    return this.picturefileid;
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
    private Long getCreateuserid(){
    return this.createuserid;
    }

    /**
    * 扩展名
    */
    private String getExtendname(){
    return this.extendname;
    }

    /**
    * 文件名
    */
    private String getFilename(){
    return this.filename;
    }

    /**
    * 文件大小
    */
    private Long getFilesize(){
    return this.filesize;
    }

    /**
    * 文件url
    */
    private String getFileurl(){
    return this.fileurl;
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
    private Long getModifyuserid(){
    return this.modifyuserid;
    }

    /**
    * 存储类型
    */
    private Integer getStoragetype(){
    return this.storagetype;
    }

    /**
    * 用户id
    */
    private Long getUserid(){
    return this.userid;
    }

}
