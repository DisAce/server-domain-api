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
package org.coiol.platform.core.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/** 
 * @ClassName BaseSupplierPrice  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2014年11月25日 
 * 
 */
public class BaseSupplierPrice implements Serializable  {

	
	/**  
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = -3012407026251117193L;
	private String id;
	private String supplierId;
	private BigDecimal price;
	private String remarks;
	private Integer isDelete;
	private String createTime;
	private List<BaseSupplier> baseSupplier;
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
	
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
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
	public List<BaseSupplier> getBaseSupplier() {
		return baseSupplier;
	}
	public void setBaseSupplier(List<BaseSupplier> baseSupplier) {
		this.baseSupplier = baseSupplier;
	}
	
	@Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("BaseSupplierPrice [id=");
        builder.append(id);
        builder.append(", supplierId=");
        builder.append(supplierId);
        builder.append(", price=");
        builder.append(price);
        builder.append(", remarks=");
        builder.append(remarks);
        builder.append(", isDelete=");
        builder.append(isDelete);
        builder.append(", createTime=");
        builder.append(createTime);
        builder.append(", baseSupplier=");
        builder.append(baseSupplier);
        builder.append("]");
        return builder.toString();
    }
}
