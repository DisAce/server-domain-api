

package org.coiol.platform.core.model;

import java.io.Serializable;


public class BaseUserRole 
	implements Serializable
{

	/**  
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = 2316023000817872412L;
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
	
	@Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("BaseUserRole [id=");
        builder.append(id);
        builder.append(", userId=");
        builder.append(userId);
        builder.append(", roleId=");
        builder.append(roleId);
        builder.append(", createTime=");
        builder.append(createTime);
        builder.append("]");
        return builder.toString();
    }
}
