package xyz.pplax.pplaxnetdisk.domain;

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
* @TableName user_login_info
*/
@Data
@Table(name = "user_login_info")
@Entity
@TableName("user_login_info")
public class UserLoginInfo implements Serializable {

    /**
    * 
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(type = IdType.AUTO)
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Long userloginid;
    /**
    * 用户id
    */
    @Column(columnDefinition = "varchar(20) comment '用户id'")
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("用户id")
    @Length(max= 20,message="编码长度不能超过20")
    private String userid;
    /**
    * 用户登录日期
    */
    @Column(columnDefinition = "varchar(30) comment '用户登录日期'")
    @Size(max= 30,message="编码长度不能超过30")
    @ApiModelProperty("用户登录日期")
    @Length(max= 30,message="编码长度不能超过30")
    private String userlogindate;

}
