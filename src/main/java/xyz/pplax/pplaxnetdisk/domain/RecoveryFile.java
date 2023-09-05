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
* @TableName recovery_file
*/
@Data
@Table(name = "recovery_file", uniqueConstraints = {
        @UniqueConstraint(name = "user_file_id_index3", columnNames = {"userfileid"})
})
@Entity
@TableName("recovery_file")
public class RecoveryFile implements Serializable {

    /**
    * 
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(type = IdType.AUTO)
    @Column(columnDefinition="bigint(20)")
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Long recoveryfileid;
    /**
    * 删除批次号
    */
    @Column(columnDefinition = "varchar(50) comment '删除批次号'")
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("删除批次号")
    @Length(max= 50,message="编码长度不能超过50")
    private String deletebatchnum;
    /**
    * 删除时间
    */
    @Column(columnDefinition="varchar(25) comment '删除时间'")
    @Size(max= 25,message="编码长度不能超过25")
    @ApiModelProperty("删除时间")
    @Length(max= 25,message="编码长度不能超过25")
    private String deletetime;
    /**
    * 用户文件id
    */
    @Column(columnDefinition = "bigint(20) comment '用户文件id'")
    @ApiModelProperty("用户文件id")
    private Long userfileid;

}
