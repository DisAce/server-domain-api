

package org.coiol.platform.core.model;

import java.util.List;

public class ExtGridReturn
{

	private int total; //总页数
	private int page;  //当前页数
	private int records; //总条数
	private List<?> rows;

	public ExtGridReturn()
	{
	}

	public ExtGridReturn(int total, List<?> rows)
	{
		this.total = total;
		this.rows = rows;
	}
	
	public ExtGridReturn(int total, int page , int records, List<?> rows)
	{
		this.total = total;
		this.page = page;
		this.records = records;
		this.rows = rows;
	}

	public int getTotal()
	{
		return total;
	}

	public void setTotal(int total)
	{
		this.total = total;
	}

	public List<?> getRows()
	{
		return rows;
	}

	public void setRows(List<?> rows)
	{
		this.rows = rows;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRecords() {
		return records;
	}

	public void setRecords(int records) {
		this.records = records;
	}
	
	
}
