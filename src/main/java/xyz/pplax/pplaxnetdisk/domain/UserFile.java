package xyz.pplax.pplaxnetdisk.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import java.io.Serializable;

import cn.hutool.core.util.IdUtil;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.qiwenshare.common.util.DateUtil;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import xyz.pplax.pplaxnetdisk.io.PPLAXFile;

/**
* 
* @TableName user_file
*/
@Data
@Table(name = "user_file", uniqueConstraints = {
        @UniqueConstraint(name = "fileindex", columnNames = {"userid", "filepath", "filename", "extendname", "deleteflag", "isdir"})
})
@Entity
@TableName("userfile")
public class UserFile implements Serializable {

    /**
    * 
    */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @TableId(type = IdType.AUTO)
    @Column(nullable = false, columnDefinition = "varchar(20)")
    @NotBlank(message="[]不能为空")
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("")
    @Length(max= 20,message="编码长度不能超过20")
    private String userfileid;
    /**
    * 创建时间
    */
    @Column(columnDefinition="varchar(30) comment '创建时间'")
    @Size(max= 30,message="编码长度不能超过30")
    @ApiModelProperty("创建时间")
    @Length(max= 30,message="编码长度不能超过30")
    private String createtime;
    /**
    * 创建用户id
    */
    @Column(columnDefinition="varchar(20) comment '创建用户id'")
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("创建用户id")
    @Length(max= 20,message="编码长度不能超过20")
    private String createuserid;
    /**
    * 删除批次号
    */
    @Column(columnDefinition = "varchar(50) comment '删除批次号'")
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("删除批次号")
    @Length(max= 50,message="编码长度不能超过50")
    private String deletebatchnum;
    /**
    * 删除标识(0-未删除，1-已删除)
    */
    @Column(columnDefinition="int(11) comment '删除标识(0-未删除，1-已删除)'")
    @ApiModelProperty("删除标识(0-未删除，1-已删除)")
    private Integer deleteflag;
    /**
    * 删除时间
    */
    @Column(columnDefinition="varchar(25) comment '删除时间'")
    @Size(max= 25,message="编码长度不能超过25")
    @ApiModelProperty("删除时间")
    @Length(max= 25,message="编码长度不能超过25")
    private String deletetime;
    /**
    * 扩展名
    */
    @Column(columnDefinition="varchar(100) NULL DEFAULT '' comment '扩展名'")
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("扩展名")
    @Length(max= 100,message="编码长度不能超过100")
    private String extendname;
    /**
    * 文件id
    */
    @Column(columnDefinition="varchar(20) comment '文件id'")
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("文件id")
    @Length(max= 20,message="编码长度不能超过20")
    private String fileid;
    /**
    * 文件名
    */
    @Column(columnDefinition="varchar(100) comment '文件名'")
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("文件名")
    @Length(max= 100,message="编码长度不能超过100")
    private String filename;
    /**
    * 文件路径
    */
    @Column(columnDefinition="varchar(500) comment '文件路径'")
    @Size(max= 500,message="编码长度不能超过500")
    @ApiModelProperty("文件路径")
    @Length(max= 500,message="编码长度不能超过500")
    private String filepath;
    /**
    * 是否是目录(0-否,1-是)
    */
    @Column(columnDefinition="int(1) comment '是否是目录(0-否,1-是)'")
    @ApiModelProperty("是否是目录(0-否,1-是)")
    private Integer isdir;
    /**
    * 修改时间
    */
    @Column(columnDefinition="varchar(30) comment '修改时间'")
    @Size(max= 30,message="编码长度不能超过30")
    @ApiModelProperty("修改时间")
    @Length(max= 30,message="编码长度不能超过30")
    private String modifytime;
    /**
    * 修改用户id
    */
    @Column(columnDefinition="varchar(20) comment '修改用户id'")
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("修改用户id")
    @Length(max= 20,message="编码长度不能超过20")
    private String modifyuserid;
    /**
    * 修改时间
    */
    @Column(columnDefinition="varchar(25) comment '修改时间'")
    @Size(max= 25,message="编码长度不能超过25")
    @ApiModelProperty("修改时间")
    @Length(max= 25,message="编码长度不能超过25")
    private String uploadtime;
    /**
    * 用户id
    */
    @Column(columnDefinition = "bigint(20) comment '用户id'")
    @ApiModelProperty("用户id")
    private Long userid;


    public UserFile() {};
    public UserFile(PPLAXFile pplaxFile, String userId, String fileId) {
        this.userfileid = IdUtil.getSnowflakeNextIdStr();
        this.userid = Long.valueOf(userId);
        this.fileid = fileId;
        this.filepath = pplaxFile.getParent();
        this.filename = pplaxFile.getNameNotExtend();
        this.extendname = pplaxFile.getExtendName();
        this.isdir = pplaxFile.isDirectory() ? 1 : 0;
        String currentTime = DateUtil.getCurrentTime();
        this.setUploadtime(currentTime);
        this.setCreateuserid(userId);
        this.setCreatetime(currentTime);
        this.deleteflag = 0;
    }

    public boolean isDirectory() {
        return this.isdir == 1;
    }

    public boolean isFile() {
        return this.isdir == 0;
    }

}
