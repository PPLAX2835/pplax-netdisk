package xyz.pplax.pplaxnetdisk.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 
* @TableName file_extend
*/
public class FileExtend implements Serializable {

    /**
    * 
    */
    @NotBlank(message="[]不能为空")
    @Size(max= 25,message="编码长度不能超过25")
    @ApiModelProperty("")
    @Length(max= 25,message="编码长度不能超过25")
    private String fileextendname;
    /**
    * 文件扩展名描述
    */
    @Size(max= 25,message="编码长度不能超过25")
    @ApiModelProperty("文件扩展名描述")
    @Length(max= 25,message="编码长度不能超过25")
    private String fileextenddesc;
    /**
    * 文件扩展名预览图
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("文件扩展名预览图")
    @Length(max= 100,message="编码长度不能超过100")
    private String fileextendimgurl;

    /**
    * 
    */
    private void setFileextendname(String fileextendname){
    this.fileextendname = fileextendname;
    }

    /**
    * 文件扩展名描述
    */
    private void setFileextenddesc(String fileextenddesc){
    this.fileextenddesc = fileextenddesc;
    }

    /**
    * 文件扩展名预览图
    */
    private void setFileextendimgurl(String fileextendimgurl){
    this.fileextendimgurl = fileextendimgurl;
    }


    /**
    * 
    */
    private String getFileextendname(){
    return this.fileextendname;
    }

    /**
    * 文件扩展名描述
    */
    private String getFileextenddesc(){
    return this.fileextenddesc;
    }

    /**
    * 文件扩展名预览图
    */
    private String getFileextendimgurl(){
    return this.fileextendimgurl;
    }

}
