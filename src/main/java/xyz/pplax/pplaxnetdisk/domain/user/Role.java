package xyz.pplax.pplaxnetdisk.domain.user;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 
* @TableName role
*/
public class Role implements Serializable {

    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Long roleid;
    /**
    * 是否可用(0-不可用,1-可用)
    */
    @ApiModelProperty("是否可用(0-不可用,1-可用)")
    private Integer available;
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
    @ApiModelProperty("创建用户id")
    private Long createuserid;
    /**
    * 角色描述
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("角色描述")
    @Length(max= 100,message="编码长度不能超过100")
    private String description;
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
    @ApiModelProperty("修改用户id")
    private Long modifyuserid;
    /**
    * 角色名
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("角色名")
    @Length(max= 20,message="编码长度不能超过20")
    private String rolename;

    /**
    * 
    */
    private void setRoleid(Long roleid){
    this.roleid = roleid;
    }

    /**
    * 是否可用(0-不可用,1-可用)
    */
    private void setAvailable(Integer available){
    this.available = available;
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
    * 角色描述
    */
    private void setDescription(String description){
    this.description = description;
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
    * 角色名
    */
    private void setRolename(String rolename){
    this.rolename = rolename;
    }


    /**
    * 
    */
    private Long getRoleid(){
    return this.roleid;
    }

    /**
    * 是否可用(0-不可用,1-可用)
    */
    private Integer getAvailable(){
    return this.available;
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
    * 角色描述
    */
    private String getDescription(){
    return this.description;
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
    * 角色名
    */
    private String getRolename(){
    return this.rolename;
    }

}
