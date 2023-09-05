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
* @TableName file_type
*/
@Data
@Table(name = "file_type")
@Entity
@TableName("file_type")
public class FileType implements Serializable {

    /**
    *
    */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @TableId(type = IdType.AUTO)
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Integer filetypeid;
    /**
    * 文件类型名
    */
    @Column(columnDefinition="varchar(50) comment '文件类型名'")
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("文件类型名")
    @Length(max= 50,message="编码长度不能超过50")
    private String filetypename;
    /**
    * 次序
    */
    @Column(columnDefinition="int(2) comment '次序'")
    @ApiModelProperty("次序")
    private Integer ordernum;

}
