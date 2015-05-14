
/**
 * 用户表实体类
 */


package com.coiol.platform.model;

import java.io.Serializable;
import java.util.Date;


import com.coiol.platform.common.jackjson.CustomDateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
public class BaseUsers  implements Serializable
{

	private static final long serialVersionUID = 1L;
	private String userId;   //用户ID
	private String account;  //用户登录帐号
	private String password; //登录密码
	private String realName; //用户名称
	private Short sex;		 //性别
	private String email;	 //邮箱
	private String mobile;	 //手机
	private String officePhone;  //电话
	private Short errorCount;    //连续登录错误次数
	private Date lastLoginTime;  //最后登录时间
	private String lastLoginIp;  //登录IP
	private Integer isAdmin; //是否为管理员
	private String createTime; //创建时间
	

	public Integer getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Integer isAdmin) {
		this.isAdmin = isAdmin;
	}

	private String remark;		 //备注

	public BaseUsers()
	{
	}

	public String getUserId()
	{
		return userId;
	}

	public void setUserId(String userId)
	{
		this.userId = userId;
	}

	public String getAccount()
	{
		return account;
	}

	public void setAccount(String account)
	{
		this.account = account;
	}

    @JsonIgnore
	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getRealName()
	{
		return realName;
	}

	public void setRealName(String realName)
	{
		this.realName = realName;
	}

	public Short getSex()
	{
		return sex;
	}

	public void setSex(Short sex)
	{
		this.sex = sex;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getMobile()
	{
		return mobile;
	}

	public void setMobile(String mobile)
	{
		this.mobile = mobile;
	}

	public String getOfficePhone()
	{
		return officePhone;
	}

	public void setOfficePhone(String officePhone)
	{
		this.officePhone = officePhone;
	}

	
	public Short getErrorCount()
	{
		return errorCount;
	}

	public void setErrorCount(Short errorCount)
	{
		this.errorCount = errorCount;
	}
	
    @JsonSerialize(using=CustomDateTimeSerializer.class)
	public Date getLastLoginTime()
	{
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime)
	{
		this.lastLoginTime = lastLoginTime;
	}

	public String getLastLoginIp()
	{
		return lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp)
	{
		this.lastLoginIp = lastLoginIp;
	}

	public String getRemark()
	{
		return remark;
	}

	public void setRemark(String remark)
	{
		this.remark = remark;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	
}
