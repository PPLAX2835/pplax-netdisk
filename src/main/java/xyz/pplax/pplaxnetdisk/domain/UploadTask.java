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
* @TableName upload_task
*/
@Data
@Table(name = "upload_task")
@Entity
@TableName("upload_task")
public class UploadTask implements Serializable {

    /**
    * 
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(type = IdType.AUTO)
    @Column(columnDefinition = "bigint(20)")
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Long uploadtaskid;
    /**
    * 扩展名
    */
    @Column(columnDefinition="varchar(100) comment '扩展名'")
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("扩展名")
    @Length(max= 100,message="编码长度不能超过100")
    private String extendname;
    /**
    * 文件名称
    */
    @Column(columnDefinition="varchar(100) comment '文件名称'")
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("文件名称")
    @Length(max= 100,message="编码长度不能超过100")
    private String filename;
    /**
    * 文件路径
    */
    @Column(columnDefinition="varchar(500) comment '文件路径'")
    @Size(max= 500,message="编码长度不能超过500")
    @ApiModelProperty("文件路径")
    @Length(max= 500,message="编码长度不能超过500")
    private String filepath;
    /**
    * md5唯一标识
    */
    @Column(columnDefinition="varchar(200) comment 'md5唯一标识'")
    @Size(max= 200,message="编码长度不能超过200")
    @ApiModelProperty("md5唯一标识")
    @Length(max= 200,message="编码长度不能超过200")
    private String identifier;
    /**
    * 上传状态(1-成功,0-失败或未完成)
    */
    @Column(columnDefinition="int(1) comment '上传状态(1-成功,0-失败或未完成)'")
    @ApiModelProperty("上传状态(1-成功,0-失败或未完成)")
    private Integer uploadstatus;
    /**
    * 上传时间
    */
    @Column(columnDefinition="varchar(25) comment '上传时间'")
    @Size(max= 25,message="编码长度不能超过25")
    @ApiModelProperty("上传时间")
    @Length(max= 25,message="编码长度不能超过25")
    private String uploadtime;
    /**
    * 用户id
    */
    @Column(columnDefinition = "bigint(20) comment '用户id'")
    @ApiModelProperty("用户id")
    private Long userid;

}
