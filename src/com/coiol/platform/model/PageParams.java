package com.coiol.platform.model;


public class PageParams {
	private Integer page = 1; //当前页数
	private Integer rows; //当前行数
	private String sord; //排序方式
	private String sidx; //排序字段
	private Integer pageSize = 10; // 页大小
	private Integer pageOffset = 0;// 当前页起始记录
	private Integer total = 0;// 总条数
	private Integer records = 0;// 总页数
	private String gridName;

	
	public String getGridName() {
		return gridName;
	}
	public void setGridName(String gridName) {
		this.gridName = gridName;
	}
	public Integer getPage() {
		
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	public String getSord() {
		return sord;
	}
	public void setSord(String sord) {
		this.sord = sord;
	}
	
	public String getSidx() {
		return sidx;
	}
	public void setSidx(String sidx) {
		this.sidx = sidx;
	
	}
	
	public Integer getPageOffset() {
		
			if(this.getPage() == 1){
				return 0;
			}else{
				Integer _pate = this.page - 1;
				if(_pate >= 0){
					return _pate * this.getPageSize();
				}else{
					return 0; //若当前page为负数时、则直接返回0
				}
				
			}
		
	}
	public void setPageOffset(Integer pageOffset) {
		this.pageOffset = pageOffset;
	}
	
	public Integer getPageSize() {
		return pageSize;
	}
	
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	
	
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	
	
	public Integer getRecords(Integer total) {
		
		if (this.getRows() < 1 || null == this.getRows()) {
			this.rows = 10;
		}
		// 总页数=(总记录数+每页行数-1)/每页行数
		records = (total + this.getRows() - 1) / this.getRows();
		// 当前页大于总页数
		if (this.getPage() > records) {
			this.page = records;
		}
		// 防止 pageOffset 小于 0
		pageOffset = ((this.getPage() - 1) * this.getRows());
		if (pageOffset < 0)
			pageOffset = 0;
		
		return records;
	}
	public void setRecords(Integer records) {
		this.records = records;
	}
	@Override
	public String toString() {
		String params="page:"+page+"|rows:"+rows+"|sord:"+sord+"|sidx:"+sidx;
		return params;
	}
}
