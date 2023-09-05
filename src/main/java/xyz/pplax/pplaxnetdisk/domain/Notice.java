package xyz.pplax.pplaxnetdisk.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 
* @TableName notice
*/
public class Notice implements Serializable {

    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Long noticeid;
    /**
    * html内容
    */
    @Size(max= -1,message="编码长度不能超过-1")
    @ApiModelProperty("html内容")
    @Length(max= -1,message="编码长度不能超过-1")
    private String content;
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
    * 是否长期有效(0-否,1-是)
    */
    @ApiModelProperty("是否长期有效(0-否,1-是)")
    private Integer islongvaliddata;
    /**
    * markdown原文
    */
    @Size(max= -1,message="编码长度不能超过-1")
    @ApiModelProperty("markdown原文")
    @Length(max= -1,message="编码长度不能超过-1")
    private String markdowncontent;
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
    * 平台(1-社区,2-管理端,3-网盘,4-股票)
    */
    @ApiModelProperty("平台(1-社区,2-管理端,3-网盘,4-股票)")
    private Integer platform;
    /**
    * 标题
    */
    @NotBlank(message="[标题]不能为空")
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("标题")
    @Length(max= 100,message="编码长度不能超过100")
    private String title;
    /**
    * 有效时间
    */
    @Size(max= 25,message="编码长度不能超过25")
    @ApiModelProperty("有效时间")
    @Length(max= 25,message="编码长度不能超过25")
    private String validdatetime;

    /**
    * 
    */
    private void setNoticeid(Long noticeid){
    this.noticeid = noticeid;
    }

    /**
    * html内容
    */
    private void setContent(String content){
    this.content = content;
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
    * 是否长期有效(0-否,1-是)
    */
    private void setIslongvaliddata(Integer islongvaliddata){
    this.islongvaliddata = islongvaliddata;
    }

    /**
    * markdown原文
    */
    private void setMarkdowncontent(String markdowncontent){
    this.markdowncontent = markdowncontent;
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
    * 平台(1-社区,2-管理端,3-网盘,4-股票)
    */
    private void setPlatform(Integer platform){
    this.platform = platform;
    }

    /**
    * 标题
    */
    private void setTitle(String title){
    this.title = title;
    }

    /**
    * 有效时间
    */
    private void setValiddatetime(String validdatetime){
    this.validdatetime = validdatetime;
    }


    /**
    * 
    */
    private Long getNoticeid(){
    return this.noticeid;
    }

    /**
    * html内容
    */
    private String getContent(){
    return this.content;
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
    * 是否长期有效(0-否,1-是)
    */
    private Integer getIslongvaliddata(){
    return this.islongvaliddata;
    }

    /**
    * markdown原文
    */
    private String getMarkdowncontent(){
    return this.markdowncontent;
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
    * 平台(1-社区,2-管理端,3-网盘,4-股票)
    */
    private Integer getPlatform(){
    return this.platform;
    }

    /**
    * 标题
    */
    private String getTitle(){
    return this.title;
    }

    /**
    * 有效时间
    */
    private String getValiddatetime(){
    return this.validdatetime;
    }

}
