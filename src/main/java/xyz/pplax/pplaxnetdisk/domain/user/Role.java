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
* @TableName role
*/
@Data
@Table(name = "role")
@Entity
@TableName("role")
public class Role implements Serializable {

    /**
    * 
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(type = IdType.AUTO)
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Long roleid;
    /**
    * 是否可用(0-不可用,1-可用)
    */
    @Column(columnDefinition="int(2) comment '是否可用(0-不可用,1-可用)'")
    @ApiModelProperty("是否可用(0-不可用,1-可用)")
    private Integer available;
    /**
    * 创建时间
    */
    @Column(columnDefinition="varchar(30) comment '创建时间'")
    @Size(max= 30,message="编码长度不能超过30")
    @ApiModelProperty("创建时间")
    @Length(max= 30,message="编码长度不能超过30")
    private String createtime;
    /**
    * 创建用户id
    */
    @Column(columnDefinition="bigint(20) comment '创建用户id'")
    @ApiModelProperty("创建用户id")
    private Long createuserid;
    /**
    * 角色描述
    */
    @Column(columnDefinition="varchar(100) comment '角色描述'")
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("角色描述")
    @Length(max= 100,message="编码长度不能超过100")
    private String description;
    /**
    * 修改时间
    */
    @Column(columnDefinition="varchar(30) comment '修改时间'")
    @Size(max= 30,message="编码长度不能超过30")
    @ApiModelProperty("修改时间")
    @Length(max= 30,message="编码长度不能超过30")
    private String modifytime;
    /**
    * 修改用户id
    */
    @Column(columnDefinition="bigint(20) comment '修改用户id'")
    @ApiModelProperty("修改用户id")
    private Long modifyuserid;
    /**
    * 角色名
    */
    @Column(columnDefinition="varchar(20) comment '角色名'")
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("角色名")
    @Length(max= 20,message="编码长度不能超过20")
    private String rolename;

}
