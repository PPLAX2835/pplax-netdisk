package xyz.pplax.pplaxnetdisk.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 
* @TableName storage
*/
public class Storage implements Serializable {

    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Long storageid;
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
    * 占用存储大小
    */
    @ApiModelProperty("占用存储大小")
    private Long storagesize;
    /**
    * 总存储大小
    */
    @ApiModelProperty("总存储大小")
    private Long totalstoragesize;
    /**
    * 
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("")
    @Length(max= 20,message="编码长度不能超过20")
    private String userid;

    /**
    * 
    */
    private void setStorageid(Long storageid){
    this.storageid = storageid;
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
    * 占用存储大小
    */
    private void setStoragesize(Long storagesize){
    this.storagesize = storagesize;
    }

    /**
    * 总存储大小
    */
    private void setTotalstoragesize(Long totalstoragesize){
    this.totalstoragesize = totalstoragesize;
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
    private Long getStorageid(){
    return this.storageid;
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
    * 占用存储大小
    */
    private Long getStoragesize(){
    return this.storagesize;
    }

    /**
    * 总存储大小
    */
    private Long getTotalstoragesize(){
    return this.totalstoragesize;
    }

    /**
    * 
    */
    private String getUserid(){
    return this.userid;
    }

}
