package xyz.pplax.pplaxnetdisk.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 
* @TableName operation_log
*/
public class OperationLog implements Serializable {

    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Long operationlogid;
    /**
    * 操作详情
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("操作详情")
    @Length(max= 100,message="编码长度不能超过100")
    private String detail;
    /**
    * 
    */
    @ApiModelProperty("")
    private Integer loglevel;
    /**
    * 操作
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("操作")
    @Length(max= 50,message="编码长度不能超过50")
    private String operation;
    /**
    * 
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("")
    @Length(max= 255,message="编码长度不能超过255")
    private String operationobj;
    /**
    * 平台(1-社区,2-管理端,3-网盘,4-股票)
    */
    @ApiModelProperty("平台(1-社区,2-管理端,3-网盘,4-股票)")
    private Integer platform;
    /**
    * 
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("")
    @Length(max= 255,message="编码长度不能超过255")
    private String requestmethod;
    /**
    * 
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("")
    @Length(max= 255,message="编码长度不能超过255")
    private String requesturi;
    /**
    * 操作结果
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("操作结果")
    @Length(max= 20,message="编码长度不能超过20")
    private String result;
    /**
    * 
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("")
    @Length(max= 255,message="编码长度不能超过255")
    private String source;
    /**
    * 终端ip地址
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("终端ip地址")
    @Length(max= 20,message="编码长度不能超过20")
    private String terminal;
    /**
    * 操作时间
    */
    @Size(max= 25,message="编码长度不能超过25")
    @ApiModelProperty("操作时间")
    @Length(max= 25,message="编码长度不能超过25")
    private String time;
    /**
    * 用户id
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("用户id")
    @Length(max= 20,message="编码长度不能超过20")
    private String userid;

    /**
    * 
    */
    private void setOperationlogid(Long operationlogid){
    this.operationlogid = operationlogid;
    }

    /**
    * 操作详情
    */
    private void setDetail(String detail){
    this.detail = detail;
    }

    /**
    * 
    */
    private void setLoglevel(Integer loglevel){
    this.loglevel = loglevel;
    }

    /**
    * 操作
    */
    private void setOperation(String operation){
    this.operation = operation;
    }

    /**
    * 
    */
    private void setOperationobj(String operationobj){
    this.operationobj = operationobj;
    }

    /**
    * 平台(1-社区,2-管理端,3-网盘,4-股票)
    */
    private void setPlatform(Integer platform){
    this.platform = platform;
    }

    /**
    * 
    */
    private void setRequestmethod(String requestmethod){
    this.requestmethod = requestmethod;
    }

    /**
    * 
    */
    private void setRequesturi(String requesturi){
    this.requesturi = requesturi;
    }

    /**
    * 操作结果
    */
    private void setResult(String result){
    this.result = result;
    }

    /**
    * 
    */
    private void setSource(String source){
    this.source = source;
    }

    /**
    * 终端ip地址
    */
    private void setTerminal(String terminal){
    this.terminal = terminal;
    }

    /**
    * 操作时间
    */
    private void setTime(String time){
    this.time = time;
    }

    /**
    * 用户id
    */
    private void setUserid(String userid){
    this.userid = userid;
    }


    /**
    * 
    */
    private Long getOperationlogid(){
    return this.operationlogid;
    }

    /**
    * 操作详情
    */
    private String getDetail(){
    return this.detail;
    }

    /**
    * 
    */
    private Integer getLoglevel(){
    return this.loglevel;
    }

    /**
    * 操作
    */
    private String getOperation(){
    return this.operation;
    }

    /**
    * 
    */
    private String getOperationobj(){
    return this.operationobj;
    }

    /**
    * 平台(1-社区,2-管理端,3-网盘,4-股票)
    */
    private Integer getPlatform(){
    return this.platform;
    }

    /**
    * 
    */
    private String getRequestmethod(){
    return this.requestmethod;
    }

    /**
    * 
    */
    private String getRequesturi(){
    return this.requesturi;
    }

    /**
    * 操作结果
    */
    private String getResult(){
    return this.result;
    }

    /**
    * 
    */
    private String getSource(){
    return this.source;
    }

    /**
    * 终端ip地址
    */
    private String getTerminal(){
    return this.terminal;
    }

    /**
    * 操作时间
    */
    private String getTime(){
    return this.time;
    }

    /**
    * 用户id
    */
    private String getUserid(){
    return this.userid;
    }

}
