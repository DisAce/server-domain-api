/**   
* @Project: Platform 
* @Title: BaseSupplier.java 
* @Package com.coiol.platform.pojo 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2014年11月24日 下午5:15:15 
* @Copyright: 2014  
* @version V1.0 
 */
package org.coiol.platform.core.model;

import java.io.Serializable;

/** 
 * @ClassName BaseSupplier  
 * @Description 供应商信息实体类 
 * @author Yin MingXing master@coiol.com 
 * @date 2014年11月24日 
 * 
 */
public class BaseSupplier implements Serializable {

	
	/**  
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = -5642916492059208227L;
	private String id;
	private String name;
	private String address;
	private String telephone;
	private String remarks;
	private Integer isDelete; //是否删除
	private String createTime;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public Integer getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	@Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("BaseSupplier [id=");
        builder.append(id);
        builder.append(", name=");
        builder.append(name);
        builder.append(", address=");
        builder.append(address);
        builder.append(", telephone=");
        builder.append(telephone);
        builder.append(", remarks=");
        builder.append(remarks);
        builder.append(", isDelete=");
        builder.append(isDelete);
        builder.append(", createTime=");
        builder.append(createTime);
        builder.append("]");
        return builder.toString();
    }

}
