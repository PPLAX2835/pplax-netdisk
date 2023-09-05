package xyz.pplax.pplaxnetdisk.domain.user;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
* 
* @TableName role_permission
*/
@Data
@Table(name = "role_permission")
@Entity
@TableName("role_permission")
public class RolePermission implements Serializable {

    /**
    * 
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(type = IdType.AUTO)
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Long id;
    /**
    * 权限id
    */
    @Column(columnDefinition="bigint(20) comment '权限id'")
    @ApiModelProperty("权限id")
    private Long permissionid;
    /**
    * 角色id
    */
    @Column(columnDefinition="bigint(20) comment '角色id'")
    @ApiModelProperty("角色id")
    private Long roleid;

}
