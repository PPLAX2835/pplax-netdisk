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
* @TableName storage
*/
@Data
@Table(name = "storage", uniqueConstraints = {
        @UniqueConstraint(name = "userid_index", columnNames = {"userid"})
})
@Entity
@TableName("storage")
public class Storage implements Serializable {

    /**
    * 
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition="bigint(20)")
    @TableId(type = IdType.AUTO)
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Long storageid;
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
    * 占用存储大小
    */
    @Column(columnDefinition="bigint(20) comment '占用存储大小'")
    @ApiModelProperty("占用存储大小")
    private Long storagesize;
    /**
    * 总存储大小
    */
    @Column(columnDefinition="bigint(20) comment '总存储大小'")
    @ApiModelProperty("总存储大小")
    private Long totalstoragesize;
    /**
    * 
    */
    @Column(columnDefinition="varchar(20)")
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("")
    @Length(max= 20,message="编码长度不能超过20")
    private String userid;

    public Storage() {

    }

    public Storage(String userId) {
        this.userid = userId;
    }
}
