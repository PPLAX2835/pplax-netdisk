package xyz.pplax.pplaxnetdisk.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 
* @TableName recovery_file
*/
public class RecoveryFile implements Serializable {

    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Long recoveryfileid;
    /**
    * 删除批次号
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("删除批次号")
    @Length(max= 50,message="编码长度不能超过50")
    private String deletebatchnum;
    /**
    * 删除时间
    */
    @Size(max= 25,message="编码长度不能超过25")
    @ApiModelProperty("删除时间")
    @Length(max= 25,message="编码长度不能超过25")
    private String deletetime;
    /**
    * 用户文件id
    */
    @ApiModelProperty("用户文件id")
    private Long userfileid;

    /**
    * 
    */
    private void setRecoveryfileid(Long recoveryfileid){
    this.recoveryfileid = recoveryfileid;
    }

    /**
    * 删除批次号
    */
    private void setDeletebatchnum(String deletebatchnum){
    this.deletebatchnum = deletebatchnum;
    }

    /**
    * 删除时间
    */
    private void setDeletetime(String deletetime){
    this.deletetime = deletetime;
    }

    /**
    * 用户文件id
    */
    private void setUserfileid(Long userfileid){
    this.userfileid = userfileid;
    }


    /**
    * 
    */
    private Long getRecoveryfileid(){
    return this.recoveryfileid;
    }

    /**
    * 删除批次号
    */
    private String getDeletebatchnum(){
    return this.deletebatchnum;
    }

    /**
    * 删除时间
    */
    private String getDeletetime(){
    return this.deletetime;
    }

    /**
    * 用户文件id
    */
    private Long getUserfileid(){
    return this.userfileid;
    }

}
