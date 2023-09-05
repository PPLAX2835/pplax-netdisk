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
* @TableName file_classification
*/
@Data
@Table(name = "file_classification")
@Entity
@TableName("file_classification")
public class FileClassification implements Serializable {

    /**
    * 
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(type = IdType.AUTO)
    @Column(columnDefinition="bigint(20)")
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Long fileclassificationid;
    /**
    * 文件扩展名
    */
    @Column(columnDefinition="varchar(25) comment '文件扩展名'")
    @Size(max= 25,message="编码长度不能超过25")
    @ApiModelProperty("文件扩展名")
    @Length(max= 25,message="编码长度不能超过25")
    private String fileextendname;
    /**
    * 文件类型id
    */
    @Column(columnDefinition="bigint(20) comment '文件类型id'")
    @ApiModelProperty("文件类型id")
    private Long filetypeid;

}
