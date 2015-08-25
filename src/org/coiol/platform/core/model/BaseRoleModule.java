
package org.coiol.platform.core.model;

import java.io.Serializable;


public class BaseRoleModule implements Serializable
{

	/**  
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = 8078427499490104508L;
	private String roleModuleId;
	private String roleId;
	private String moduleIdFun;
	private String moduleId;
	private String createTime;

	
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

	@Override
	public String toString() {
		return "BaseRoleModule [roleModuleId=" + roleModuleId + ", roleId=" + roleId + ", moduleIdFun=" + moduleIdFun
				+ ", moduleId=" + moduleId + ", createTime=" + createTime + "]";
	}

}
