
package com.coiol.platform.model;

import java.io.Serializable;


import com.fasterxml.jackson.annotation.JsonIgnore;

public class BaseModules 
	implements Serializable
{

	/**  
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = -8642256759361252362L;
	private String id;
	private String name;
	private String moduleUrl;
	private String parent;
	private Integer level;
	private Integer leaf;
	private boolean loaded = false;
	private Integer expanded;
	private Short displayIndex;
	private Short isDisplay;
	private String enModuleName;
	private String iconCss;
	private Integer type; //类型
	private String button; //按钮
	private String createTime; //时间
	private String information;
	
	public String getButton() {
		return button;
	}

	public void setButton(String button) {
		this.button = button;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public BaseModules()
	{
	}
	
	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getLeaf() {
		return leaf;
	}

	public void setLeaf(Integer leaf) {
		this.leaf = leaf;
	}

	public Integer getExpanded() {
		return expanded;
	}

	public void setExpanded(Integer expanded) {
		this.expanded = expanded;
	}

	public boolean isLoaded() {
		return loaded;
	}

	public void setLoaded(boolean loaded) {
		this.loaded = loaded;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModuleUrl()
	{
		return moduleUrl;
	}

	public void setModuleUrl(String moduleUrl)
	{
		this.moduleUrl = moduleUrl;
	}


	public Short getDisplayIndex()
	{
		return displayIndex;
	}

	public void setDisplayIndex(Short displayIndex)
	{
		this.displayIndex = displayIndex;
	}

	public Short getIsDisplay()
	{
		return isDisplay;
	}

	public void setIsDisplay(Short isDisplay)
	{
		this.isDisplay = isDisplay;
	}

    @JsonIgnore
	public String getEnModuleName()
	{
		return enModuleName;
	}

	public void setEnModuleName(String enModuleName)
	{
		this.enModuleName = enModuleName;
	}

	public String getIconCss()
	{
		return iconCss;
	}

	public void setIconCss(String iconCss)
	{
		this.iconCss = iconCss;
	}

	public String getInformation()
	{
		return information;
	}

	public void setInformation(String information)
	{
		this.information = information;
	}
	
	@Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("BaseModules [id=");
        builder.append(id);
        builder.append(", name=");
        builder.append(name);
        builder.append(", moduleUrl=");
        builder.append(moduleUrl);
        builder.append(", parent=");
        builder.append(parent);
        builder.append(", level=");
        builder.append(level);
        builder.append(", leaf=");
        builder.append(leaf);
        builder.append(", loaded=");
        builder.append(loaded);
        builder.append(", expanded=");
        builder.append(expanded);
        builder.append(", displayIndex=");
        builder.append(displayIndex);
        builder.append(", isDisplay=");
        builder.append(isDisplay);
        builder.append(", enModuleName=");
        builder.append(enModuleName);
        builder.append(", iconCss=");
        builder.append(iconCss);
        builder.append(", type=");
        builder.append(type);
        builder.append(", button=");
        builder.append(button);
        builder.append(", createTime=");
        builder.append(createTime);
        builder.append(", information=");
        builder.append(information);
        builder.append("]");
        return builder.toString();
    }
}
