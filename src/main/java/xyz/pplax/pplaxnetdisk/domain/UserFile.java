package xyz.pplax.pplaxnetdisk.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 
* @TableName user_file
*/
public class UserFile implements Serializable {

    /**
    * 
    */
    @NotBlank(message="[]不能为空")
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("")
    @Length(max= 20,message="编码长度不能超过20")
    private String userfileid;
    /**
    * 创建时间
    */
    @Size(max= 30,message="编码长度不能超过30")
    @ApiModelProperty("创建时间")
    @Length(max= 30,message="编码长度不能超过30")
    private String createtime;
    /**
    * 创建用户id
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("创建用户id")
    @Length(max= 20,message="编码长度不能超过20")
    private String createuserid;
    /**
    * 删除批次号
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("删除批次号")
    @Length(max= 50,message="编码长度不能超过50")
    private String deletebatchnum;
    /**
    * 删除标识(0-未删除，1-已删除)
    */
    @ApiModelProperty("删除标识(0-未删除，1-已删除)")
    private Integer deleteflag;
    /**
    * 删除时间
    */
    @Size(max= 25,message="编码长度不能超过25")
    @ApiModelProperty("删除时间")
    @Length(max= 25,message="编码长度不能超过25")
    private String deletetime;
    /**
    * 扩展名
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("扩展名")
    @Length(max= 100,message="编码长度不能超过100")
    private String extendname;
    /**
    * 文件id
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("文件id")
    @Length(max= 20,message="编码长度不能超过20")
    private String fileid;
    /**
    * 文件名
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("文件名")
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
    * 是否是目录(0-否,1-是)
    */
    @ApiModelProperty("是否是目录(0-否,1-是)")
    private Integer isdir;
    /**
    * 修改时间
    */
    @Size(max= 30,message="编码长度不能超过30")
    @ApiModelProperty("修改时间")
    @Length(max= 30,message="编码长度不能超过30")
    private String modifytime;
    /**
    * 修改用户id
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("修改用户id")
    @Length(max= 20,message="编码长度不能超过20")
    private String modifyuserid;
    /**
    * 修改时间
    */
    @Size(max= 25,message="编码长度不能超过25")
    @ApiModelProperty("修改时间")
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
    private void setUserfileid(String userfileid){
    this.userfileid = userfileid;
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
    * 删除批次号
    */
    private void setDeletebatchnum(String deletebatchnum){
    this.deletebatchnum = deletebatchnum;
    }

    /**
    * 删除标识(0-未删除，1-已删除)
    */
    private void setDeleteflag(Integer deleteflag){
    this.deleteflag = deleteflag;
    }

    /**
    * 删除时间
    */
    private void setDeletetime(String deletetime){
    this.deletetime = deletetime;
    }

    /**
    * 扩展名
    */
    private void setExtendname(String extendname){
    this.extendname = extendname;
    }

    /**
    * 文件id
    */
    private void setFileid(String fileid){
    this.fileid = fileid;
    }

    /**
    * 文件名
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
    * 是否是目录(0-否,1-是)
    */
    private void setIsdir(Integer isdir){
    this.isdir = isdir;
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
    * 修改时间
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
    private String getUserfileid(){
    return this.userfileid;
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
    * 删除批次号
    */
    private String getDeletebatchnum(){
    return this.deletebatchnum;
    }

    /**
    * 删除标识(0-未删除，1-已删除)
    */
    private Integer getDeleteflag(){
    return this.deleteflag;
    }

    /**
    * 删除时间
    */
    private String getDeletetime(){
    return this.deletetime;
    }

    /**
    * 扩展名
    */
    private String getExtendname(){
    return this.extendname;
    }

    /**
    * 文件id
    */
    private String getFileid(){
    return this.fileid;
    }

    /**
    * 文件名
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
    * 是否是目录(0-否,1-是)
    */
    private Integer getIsdir(){
    return this.isdir;
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
    * 修改时间
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
