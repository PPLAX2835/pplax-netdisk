package xyz.pplax.pplaxnetdisk.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 
* @TableName upload_task_detail
*/
public class UploadTaskDetail implements Serializable {

    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Long uploadtaskdetailid;
    /**
    * 当前分片数
    */
    @ApiModelProperty("当前分片数")
    private Integer chunknumber;
    /**
    * 当前分片大小
    */
    @ApiModelProperty("当前分片大小")
    private Long chunksize;
    /**
    * 文件路径
    */
    @Size(max= 500,message="编码长度不能超过500")
    @ApiModelProperty("文件路径")
    @Length(max= 500,message="编码长度不能超过500")
    private String filepath;
    /**
    * 文件名称
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("文件名称")
    @Length(max= 100,message="编码长度不能超过100")
    private String filename;
    /**
    * 文件md5唯一标识
    */
    @Size(max= 200,message="编码长度不能超过200")
    @ApiModelProperty("文件md5唯一标识")
    @Length(max= 200,message="编码长度不能超过200")
    private String identifier;
    /**
    * 文件相对路径
    */
    @Size(max= 500,message="编码长度不能超过500")
    @ApiModelProperty("文件相对路径")
    @Length(max= 500,message="编码长度不能超过500")
    private String relativepath;
    /**
    * 文件总分片数
    */
    @ApiModelProperty("文件总分片数")
    private Integer totalchunks;
    /**
    * 文件总大小
    */
    @ApiModelProperty("文件总大小")
    private Long totalsize;

    /**
    * 
    */
    private void setUploadtaskdetailid(Long uploadtaskdetailid){
    this.uploadtaskdetailid = uploadtaskdetailid;
    }

    /**
    * 当前分片数
    */
    private void setChunknumber(Integer chunknumber){
    this.chunknumber = chunknumber;
    }

    /**
    * 当前分片大小
    */
    private void setChunksize(Long chunksize){
    this.chunksize = chunksize;
    }

    /**
    * 文件路径
    */
    private void setFilepath(String filepath){
    this.filepath = filepath;
    }

    /**
    * 文件名称
    */
    private void setFilename(String filename){
    this.filename = filename;
    }

    /**
    * 文件md5唯一标识
    */
    private void setIdentifier(String identifier){
    this.identifier = identifier;
    }

    /**
    * 文件相对路径
    */
    private void setRelativepath(String relativepath){
    this.relativepath = relativepath;
    }

    /**
    * 文件总分片数
    */
    private void setTotalchunks(Integer totalchunks){
    this.totalchunks = totalchunks;
    }

    /**
    * 文件总大小
    */
    private void setTotalsize(Long totalsize){
    this.totalsize = totalsize;
    }


    /**
    * 
    */
    private Long getUploadtaskdetailid(){
    return this.uploadtaskdetailid;
    }

    /**
    * 当前分片数
    */
    private Integer getChunknumber(){
    return this.chunknumber;
    }

    /**
    * 当前分片大小
    */
    private Long getChunksize(){
    return this.chunksize;
    }

    /**
    * 文件路径
    */
    private String getFilepath(){
    return this.filepath;
    }

    /**
    * 文件名称
    */
    private String getFilename(){
    return this.filename;
    }

    /**
    * 文件md5唯一标识
    */
    private String getIdentifier(){
    return this.identifier;
    }

    /**
    * 文件相对路径
    */
    private String getRelativepath(){
    return this.relativepath;
    }

    /**
    * 文件总分片数
    */
    private Integer getTotalchunks(){
    return this.totalchunks;
    }

    /**
    * 文件总大小
    */
    private Long getTotalsize(){
    return this.totalsize;
    }

}
