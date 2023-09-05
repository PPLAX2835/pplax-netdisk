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
* @TableName share
*/
@Data
@Table(name = "share")
@Entity
@TableName("share")
public class Share implements Serializable {

    /**
    * 
    */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @TableId(type = IdType.AUTO)
    @NotBlank(message="[]不能为空")
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("")
    @Length(max= 255,message="编码长度不能超过255")
    private String shareid;
    /**
    * 失效时间
    */
    @Column(columnDefinition="varchar(30) comment '失效时间'")
    @Size(max= 30,message="编码长度不能超过30")
    @ApiModelProperty("失效时间")
    @Length(max= 30,message="编码长度不能超过30")
    private String endtime;
    /**
    * 提取码
    */
    @Column(columnDefinition="varchar(10) comment '提取码'")
    @Size(max= 10,message="编码长度不能超过10")
    @ApiModelProperty("提取码")
    @Length(max= 10,message="编码长度不能超过10")
    private String extractioncode;
    /**
    * 分享批次号
    */
    @Column(columnDefinition="varchar(40) comment '分享批次号'")
    @Size(max= 40,message="编码长度不能超过40")
    @ApiModelProperty("分享批次号")
    @Length(max= 40,message="编码长度不能超过40")
    private String sharebatchnum;
    /**
    * 分享状态(0正常,1已失效,2已撤销)
    */
    @Column(columnDefinition="int(2) comment '分享状态(0正常,1已失效,2已撤销)'")
    @ApiModelProperty("分享状态(0正常,1已失效,2已撤销)")
    private Integer sharestatus;
    /**
    * 分享时间
    */
    @Column(columnDefinition="varchar(30) comment '分享时间'")
    @Size(max= 30,message="编码长度不能超过30")
    @ApiModelProperty("分享时间")
    @Length(max= 30,message="编码长度不能超过30")
    private String sharetime;
    /**
    * 分享类型(0公共,1私密,2好友)
    */
    @Column(columnDefinition="int(2) comment '分享类型(0公共,1私密,2好友)'")
    @ApiModelProperty("分享类型(0公共,1私密,2好友)")
    private Integer sharetype;
    /**
    * 用户id
    */
    @Column(columnDefinition="varchar(20) comment '用户id'")
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("用户id")
    @Length(max= 20,message="编码长度不能超过20")
    private String userid;

}
