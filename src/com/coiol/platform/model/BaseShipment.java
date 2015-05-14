/**   
* @Project: Platform 
* @Title: BaseShipment.java 
* @Package com.coiol.platform.pojo 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2015年1月11日 下午7:05:53 
* @Copyright: 2015  
* @version V1.0 
 */
package com.coiol.platform.model;

import java.io.Serializable;

/** 
 * @ClassName BaseShipment  
 * @Description 出货商管理信息实体类 
 * @author Yin MingXing master@coiol.com 
 * @date 2015年1月11日 
 * 
 */
public class BaseShipment implements Serializable
{

	/**  
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	private String address;
	private String telephone;
	private String remarks;
	private Integer isDelete; //是否删除
	private String createTime;
	
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getTelephone()
	{
		return telephone;
	}
	public void setTelephone(String telephone)
	{
		this.telephone = telephone;
	}
	public String getRemarks()
	{
		return remarks;
	}
	public void setRemarks(String remarks)
	{
		this.remarks = remarks;
	}
	public Integer getIsDelete()
	{
		return isDelete;
	}
	public void setIsDelete(Integer isDelete)
	{
		this.isDelete = isDelete;
	}
	public String getCreateTime()
	{
		return createTime;
	}
	public void setCreateTime(String createTime)
	{
		this.createTime = createTime;
	}
	
	

}
