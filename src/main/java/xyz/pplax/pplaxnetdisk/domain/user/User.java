package xyz.pplax.pplaxnetdisk.domain.user;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 
* @TableName user
*/
public class User implements Serializable {

    /**
    * 
    */
    @NotBlank(message="[]不能为空")
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("")
    @Length(max= 20,message="编码长度不能超过20")
    private String userid;
    /**
    * 区
    */
    @Size(max= 10,message="编码长度不能超过10")
    @ApiModelProperty("区")
    @Length(max= 10,message="编码长度不能超过10")
    private String addrarea;
    /**
    * 市
    */
    @Size(max= 10,message="编码长度不能超过10")
    @ApiModelProperty("市")
    @Length(max= 10,message="编码长度不能超过10")
    private String addrcity;
    /**
    * 省
    */
    @Size(max= 10,message="编码长度不能超过10")
    @ApiModelProperty("省")
    @Length(max= 10,message="编码长度不能超过10")
    private String addrprovince;
    /**
    * 是否可用(0-不可用,1-可用)
    */
    @ApiModelProperty("是否可用(0-不可用,1-可用)")
    private Integer available;
    /**
    * 生日
    */
    @Size(max= 30,message="编码长度不能超过30")
    @ApiModelProperty("生日")
    @Length(max= 30,message="编码长度不能超过30")
    private String birthday;
    /**
    * 邮箱
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("邮箱")
    @Length(max= 100,message="编码长度不能超过100")
    private String email;
    /**
    * 头像
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("头像")
    @Length(max= 100,message="编码长度不能超过100")
    private String imageurl;
    /**
    * 行业
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("行业")
    @Length(max= 50,message="编码长度不能超过50")
    private String industry;
    /**
    * 个人简介
    */
    @Size(max= 5000,message="编码长度不能超过5000")
    @ApiModelProperty("个人简介")
    @Length(max= 5000,message="编码长度不能超过5,000")
    private String intro;
    /**
    * 最后登录时间
    */
    @Size(max= 30,message="编码长度不能超过30")
    @ApiModelProperty("最后登录时间")
    @Length(max= 30,message="编码长度不能超过30")
    private String lastlogintime;
    /**
    * 修改时间
    */
    @Size(max= 30,message="编码长度不能超过30")
    @ApiModelProperty("修改时间")
    @Length(max= 30,message="编码长度不能超过30")
    private String modifytime;
    /**
    * 修改用户id
    */
    @ApiModelProperty("修改用户id")
    private Long modifyuserid;
    /**
    * 密码
    */
    @Size(max= 35,message="编码长度不能超过35")
    @ApiModelProperty("密码")
    @Length(max= 35,message="编码长度不能超过35")
    private String password;
    /**
    * 地区
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("地区")
    @Length(max= 50,message="编码长度不能超过50")
    private String position;
    /**
    * 注册时间
    */
    @Size(max= 30,message="编码长度不能超过30")
    @ApiModelProperty("注册时间")
    @Length(max= 30,message="编码长度不能超过30")
    private String registertime;
    /**
    * 盐
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("盐")
    @Length(max= 20,message="编码长度不能超过20")
    private String salt;
    /**
    * 性别
    */
    @Size(max= 3,message="编码长度不能超过3")
    @ApiModelProperty("性别")
    @Length(max= 3,message="编码长度不能超过3")
    private String sex;
    /**
    * 手机号
    */
    @Size(max= 15,message="编码长度不能超过15")
    @ApiModelProperty("手机号")
    @Length(max= 15,message="编码长度不能超过15")
    private String telephone;
    /**
    * 用户名
    */
    @Size(max= 30,message="编码长度不能超过30")
    @ApiModelProperty("用户名")
    @Length(max= 30,message="编码长度不能超过30")
    private String username;
    /**
    * open id
    */
    @Size(max= 28,message="编码长度不能超过28")
    @ApiModelProperty("open id")
    @Length(max= 28,message="编码长度不能超过28")
    private String wxopenid;

    /**
    * 
    */
    private void setUserid(String userid){
    this.userid = userid;
    }

    /**
    * 区
    */
    private void setAddrarea(String addrarea){
    this.addrarea = addrarea;
    }

    /**
    * 市
    */
    private void setAddrcity(String addrcity){
    this.addrcity = addrcity;
    }

    /**
    * 省
    */
    private void setAddrprovince(String addrprovince){
    this.addrprovince = addrprovince;
    }

    /**
    * 是否可用(0-不可用,1-可用)
    */
    private void setAvailable(Integer available){
    this.available = available;
    }

    /**
    * 生日
    */
    private void setBirthday(String birthday){
    this.birthday = birthday;
    }

    /**
    * 邮箱
    */
    private void setEmail(String email){
    this.email = email;
    }

    /**
    * 头像
    */
    private void setImageurl(String imageurl){
    this.imageurl = imageurl;
    }

    /**
    * 行业
    */
    private void setIndustry(String industry){
    this.industry = industry;
    }

    /**
    * 个人简介
    */
    private void setIntro(String intro){
    this.intro = intro;
    }

    /**
    * 最后登录时间
    */
    private void setLastlogintime(String lastlogintime){
    this.lastlogintime = lastlogintime;
    }

    /**
    * 修改时间
    */
    private void setModifytime(String modifytime){
    this.modifytime = modifytime;
    }

    /**
    * 修改用户id
    */
    private void setModifyuserid(Long modifyuserid){
    this.modifyuserid = modifyuserid;
    }

    /**
    * 密码
    */
    private void setPassword(String password){
    this.password = password;
    }

    /**
    * 地区
    */
    private void setPosition(String position){
    this.position = position;
    }

    /**
    * 注册时间
    */
    private void setRegistertime(String registertime){
    this.registertime = registertime;
    }

    /**
    * 盐
    */
    private void setSalt(String salt){
    this.salt = salt;
    }

    /**
    * 性别
    */
    private void setSex(String sex){
    this.sex = sex;
    }

    /**
    * 手机号
    */
    private void setTelephone(String telephone){
    this.telephone = telephone;
    }

    /**
    * 用户名
    */
    private void setUsername(String username){
    this.username = username;
    }

    /**
    * open id
    */
    private void setWxopenid(String wxopenid){
    this.wxopenid = wxopenid;
    }


    /**
    * 
    */
    private String getUserid(){
    return this.userid;
    }

    /**
    * 区
    */
    private String getAddrarea(){
    return this.addrarea;
    }

    /**
    * 市
    */
    private String getAddrcity(){
    return this.addrcity;
    }

    /**
    * 省
    */
    private String getAddrprovince(){
    return this.addrprovince;
    }

    /**
    * 是否可用(0-不可用,1-可用)
    */
    private Integer getAvailable(){
    return this.available;
    }

    /**
    * 生日
    */
    private String getBirthday(){
    return this.birthday;
    }

    /**
    * 邮箱
    */
    private String getEmail(){
    return this.email;
    }

    /**
    * 头像
    */
    private String getImageurl(){
    return this.imageurl;
    }

    /**
    * 行业
    */
    private String getIndustry(){
    return this.industry;
    }

    /**
    * 个人简介
    */
    private String getIntro(){
    return this.intro;
    }

    /**
    * 最后登录时间
    */
    private String getLastlogintime(){
    return this.lastlogintime;
    }

    /**
    * 修改时间
    */
    private String getModifytime(){
    return this.modifytime;
    }

    /**
    * 修改用户id
    */
    private Long getModifyuserid(){
    return this.modifyuserid;
    }

    /**
    * 密码
    */
    private String getPassword(){
    return this.password;
    }

    /**
    * 地区
    */
    private String getPosition(){
    return this.position;
    }

    /**
    * 注册时间
    */
    private String getRegistertime(){
    return this.registertime;
    }

    /**
    * 盐
    */
    private String getSalt(){
    return this.salt;
    }

    /**
    * 性别
    */
    private String getSex(){
    return this.sex;
    }

    /**
    * 手机号
    */
    private String getTelephone(){
    return this.telephone;
    }

    /**
    * 用户名
    */
    private String getUsername(){
    return this.username;
    }

    /**
    * open id
    */
    private String getWxopenid(){
    return this.wxopenid;
    }

}
