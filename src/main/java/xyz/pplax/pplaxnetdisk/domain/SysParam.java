package xyz.pplax.pplaxnetdisk.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 
* @TableName sys_param
*/
public class SysParam implements Serializable {

    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Long sysparamid;
    /**
    * 
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("")
    @Length(max= 50,message="编码长度不能超过50")
    private String groupname;
    /**
    * 
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("")
    @Length(max= 50,message="编码长度不能超过50")
    private String sysparamdesc;
    /**
    * 
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("")
    @Length(max= 50,message="编码长度不能超过50")
    private String sysparamkey;
    /**
    * 
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("")
    @Length(max= 50,message="编码长度不能超过50")
    private String sysparamvalue;

    /**
    * 
    */
    private void setSysparamid(Long sysparamid){
    this.sysparamid = sysparamid;
    }

    /**
    * 
    */
    private void setGroupname(String groupname){
    this.groupname = groupname;
    }

    /**
    * 
    */
    private void setSysparamdesc(String sysparamdesc){
    this.sysparamdesc = sysparamdesc;
    }

    /**
    * 
    */
    private void setSysparamkey(String sysparamkey){
    this.sysparamkey = sysparamkey;
    }

    /**
    * 
    */
    private void setSysparamvalue(String sysparamvalue){
    this.sysparamvalue = sysparamvalue;
    }


    /**
    * 
    */
    private Long getSysparamid(){
    return this.sysparamid;
    }

    /**
    * 
    */
    private String getGroupname(){
    return this.groupname;
    }

    /**
    * 
    */
    private String getSysparamdesc(){
    return this.sysparamdesc;
    }

    /**
    * 
    */
    private String getSysparamkey(){
    return this.sysparamkey;
    }

    /**
    * 
    */
    private String getSysparamvalue(){
    return this.sysparamvalue;
    }

}
