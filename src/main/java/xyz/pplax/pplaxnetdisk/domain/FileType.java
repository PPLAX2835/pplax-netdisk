package xyz.pplax.pplaxnetdisk.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 
* @TableName file_type
*/
public class FileType implements Serializable {

    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Integer filetypeid;
    /**
    * 文件类型名
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("文件类型名")
    @Length(max= 50,message="编码长度不能超过50")
    private String filetypename;
    /**
    * 次序
    */
    @ApiModelProperty("次序")
    private Integer ordernum;

    /**
    * 
    */
    private void setFiletypeid(Integer filetypeid){
    this.filetypeid = filetypeid;
    }

    /**
    * 文件类型名
    */
    private void setFiletypename(String filetypename){
    this.filetypename = filetypename;
    }

    /**
    * 次序
    */
    private void setOrdernum(Integer ordernum){
    this.ordernum = ordernum;
    }


    /**
    * 
    */
    private Integer getFiletypeid(){
    return this.filetypeid;
    }

    /**
    * 文件类型名
    */
    private String getFiletypename(){
    return this.filetypename;
    }

    /**
    * 次序
    */
    private Integer getOrdernum(){
    return this.ordernum;
    }

}
