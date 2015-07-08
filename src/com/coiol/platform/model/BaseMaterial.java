/**   
* @Project: Platform 
* @Title: BaseMaterial.java 
* @Package com.coiol.platform.pojo 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2014年11月26日 上午10:31:50 
* @Copyright: 2014  
* @version V1.0 
 */
package com.coiol.platform.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/** 
 * @ClassName BaseMaterial  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2014年11月26日 
 * 
 */
public class BaseMaterial implements Serializable {

	/**  
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = -8442122060164286637L;

	private String id; //ID
	private BigDecimal total; //总金额
	private BigDecimal weight; //总重量
	private Integer num; //总只数
	private String priceId; //单价ID
	private String supplierId; //供应商ID
	private BigDecimal singleTotal; //平均单只总量
	private BigDecimal singlePrice;  //平均单只价格
	private String remarks; //备注
	private Integer isDelete; //是否删除
	private String date;
	private String createTime; //创建时间
	private List<BaseSupplierPrice> baseSupplierPrice;
	private List<BaseSupplier> baseSupplier;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getPriceId() {
		return priceId;
	}
	public void setPriceId(String priceId) {
		this.priceId = priceId;
	}
	public BigDecimal getSingleTotal() {
		return singleTotal;
	}
	public void setSingleTotal(BigDecimal singleTotal) {
		this.singleTotal = singleTotal;
	}
	public BigDecimal getSinglePrice() {
		return singlePrice;
	}
	public void setSinglePrice(BigDecimal singlePrice) {
		this.singlePrice = singlePrice;
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
	public List<BaseSupplierPrice> getBaseSupplierPrice() {
		return baseSupplierPrice;
	}
	public void setBaseSupplierPrice(List<BaseSupplierPrice> baseSupplierPrice) {
		this.baseSupplierPrice = baseSupplierPrice;
	}
	public List<BaseSupplier> getBaseSupplier() {
		return baseSupplier;
	}
	public void setBaseSupplier(List<BaseSupplier> baseSupplier) {
		this.baseSupplier = baseSupplier;
	}
	public String getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	public BigDecimal getWeight() {
		return weight;
	}
	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	@Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("BaseMaterial [id=");
        builder.append(id);
        builder.append(", total=");
        builder.append(total);
        builder.append(", weight=");
        builder.append(weight);
        builder.append(", num=");
        builder.append(num);
        builder.append(", priceId=");
        builder.append(priceId);
        builder.append(", supplierId=");
        builder.append(supplierId);
        builder.append(", singleTotal=");
        builder.append(singleTotal);
        builder.append(", singlePrice=");
        builder.append(singlePrice);
        builder.append(", remarks=");
        builder.append(remarks);
        builder.append(", isDelete=");
        builder.append(isDelete);
        builder.append(", date=");
        builder.append(date);
        builder.append(", createTime=");
        builder.append(createTime);
        builder.append(", baseSupplierPrice=");
        builder.append(baseSupplierPrice);
        builder.append(", baseSupplier=");
        builder.append(baseSupplier);
        builder.append("]");
        return builder.toString();
    }
}
