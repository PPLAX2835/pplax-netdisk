package xyz.pplax.pplaxnetdisk.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 
* @TableName share
*/
public class Share implements Serializable {

    /**
    * 
    */
    @NotBlank(message="[]不能为空")
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("")
    @Length(max= 255,message="编码长度不能超过255")
    private String shareid;
    /**
    * 失效时间
    */
    @Size(max= 30,message="编码长度不能超过30")
    @ApiModelProperty("失效时间")
    @Length(max= 30,message="编码长度不能超过30")
    private String endtime;
    /**
    * 提取码
    */
    @Size(max= 10,message="编码长度不能超过10")
    @ApiModelProperty("提取码")
    @Length(max= 10,message="编码长度不能超过10")
    private String extractioncode;
    /**
    * 分享批次号
    */
    @Size(max= 40,message="编码长度不能超过40")
    @ApiModelProperty("分享批次号")
    @Length(max= 40,message="编码长度不能超过40")
    private String sharebatchnum;
    /**
    * 分享状态(0正常,1已失效,2已撤销)
    */
    @ApiModelProperty("分享状态(0正常,1已失效,2已撤销)")
    private Integer sharestatus;
    /**
    * 分享时间
    */
    @Size(max= 30,message="编码长度不能超过30")
    @ApiModelProperty("分享时间")
    @Length(max= 30,message="编码长度不能超过30")
    private String sharetime;
    /**
    * 分享类型(0公共,1私密,2好友)
    */
    @ApiModelProperty("分享类型(0公共,1私密,2好友)")
    private Integer sharetype;
    /**
    * 用户id
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("用户id")
    @Length(max= 20,message="编码长度不能超过20")
    private String userid;

    /**
    * 
    */
    private void setShareid(String shareid){
    this.shareid = shareid;
    }

    /**
    * 失效时间
    */
    private void setEndtime(String endtime){
    this.endtime = endtime;
    }

    /**
    * 提取码
    */
    private void setExtractioncode(String extractioncode){
    this.extractioncode = extractioncode;
    }

    /**
    * 分享批次号
    */
    private void setSharebatchnum(String sharebatchnum){
    this.sharebatchnum = sharebatchnum;
    }

    /**
    * 分享状态(0正常,1已失效,2已撤销)
    */
    private void setSharestatus(Integer sharestatus){
    this.sharestatus = sharestatus;
    }

    /**
    * 分享时间
    */
    private void setSharetime(String sharetime){
    this.sharetime = sharetime;
    }

    /**
    * 分享类型(0公共,1私密,2好友)
    */
    private void setSharetype(Integer sharetype){
    this.sharetype = sharetype;
    }

    /**
    * 用户id
    */
    private void setUserid(String userid){
    this.userid = userid;
    }


    /**
    * 
    */
    private String getShareid(){
    return this.shareid;
    }

    /**
    * 失效时间
    */
    private String getEndtime(){
    return this.endtime;
    }

    /**
    * 提取码
    */
    private String getExtractioncode(){
    return this.extractioncode;
    }

    /**
    * 分享批次号
    */
    private String getSharebatchnum(){
    return this.sharebatchnum;
    }

    /**
    * 分享状态(0正常,1已失效,2已撤销)
    */
    private Integer getSharestatus(){
    return this.sharestatus;
    }

    /**
    * 分享时间
    */
    private String getSharetime(){
    return this.sharetime;
    }

    /**
    * 分享类型(0公共,1私密,2好友)
    */
    private Integer getSharetype(){
    return this.sharetype;
    }

    /**
    * 用户id
    */
    private String getUserid(){
    return this.userid;
    }

}
