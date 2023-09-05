package xyz.pplax.pplaxnetdisk.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 
* @TableName share_file
*/
public class ShareFile implements Serializable {

    /**
    * 
    */
    @NotBlank(message="[]不能为空")
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("")
    @Length(max= 255,message="编码长度不能超过255")
    private String sharefileid;
    /**
    * 分享批次号
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("分享批次号")
    @Length(max= 50,message="编码长度不能超过50")
    private String sharebatchnum;
    /**
    * 分享文件路径
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("分享文件路径")
    @Length(max= 100,message="编码长度不能超过100")
    private String sharefilepath;
    /**
    * 用户文件id
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("用户文件id")
    @Length(max= 20,message="编码长度不能超过20")
    private String userfileid;

    /**
    * 
    */
    private void setSharefileid(String sharefileid){
    this.sharefileid = sharefileid;
    }

    /**
    * 分享批次号
    */
    private void setSharebatchnum(String sharebatchnum){
    this.sharebatchnum = sharebatchnum;
    }

    /**
    * 分享文件路径
    */
    private void setSharefilepath(String sharefilepath){
    this.sharefilepath = sharefilepath;
    }

    /**
    * 用户文件id
    */
    private void setUserfileid(String userfileid){
    this.userfileid = userfileid;
    }


    /**
    * 
    */
    private String getSharefileid(){
    return this.sharefileid;
    }

    /**
    * 分享批次号
    */
    private String getSharebatchnum(){
    return this.sharebatchnum;
    }

    /**
    * 分享文件路径
    */
    private String getSharefilepath(){
    return this.sharefilepath;
    }

    /**
    * 用户文件id
    */
    private String getUserfileid(){
    return this.userfileid;
    }

}
