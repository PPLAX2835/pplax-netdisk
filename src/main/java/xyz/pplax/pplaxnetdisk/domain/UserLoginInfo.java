package xyz.pplax.pplaxnetdisk.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 
* @TableName user_login_info
*/
public class UserLoginInfo implements Serializable {

    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Long userloginid;
    /**
    * 用户id
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("用户id")
    @Length(max= 20,message="编码长度不能超过20")
    private String userid;
    /**
    * 用户登录日期
    */
    @Size(max= 30,message="编码长度不能超过30")
    @ApiModelProperty("用户登录日期")
    @Length(max= 30,message="编码长度不能超过30")
    private String userlogindate;

    /**
    * 
    */
    private void setUserloginid(Long userloginid){
    this.userloginid = userloginid;
    }

    /**
    * 用户id
    */
    private void setUserid(String userid){
    this.userid = userid;
    }

    /**
    * 用户登录日期
    */
    private void setUserlogindate(String userlogindate){
    this.userlogindate = userlogindate;
    }


    /**
    * 
    */
    private Long getUserloginid(){
    return this.userloginid;
    }

    /**
    * 用户id
    */
    private String getUserid(){
    return this.userid;
    }

    /**
    * 用户登录日期
    */
    private String getUserlogindate(){
    return this.userlogindate;
    }

}
