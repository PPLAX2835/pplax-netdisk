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
* @TableName file_extend
*/
@Data
@Table(name = "file_extend")
@Entity
@TableName("file_extend")
public class FileExtend implements Serializable {

    /**
    * 
    */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @TableId(type = IdType.AUTO)
    @Column(columnDefinition="varchar(25)")
    @NotBlank(message="[]不能为空")
    @Size(max= 25,message="编码长度不能超过25")
    @ApiModelProperty("")
    @Length(max= 25,message="编码长度不能超过25")
    private String fileextendname;
    /**
    * 文件扩展名描述
    */
    @Column(columnDefinition="varchar(25) comment '文件扩展名描述'")
    @Size(max= 25,message="编码长度不能超过25")
    @ApiModelProperty("文件扩展名描述")
    @Length(max= 25,message="编码长度不能超过25")
    private String fileextenddesc;
    /**
    * 文件扩展名预览图
    */
    @Column(columnDefinition="varchar(100) comment '文件扩展名预览图'")
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("文件扩展名预览图")
    @Length(max= 100,message="编码长度不能超过100")
    private String fileextendimgurl;

}
