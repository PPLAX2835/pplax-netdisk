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
* @TableName share_file
*/
@Data
@Table(name = "share_file")
@Entity
@TableName("share_file")
public class ShareFile implements Serializable {

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
    private String sharefileid;
    /**
    * 分享批次号
    */
    @Column(columnDefinition="varchar(50) comment '分享批次号'")
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("分享批次号")
    @Length(max= 50,message="编码长度不能超过50")
    private String sharebatchnum;
    /**
    * 分享文件路径
    */
    @Column(columnDefinition="varchar(100) comment '分享文件路径'")
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("分享文件路径")
    @Length(max= 100,message="编码长度不能超过100")
    private String sharefilepath;
    /**
    * 用户文件id
    */
    @Column(columnDefinition="varchar(20) comment '用户文件id'")
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("用户文件id")
    @Length(max= 20,message="编码长度不能超过20")
    private String userfileid;

}
