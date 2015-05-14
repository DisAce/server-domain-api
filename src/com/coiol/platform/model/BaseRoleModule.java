
package com.coiol.platform.model;

import java.io.Serializable;


public class BaseRoleModule
	implements Serializable
{

	private static final long serialVersionUID = 1L;
	private String roleModuleId;
	private String roleId;
	private String moduleIdFun;
	private String moduleId;
	private String createTime;

	public BaseRoleModule()
	{
	}

	public String getRoleModuleId()
	{
		return roleModuleId;
	}

	
	public String getModuleIdFun() {
		return moduleIdFun;
	}

	public void setModuleIdFun(String moduleIdFun) {
		this.moduleIdFun = moduleIdFun;
	}

	public void setRoleModuleId(String roleModuleId)
	{
		this.roleModuleId = roleModuleId;
	}

	public String getRoleId()
	{
		return roleId;
	}

	public void setRoleId(String roleId)
	{
		this.roleId = roleId;
	}

	public String getModuleId() {
		return moduleId;
	}

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	

	
}
