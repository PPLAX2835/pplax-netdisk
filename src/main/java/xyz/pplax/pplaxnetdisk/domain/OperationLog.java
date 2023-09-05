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
* @TableName operation_log
*/
@Data
@Table(name = "operation_log")
@Entity
@TableName("operation_log")
public class OperationLog implements Serializable {

    /**
    * 操作日志id
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(type = IdType.AUTO)
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Long operationlogid;
    /**
    * 操作详情
    */
    @Column(columnDefinition="varchar(100) comment '操作详情'")
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("操作详情")
    @Length(max= 100,message="编码长度不能超过100")
    private String detail;
    /**
    * 
    */
    @Column(columnDefinition="int comment '日志级别 1-正常 2-警告 3-错误'")
    @ApiModelProperty("")
    private Integer loglevel;
    /**
    * 操作
    */
    @Column(columnDefinition="varchar(50) comment '操作'")
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("操作")
    @Length(max= 50,message="编码长度不能超过50")
    private String operation;
    /**
    * 
    */
    @Column(columnDefinition="varchar(255) comment '操作对象'")
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("")
    @Length(max= 255,message="编码长度不能超过255")
    private String operationobj;
    /**
    * 平台(1-社区,2-管理端,3-网盘,4-股票)
    */
    @Column(columnDefinition="int(2) comment '平台(1-社区,2-管理端,3-网盘,4-股票)'")
    @ApiModelProperty("平台(1-社区,2-管理端,3-网盘,4-股票)")
    private Integer platform;
    /**
    * 
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("")
    @Length(max= 255,message="编码长度不能超过255")
    private String requestmethod;
    /**
    * 
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("")
    @Length(max= 255,message="编码长度不能超过255")
    private String requesturi;
    /**
    * 操作结果
    */
    @Column(columnDefinition="varchar(20) comment '操作结果'")
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("操作结果")
    @Length(max= 20,message="编码长度不能超过20")
    private String result;
    /**
    * 
    */
    @Column(columnDefinition="varchar(255) comment '操作源'")
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("")
    @Length(max= 255,message="编码长度不能超过255")
    private String source;
    /**
    * 终端ip地址
    */
    @Column(columnDefinition="varchar(20) comment '终端ip地址'")
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("终端ip地址")
    @Length(max= 20,message="编码长度不能超过20")
    private String terminal;
    /**
    * 操作时间
    */
    @Column(columnDefinition="varchar(25) comment '操作时间'")
    @Size(max= 25,message="编码长度不能超过25")
    @ApiModelProperty("操作时间")
    @Length(max= 25,message="编码长度不能超过25")
    private String time;
    /**
    * 用户id
    */
    @Column(columnDefinition="varchar(20) comment '用户id'")
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("用户id")
    @Length(max= 20,message="编码长度不能超过20")
    private String userid;

}
