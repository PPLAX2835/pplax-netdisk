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
* @TableName user
*/
@Data
@Table(name = "user")
@Entity
@TableName("user")
public class User implements Serializable {

    /**
    * 
    */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "varchar(20)")
    @TableId(type = IdType.AUTO)
    @NotBlank(message="[]不能为空")
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("")
    @Length(max= 20,message="编码长度不能超过20")
    private String userid;
    /**
    * 区
    */
    @Column(columnDefinition = "varchar(10) comment '区'")
    @Size(max= 10,message="编码长度不能超过10")
    @ApiModelProperty("区")
    @Length(max= 10,message="编码长度不能超过10")
    private String addrarea;
    /**
    * 市
    */
    @Column(columnDefinition = "varchar(10) comment '市'")
    @Size(max= 10,message="编码长度不能超过10")
    @ApiModelProperty("市")
    @Length(max= 10,message="编码长度不能超过10")
    private String addrcity;
    /**
    * 省
    */
    @Column(columnDefinition = "varchar(10) comment '省'")
    @Size(max= 10,message="编码长度不能超过10")
    @ApiModelProperty("省")
    @Length(max= 10,message="编码长度不能超过10")
    private String addrprovince;
    /**
    * 是否可用(0-不可用,1-可用)
    */
    @Column(columnDefinition = "int(2) comment '是否可用(0-不可用,1-可用)'")
    @ApiModelProperty("是否可用(0-不可用,1-可用)")
    private Integer available;
    /**
    * 生日
    */
    @Column(columnDefinition = "varchar(30) comment '生日'")
    @Size(max= 30,message="编码长度不能超过30")
    @ApiModelProperty("生日")
    @Length(max= 30,message="编码长度不能超过30")
    private String birthday;
    /**
    * 邮箱
    */
    @Column(columnDefinition = "varchar(100) comment '邮箱'")
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("邮箱")
    @Length(max= 100,message="编码长度不能超过100")
    private String email;
    /**
    * 头像
    */
    @Column(columnDefinition = "varchar(100) comment '头像'")
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("头像")
    @Length(max= 100,message="编码长度不能超过100")
    private String imageurl;
    /**
    * 行业
    */
    @Column(columnDefinition = "varchar(50) comment '行业'")
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("行业")
    @Length(max= 50,message="编码长度不能超过50")
    private String industry;
    /**
    * 个人简介
    */
    @Column(columnDefinition = "varchar(5000) comment '个人简介'")
    @Size(max= 5000,message="编码长度不能超过5000")
    @ApiModelProperty("个人简介")
    @Length(max= 5000,message="编码长度不能超过5,000")
    private String intro;
    /**
    * 最后登录时间
    */
    @Column(columnDefinition = "varchar(30) comment '最后登录时间'")
    @Size(max= 30,message="编码长度不能超过30")
    @ApiModelProperty("最后登录时间")
    @Length(max= 30,message="编码长度不能超过30")
    private String lastlogintime;
    /**
    * 修改时间
    */
    @Column(columnDefinition = "varchar(30) comment '修改时间'")
    @Size(max= 30,message="编码长度不能超过30")
    @ApiModelProperty("修改时间")
    @Length(max= 30,message="编码长度不能超过30")
    private String modifytime;
    /**
    * 修改用户id
    */
    @Column(columnDefinition = "bigint(20) comment '修改用户id'")
    @ApiModelProperty("修改用户id")
    private Long modifyuserid;
    /**
    * 密码
    */
    @Column(columnDefinition = "varchar(35) comment '密码'")
    @Size(max= 35,message="编码长度不能超过35")
    @ApiModelProperty("密码")
    @Length(max= 35,message="编码长度不能超过35")
    private String password;
    /**
    * 地区
    */
    @Column(columnDefinition = "varchar(50) comment '地区'")
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("地区")
    @Length(max= 50,message="编码长度不能超过50")
    private String position;
    /**
    * 注册时间
    */
    @Column(columnDefinition = "varchar(30) comment '注册时间'")
    @Size(max= 30,message="编码长度不能超过30")
    @ApiModelProperty("注册时间")
    @Length(max= 30,message="编码长度不能超过30")
    private String registertime;
    /**
    * 盐
    */
    @Column(columnDefinition = "varchar(20) comment '盐'")
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("盐")
    @Length(max= 20,message="编码长度不能超过20")
    private String salt;
    /**
    * 性别
    */
    @Column(columnDefinition = "varchar(3) comment '性别'")
    @Size(max= 3,message="编码长度不能超过3")
    @ApiModelProperty("性别")
    @Length(max= 3,message="编码长度不能超过3")
    private String sex;
    /**
    * 手机号
    */
    @Column(columnDefinition = "varchar(15) comment '手机号'")
    @Size(max= 15,message="编码长度不能超过15")
    @ApiModelProperty("手机号")
    @Length(max= 15,message="编码长度不能超过15")
    private String telephone;
    /**
    * 用户名
    */
    @Column(columnDefinition = "varchar(30) comment '用户名'")
    @Size(max= 30,message="编码长度不能超过30")
    @ApiModelProperty("用户名")
    @Length(max= 30,message="编码长度不能超过30")
    private String username;
    /**
    * open id
    */
    @Column(columnDefinition = "varchar(28) comment 'open id'")
    @Size(max= 28,message="编码长度不能超过28")
    @ApiModelProperty("open id")
    @Length(max= 28,message="编码长度不能超过28")
    private String wxopenid;

}
