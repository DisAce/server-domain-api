

package com.coiol.platform.model;

import java.io.Serializable;


public class BaseRoles 
	implements Serializable
{

	private static final long serialVersionUID = 1L;
	private String roleId;
	private String roleName;
	private String roleDesc;
	private String createTime;

	public BaseRoles()
	{
	}

	public String getRoleId()
	{
		return roleId;
	}

	public void setRoleId(String roleId)
	{
		this.roleId = roleId;
	}

	public String getRoleName()
	{
		return roleName;
	}

	public void setRoleName(String roleName)
	{
		this.roleName = roleName;
	}

	public String getRoleDesc()
	{
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc)
	{
		this.roleDesc = roleDesc;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	
}
