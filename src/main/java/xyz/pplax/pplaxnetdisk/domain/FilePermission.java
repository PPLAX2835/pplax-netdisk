package xyz.pplax.pplaxnetdisk.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 
* @TableName file_permission
*/
public class FilePermission implements Serializable {

    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Long filepermissionid;
    /**
    * 共享文件id
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("共享文件id")
    @Length(max= 20,message="编码长度不能超过20")
    private String commonfileid;
    /**
    * 用户对文件的权限码
    */
    @ApiModelProperty("用户对文件的权限码")
    private Integer filepermissioncode;
    /**
    * 用户id
    */
    @ApiModelProperty("用户id")
    private Long userid;

    /**
    * 
    */
    private void setFilepermissionid(Long filepermissionid){
    this.filepermissionid = filepermissionid;
    }

    /**
    * 共享文件id
    */
    private void setCommonfileid(String commonfileid){
    this.commonfileid = commonfileid;
    }

    /**
    * 用户对文件的权限码
    */
    private void setFilepermissioncode(Integer filepermissioncode){
    this.filepermissioncode = filepermissioncode;
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
    private Long getFilepermissionid(){
    return this.filepermissionid;
    }

    /**
    * 共享文件id
    */
    private String getCommonfileid(){
    return this.commonfileid;
    }

    /**
    * 用户对文件的权限码
    */
    private Integer getFilepermissioncode(){
    return this.filepermissioncode;
    }

    /**
    * 用户id
    */
    private Long getUserid(){
    return this.userid;
    }

}
