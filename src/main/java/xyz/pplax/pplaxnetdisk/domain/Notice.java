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
* @TableName notice
*/
@Data
@Table(name = "notice")
@Entity
@TableName("notice")
public class Notice implements Serializable {

    /**
    * 
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(type = IdType.AUTO)
    @Column(columnDefinition="bigint(20)", unique = true)
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Long noticeid;
    /**
    * html内容
    */
    @Column(columnDefinition = "longtext comment 'html内容'")
    @Size(max= -1,message="编码长度不能超过-1")
    @ApiModelProperty("html内容")
    @Length(max= -1,message="编码长度不能超过-1")
    private String content;
    /**
    * 创建时间
    */
    @Column(columnDefinition="varchar(25) comment '创建时间'")
    @Size(max= 25,message="编码长度不能超过25")
    @ApiModelProperty("创建时间")
    @Length(max= 25,message="编码长度不能超过25")
    private String createtime;
    /**
    * 创建用户id
    */
    @Column(columnDefinition="bigint(20) comment '创建用户id'")
    @ApiModelProperty("创建用户id")
    private Long createuserid;
    /**
    * 是否长期有效(0-否,1-是)
    */
    @Column(columnDefinition="int(1) comment '是否长期有效(0-否,1-是)'")
    @ApiModelProperty("是否长期有效(0-否,1-是)")
    private Integer islongvaliddata;
    /**
    * markdown原文
    */
    @Column(columnDefinition = "longtext comment 'markdown原文'")
    @Size(max= -1,message="编码长度不能超过-1")
    @ApiModelProperty("markdown原文")
    @Length(max= -1,message="编码长度不能超过-1")
    private String markdowncontent;
    /**
    * 修改时间
    */
    @Column(columnDefinition="varchar(25) comment '修改时间'")
    @Size(max= 25,message="编码长度不能超过25")
    @ApiModelProperty("修改时间")
    @Length(max= 25,message="编码长度不能超过25")
    private String modifytime;
    /**
    * 修改用户id
    */
    @Column(columnDefinition="bigint(20) comment '修改用户id'")
    @ApiModelProperty("修改用户id")
    private Long modifyuserid;
    /**
    * 平台(1-社区,2-管理端,3-网盘,4-股票)
    */
    @Column(columnDefinition="int(2) comment '平台(1-社区,2-管理端,3-网盘,4-股票)'")
    @ApiModelProperty("平台(1-社区,2-管理端,3-网盘,4-股票)")
    private Integer platform;
    /**
    * 标题
    */
    @Column(columnDefinition="varchar(100) comment '标题'", nullable = false)
    @NotBlank(message="[标题]不能为空")
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("标题")
    @Length(max= 100,message="编码长度不能超过100")
    private String title;
    /**
    * 有效时间
    */
    @Column(columnDefinition="varchar(25) comment '有效时间'")
    @Size(max= 25,message="编码长度不能超过25")
    @ApiModelProperty("有效时间")
    @Length(max= 25,message="编码长度不能超过25")
    private String validdatetime;

}
