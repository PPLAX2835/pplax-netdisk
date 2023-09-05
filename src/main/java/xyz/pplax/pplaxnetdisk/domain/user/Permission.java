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
* @TableName permission
*/
@Data
@Table(name = "permission")
@Entity
@TableName("permission")
public class Permission implements Serializable {

    /**
    * 
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(type = IdType.AUTO)
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Long permissionid;
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
    * 次序
    */
    @Column(columnDefinition="int(2) comment '次序'")
    @ApiModelProperty("次序")
    private Integer ordernum;
    /**
    * 父编号
    */
    @Column(columnDefinition="bigint(20) comment '父编号'")
    @ApiModelProperty("父编号")
    private Long parentid;
    /**
    * 权限标识码
    */
    @Column(columnDefinition="varchar(30) comment '权限标识码'")
    @Size(max= 30,message="编码长度不能超过30")
    @ApiModelProperty("权限标识码")
    @Length(max= 30,message="编码长度不能超过30")
    private String permissioncode;
    /**
    * 权限名称
    */
    @Column(columnDefinition="varchar(30) comment '权限名称'")
    @Size(max= 30,message="编码长度不能超过30")
    @ApiModelProperty("权限名称")
    @Length(max= 30,message="编码长度不能超过30")
    private String permissionname;
    /**
    * 资源类型
    */
    @Column(columnDefinition="int(2) comment '资源类型'")
    @ApiModelProperty("资源类型")
    private Integer resourcetype;

}
