/**   
* @Project: Platform 
* @Title: BaseSupplierPrice.java 
* @Package com.coiol.platform.pojo 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2014年11月25日 上午11:08:22 
* @Copyright: 2014  
* @version V1.0 
 */
package com.coiol.platform.model;

import java.io.Serializable;
import java.math.BigDecimal;

/** 
 * @ClassName BaseSupplierPrice  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2014年11月25日 
 * 
 */
public class BaseSupplierUnion implements Serializable  {

	
	/**  
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = -6314648759277910896L;
	private String id;
	private String supplierId;
	private BigDecimal price;
	private BigDecimal prices;
	private String remarks;
	private String name;
	private Integer isDelete;
	private String createTime;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Integer getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public BigDecimal getPrices() {
		return prices;
	}
	public void setPrices(BigDecimal prices) {
		this.prices = prices;
	}
	
	@Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("BaseSupplierUnion [id=");
        builder.append(id);
        builder.append(", supplierId=");
        builder.append(supplierId);
        builder.append(", price=");
        builder.append(price);
        builder.append(", prices=");
        builder.append(prices);
        builder.append(", name=");
        builder.append(name);
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
