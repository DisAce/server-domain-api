

package org.coiol.platform.core.model;

import java.io.Serializable;


public class BaseRoles 
	implements Serializable
{

	/**  
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = 2797944101816762636L;
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
	
	@Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("BaseRoles [roleId=");
        builder.append(roleId);
        builder.append(", roleName=");
        builder.append(roleName);
        builder.append(", roleDesc=");
        builder.append(roleDesc);
        builder.append(", createTime=");
        builder.append(createTime);
        builder.append("]");
        return builder.toString();
    }
}
