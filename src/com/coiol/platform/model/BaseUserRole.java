

package com.coiol.platform.model;

import java.io.Serializable;


public class BaseUserRole 
	implements Serializable
{

	private static final long serialVersionUID = 1L;
	private String id;
	private String userId;
	private String roleId;
	private String createTime;

	public BaseUserRole()
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

	public String getRoleId()
	{
		return roleId;
	}

	public void setRoleId(String roleId)
	{
		this.roleId = roleId;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getCreateTime() {
		return createTime;
	}



	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	
	
}
