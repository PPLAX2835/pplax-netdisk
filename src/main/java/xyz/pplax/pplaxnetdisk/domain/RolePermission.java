package xyz.pplax.pplaxnetdisk.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 
* @TableName role_permission
*/
public class RolePermission implements Serializable {

    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Long id;
    /**
    * 权限id
    */
    @ApiModelProperty("权限id")
    private Long permissionid;
    /**
    * 角色id
    */
    @ApiModelProperty("角色id")
    private Long roleid;

    /**
    * 
    */
    private void setId(Long id){
    this.id = id;
    }

    /**
    * 权限id
    */
    private void setPermissionid(Long permissionid){
    this.permissionid = permissionid;
    }

    /**
    * 角色id
    */
    private void setRoleid(Long roleid){
    this.roleid = roleid;
    }


    /**
    * 
    */
    private Long getId(){
    return this.id;
    }

    /**
    * 权限id
    */
    private Long getPermissionid(){
    return this.permissionid;
    }

    /**
    * 角色id
    */
    private Long getRoleid(){
    return this.roleid;
    }

}
