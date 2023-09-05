package xyz.pplax.pplaxnetdisk.domain.user;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 
* @TableName user_role
*/
public class UserRole implements Serializable {

    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Long userroleid;
    /**
    * 
    */
    @ApiModelProperty("")
    private Long roleid;
    /**
    * 
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("")
    @Length(max= 255,message="编码长度不能超过255")
    private String userid;

    /**
    * 
    */
    private void setUserroleid(Long userroleid){
    this.userroleid = userroleid;
    }

    /**
    * 
    */
    private void setRoleid(Long roleid){
    this.roleid = roleid;
    }

    /**
    * 
    */
    private void setUserid(String userid){
    this.userid = userid;
    }


    /**
    * 
    */
    private Long getUserroleid(){
    return this.userroleid;
    }

    /**
    * 
    */
    private Long getRoleid(){
    return this.roleid;
    }

    /**
    * 
    */
    private String getUserid(){
    return this.userid;
    }

}
