package xyz.pplax.pplaxnetdisk.domain;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
* 
* @TableName common_file
*/
public class CommonFile implements Serializable {

    /**
    * 
    */
    @NotBlank(message="[]不能为空")
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("")
    @Length(max= 20,message="编码长度不能超过20")
    private String commonfileid;
    /**
    * 用户文件id
    */
    @ApiModelProperty("用户文件id")
    private Long userfileid;

    /**
    * 
    */
    private void setCommonfileid(String commonfileid){
    this.commonfileid = commonfileid;
    }

    /**
    * 用户文件id
    */
    private void setUserfileid(Long userfileid){
    this.userfileid = userfileid;
    }


    /**
    * 
    */
    private String getCommonfileid(){
    return this.commonfileid;
    }

    /**
    * 用户文件id
    */
    private Long getUserfileid(){
    return this.userfileid;
    }

}
