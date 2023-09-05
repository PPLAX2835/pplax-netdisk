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
* @TableName upload_task_detail
*/
@Data
@Table(name = "upload_task_detail")
@Entity
@TableName("upload_task_detail")
public class UploadTaskDetail implements Serializable {

    /**
    * 
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(type = IdType.AUTO)
    @Column(columnDefinition="bigint(20)")
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Long uploadtaskdetailid;
    /**
    * 当前分片数
    */
    @Column(columnDefinition="int(5) comment '当前分片数'")
    @ApiModelProperty("当前分片数")
    private Integer chunknumber;
    /**
    * 当前分片大小
    */
    @Column(columnDefinition="bigint(10) comment '当前分片大小'")
    @ApiModelProperty("当前分片大小")
    private Long chunksize;
    /**
    * 文件路径
    */
    @Column(columnDefinition="varchar(500) comment '文件路径'")
    @Size(max= 500,message="编码长度不能超过500")
    @ApiModelProperty("文件路径")
    @Length(max= 500,message="编码长度不能超过500")
    private String filepath;
    /**
    * 文件名称
    */
    @Column(columnDefinition="varchar(100) comment '文件名称'")
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("文件名称")
    @Length(max= 100,message="编码长度不能超过100")
    private String filename;
    /**
    * 文件md5唯一标识
    */
    @Column(columnDefinition="varchar(200) comment '文件md5唯一标识'")
    @Size(max= 200,message="编码长度不能超过200")
    @ApiModelProperty("文件md5唯一标识")
    @Length(max= 200,message="编码长度不能超过200")
    private String identifier;
    /**
    * 文件相对路径
    */
    @Column(columnDefinition="varchar(500) comment '文件相对路径'")
    @Size(max= 500,message="编码长度不能超过500")
    @ApiModelProperty("文件相对路径")
    @Length(max= 500,message="编码长度不能超过500")
    private String relativepath;
    /**
    * 文件总分片数
    */
    @Column(columnDefinition="int(5) comment '文件总分片数'")
    @ApiModelProperty("文件总分片数")
    private Integer totalchunks;
    /**
    * 文件总大小
    */
    @Column(columnDefinition="bigint(10) comment '文件总大小'")
    @ApiModelProperty("文件总大小")
    private Long totalsize;

}
