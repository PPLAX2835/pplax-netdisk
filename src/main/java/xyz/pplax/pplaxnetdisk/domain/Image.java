package xyz.pplax.pplaxnetdisk.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 
* @TableName image
*/
public class Image implements Serializable {

    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Long imageid;
    /**
    * 文件id
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("文件id")
    @Length(max= 20,message="编码长度不能超过20")
    private String fileid;
    /**
    * 图像的高
    */
    @ApiModelProperty("图像的高")
    private Integer imageheight;
    /**
    * 图像的宽
    */
    @ApiModelProperty("图像的宽")
    private Integer imagewidth;

    /**
    * 
    */
    private void setImageid(Long imageid){
    this.imageid = imageid;
    }

    /**
    * 文件id
    */
    private void setFileid(String fileid){
    this.fileid = fileid;
    }

    /**
    * 图像的高
    */
    private void setImageheight(Integer imageheight){
    this.imageheight = imageheight;
    }

    /**
    * 图像的宽
    */
    private void setImagewidth(Integer imagewidth){
    this.imagewidth = imagewidth;
    }


    /**
    * 
    */
    private Long getImageid(){
    return this.imageid;
    }

    /**
    * 文件id
    */
    private String getFileid(){
    return this.fileid;
    }

    /**
    * 图像的高
    */
    private Integer getImageheight(){
    return this.imageheight;
    }

    /**
    * 图像的宽
    */
    private Integer getImagewidth(){
    return this.imagewidth;
    }

}
