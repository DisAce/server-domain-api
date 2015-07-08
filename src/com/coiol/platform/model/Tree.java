

package com.coiol.platform.model;

import java.io.Serializable;
import java.util.List;

public class Tree
	implements Serializable
{

	/**  
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = 3850086443915388834L;
	private String id;
	private String name;
	private Integer type;
	private String iconCls;
	private boolean expanded;
	private boolean leaf;
	private String url;
	private List<Tree> children;

	public Tree()
	{
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIconCls()
	{
		return iconCls;
	}

	public void setIconCls(String iconCls)
	{
		this.iconCls = iconCls;
	}

	public boolean isExpanded()
	{
		return expanded;
	}
	

	public boolean isLeaf() {
		return leaf;
	}

	public void setLeaf(boolean leaf) {
		this.leaf = leaf;
	}

	public void setExpanded(boolean expanded)
	{
		this.expanded = expanded;
	}

	
	
	public String getUrl()
	{
		return url;
	}

	public void setUrl(String url)
	{
		this.url = url;
	}

	public List<Tree> getChildren()
	{
		return children;
	}

	public void setChildren(List<Tree> children)
	{
		this.children = children;
	}
}
