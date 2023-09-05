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
* @TableName picture_file
*/
@Data
@Table(name = "picture_file")
@Entity
@TableName("picture_file")
public class PictureFile implements Serializable {

    /**
    * 
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(type = IdType.AUTO)
    @Column(columnDefinition="bigint(20)")
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Long picturefileid;
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
    * 扩展名
    */
    @Column(columnDefinition="varchar(100) comment '扩展名'")
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("扩展名")
    @Length(max= 100,message="编码长度不能超过100")
    private String extendname;
    /**
    * 文件名
    */
    @Column(columnDefinition="varchar(100) comment '文件名'")
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("文件名")
    @Length(max= 100,message="编码长度不能超过100")
    private String filename;
    /**
    * 文件大小
    */
    @Column(columnDefinition="bigint(10) comment '文件大小'")
    @ApiModelProperty("文件大小")
    private Long filesize;
    /**
    * 文件url
    */
    @Column(columnDefinition="varchar(500) comment '文件url'")
    @Size(max= 500,message="编码长度不能超过500")
    @ApiModelProperty("文件url")
    @Length(max= 500,message="编码长度不能超过500")
    private String fileurl;
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
    * 存储类型
    */
    @Column(columnDefinition="int(1) comment '存储类型'")
    @ApiModelProperty("存储类型")
    private Integer storagetype;
    /**
    * 用户id
    */
    @Column(columnDefinition = "bigint(20) comment '用户id'")
    @ApiModelProperty("用户id")
    private Long userid;

}
