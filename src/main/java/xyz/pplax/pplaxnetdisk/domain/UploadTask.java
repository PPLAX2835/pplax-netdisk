package xyz.pplax.pplaxnetdisk.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 
* @TableName upload_task
*/
public class UploadTask implements Serializable {

    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Long uploadtaskid;
    /**
    * 扩展名
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("扩展名")
    @Length(max= 100,message="编码长度不能超过100")
    private String extendname;
    /**
    * 文件名称
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("文件名称")
    @Length(max= 100,message="编码长度不能超过100")
    private String filename;
    /**
    * 文件路径
    */
    @Size(max= 500,message="编码长度不能超过500")
    @ApiModelProperty("文件路径")
    @Length(max= 500,message="编码长度不能超过500")
    private String filepath;
    /**
    * md5唯一标识
    */
    @Size(max= 200,message="编码长度不能超过200")
    @ApiModelProperty("md5唯一标识")
    @Length(max= 200,message="编码长度不能超过200")
    private String identifier;
    /**
    * 上传状态(1-成功,0-失败或未完成)
    */
    @ApiModelProperty("上传状态(1-成功,0-失败或未完成)")
    private Integer uploadstatus;
    /**
    * 上传时间
    */
    @Size(max= 25,message="编码长度不能超过25")
    @ApiModelProperty("上传时间")
    @Length(max= 25,message="编码长度不能超过25")
    private String uploadtime;
    /**
    * 用户id
    */
    @ApiModelProperty("用户id")
    private Long userid;

    /**
    * 
    */
    private void setUploadtaskid(Long uploadtaskid){
    this.uploadtaskid = uploadtaskid;
    }

    /**
    * 扩展名
    */
    private void setExtendname(String extendname){
    this.extendname = extendname;
    }

    /**
    * 文件名称
    */
    private void setFilename(String filename){
    this.filename = filename;
    }

    /**
    * 文件路径
    */
    private void setFilepath(String filepath){
    this.filepath = filepath;
    }

    /**
    * md5唯一标识
    */
    private void setIdentifier(String identifier){
    this.identifier = identifier;
    }

    /**
    * 上传状态(1-成功,0-失败或未完成)
    */
    private void setUploadstatus(Integer uploadstatus){
    this.uploadstatus = uploadstatus;
    }

    /**
    * 上传时间
    */
    private void setUploadtime(String uploadtime){
    this.uploadtime = uploadtime;
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
    private Long getUploadtaskid(){
    return this.uploadtaskid;
    }

    /**
    * 扩展名
    */
    private String getExtendname(){
    return this.extendname;
    }

    /**
    * 文件名称
    */
    private String getFilename(){
    return this.filename;
    }

    /**
    * 文件路径
    */
    private String getFilepath(){
    return this.filepath;
    }

    /**
    * md5唯一标识
    */
    private String getIdentifier(){
    return this.identifier;
    }

    /**
    * 上传状态(1-成功,0-失败或未完成)
    */
    private Integer getUploadstatus(){
    return this.uploadstatus;
    }

    /**
    * 上传时间
    */
    private String getUploadtime(){
    return this.uploadtime;
    }

    /**
    * 用户id
    */
    private Long getUserid(){
    return this.userid;
    }

}
