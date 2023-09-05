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
* @TableName image
*/
@Data
@Table(name = "image")
@Entity
@TableName("image")
public class Image implements Serializable {

    /**
    * 
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(type = IdType.AUTO)
    @Column(columnDefinition="bigint(20)")
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Long imageid;
    /**
    * 文件id
    */
    @Column(columnDefinition = "varchar(20) comment '文件id'")
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("文件id")
    @Length(max= 20,message="编码长度不能超过20")
    private String fileid;
    /**
    * 图像的高
    */
    @Column(columnDefinition="int(5) comment '图像的高'")
    @ApiModelProperty("图像的高")
    private Integer imageheight;
    /**
    * 图像的宽
    */
    @Column(columnDefinition="int(5) comment '图像的宽'")
    @ApiModelProperty("图像的宽")
    private Integer imagewidth;

}
