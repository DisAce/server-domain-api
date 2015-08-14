
package org.coiol.platform.core.model;


public class ExtPager
{

	private Integer limit;
	private Integer start;
	private String dir;
	private String sort;

	public ExtPager()
	{
	}

	public Integer getLimit()
	{
		return limit;
	}

	public void setLimit(Integer limit)
	{
		this.limit = limit;
	}

	public Integer getStart()
	{
		return start;
	}

	public void setStart(Integer start)
	{
		this.start = start;
	}

	public String getDir()
	{
		return dir;
	}

	public void setDir(String dir)
	{
		this.dir = dir;
	}

	public String getSort()
	{
		return Table.toClumn(sort);
	}

	public void setSort(String sort)
	{
		this.sort = sort;
	}
}
