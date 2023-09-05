package xyz.pplax.pplaxnetdisk.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 
* @TableName file_classification
*/
public class FileClassification implements Serializable {

    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Long fileclassificationid;
    /**
    * 文件扩展名
    */
    @Size(max= 25,message="编码长度不能超过25")
    @ApiModelProperty("文件扩展名")
    @Length(max= 25,message="编码长度不能超过25")
    private String fileextendname;
    /**
    * 文件类型id
    */
    @ApiModelProperty("文件类型id")
    private Long filetypeid;

    /**
    * 
    */
    private void setFileclassificationid(Long fileclassificationid){
    this.fileclassificationid = fileclassificationid;
    }

    /**
    * 文件扩展名
    */
    private void setFileextendname(String fileextendname){
    this.fileextendname = fileextendname;
    }

    /**
    * 文件类型id
    */
    private void setFiletypeid(Long filetypeid){
    this.filetypeid = filetypeid;
    }


    /**
    * 
    */
    private Long getFileclassificationid(){
    return this.fileclassificationid;
    }

    /**
    * 文件扩展名
    */
    private String getFileextendname(){
    return this.fileextendname;
    }

    /**
    * 文件类型id
    */
    private Long getFiletypeid(){
    return this.filetypeid;
    }

}
