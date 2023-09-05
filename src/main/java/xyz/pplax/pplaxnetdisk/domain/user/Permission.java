package xyz.pplax.pplaxnetdisk.domain.user;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 
* @TableName permission
*/
public class Permission implements Serializable {

    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Long permissionid;
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
    * 次序
    */
    @ApiModelProperty("次序")
    private Integer ordernum;
    /**
    * 父编号
    */
    @ApiModelProperty("父编号")
    private Long parentid;
    /**
    * 权限标识码
    */
    @Size(max= 30,message="编码长度不能超过30")
    @ApiModelProperty("权限标识码")
    @Length(max= 30,message="编码长度不能超过30")
    private String permissioncode;
    /**
    * 权限名称
    */
    @Size(max= 30,message="编码长度不能超过30")
    @ApiModelProperty("权限名称")
    @Length(max= 30,message="编码长度不能超过30")
    private String permissionname;
    /**
    * 资源类型
    */
    @ApiModelProperty("资源类型")
    private Integer resourcetype;

    /**
    * 
    */
    private void setPermissionid(Long permissionid){
    this.permissionid = permissionid;
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
    * 次序
    */
    private void setOrdernum(Integer ordernum){
    this.ordernum = ordernum;
    }

    /**
    * 父编号
    */
    private void setParentid(Long parentid){
    this.parentid = parentid;
    }

    /**
    * 权限标识码
    */
    private void setPermissioncode(String permissioncode){
    this.permissioncode = permissioncode;
    }

    /**
    * 权限名称
    */
    private void setPermissionname(String permissionname){
    this.permissionname = permissionname;
    }

    /**
    * 资源类型
    */
    private void setResourcetype(Integer resourcetype){
    this.resourcetype = resourcetype;
    }


    /**
    * 
    */
    private Long getPermissionid(){
    return this.permissionid;
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
    * 次序
    */
    private Integer getOrdernum(){
    return this.ordernum;
    }

    /**
    * 父编号
    */
    private Long getParentid(){
    return this.parentid;
    }

    /**
    * 权限标识码
    */
    private String getPermissioncode(){
    return this.permissioncode;
    }

    /**
    * 权限名称
    */
    private String getPermissionname(){
    return this.permissionname;
    }

    /**
    * 资源类型
    */
    private Integer getResourcetype(){
    return this.resourcetype;
    }

}
