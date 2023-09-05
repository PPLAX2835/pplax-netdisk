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
* @TableName file_permission
*/
@Data
@Table(name = "file_permission")
@Entity
@TableName("file_permission")
public class FilePermission implements Serializable {

    /**
    * 
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(type = IdType.AUTO)
    @Column(columnDefinition="bigint(20)")
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Long filepermissionid;
    /**
    * 共享文件id
    */
    @Column(columnDefinition="varchar(20)  comment '共享文件id'")
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("共享文件id")
    @Length(max= 20,message="编码长度不能超过20")
    private String commonfileid;
    /**
    * 用户对文件的权限码
    */
    @Column(columnDefinition="int(2) comment '用户对文件的权限码'")
    @ApiModelProperty("用户对文件的权限码")
    private Integer filepermissioncode;
    /**
    * 用户id
    */
    @Column(columnDefinition="bigint(20) comment '用户id'")
    @ApiModelProperty("用户id")
    private Long userid;

}
