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
* @TableName sys_param
*/
@Data
@Table(name = "sys_param")
@Entity
@TableName("sys_param")
public class SysParam implements Serializable {

    /**
    * 
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "bigint(20)")
    @TableId(type = IdType.AUTO)
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Long sysparamid;
    /**
    * 
    */
    @Column(columnDefinition = "varchar(50)")
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("")
    @Length(max= 50,message="编码长度不能超过50")
    private String groupname;
    /**
    * 
    */
    @Column(columnDefinition = "varchar(50)")
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("")
    @Length(max= 50,message="编码长度不能超过50")
    private String sysparamdesc;
    /**
    * 
    */
    @Column(columnDefinition = "varchar(50)")
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("")
    @Length(max= 50,message="编码长度不能超过50")
    private String sysparamkey;
    /**
    * 
    */
    @Column(columnDefinition = "varchar(50)")
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("")
    @Length(max= 50,message="编码长度不能超过50")
    private String sysparamvalue;

}
