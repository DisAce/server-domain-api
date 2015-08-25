

package org.coiol.platform.core.model;

import java.io.Serializable;

public class BaseFields implements Serializable 
{

	/**  
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = -7753289426540672133L;
	private String fieldId;
	private String field;
	private String fieldName;
	private String valueField;
	private String displayField;
	private Short enabled;
	private Short sort;

	public String getFieldId()
	{
		return fieldId;
	}

	public void setFieldId(String fieldId)
	{
		this.fieldId = fieldId;
	}

	public String getField()
	{
		return field;
	}

	public void setField(String field)
	{
		this.field = field;
	}

	public String getFieldName()
	{
		return fieldName;
	}

	public void setFieldName(String fieldName)
	{
		this.fieldName = fieldName;
	}

	public String getValueField()
	{
		return valueField;
	}

	public void setValueField(String valueField)
	{
		this.valueField = valueField;
	}

	public String getDisplayField()
	{
		return displayField;
	}

	public void setDisplayField(String displayField)
	{
		this.displayField = displayField;
	}

	public Short getEnabled()
	{
		return enabled;
	}

	public void setEnabled(Short enabled)
	{
		this.enabled = enabled;
	}

	public Short getSort()
	{
		return sort;
	}

	public void setSort(Short sort)
	{
		this.sort = sort;
	}

	@Override
	public String toString() {
		return "BaseFields [fieldId=" + fieldId + ", field=" + field + ", fieldName=" + fieldName + ", valueField="
				+ valueField + ", displayField=" + displayField + ", enabled=" + enabled + ", sort=" + sort + "]";
	}
	
}
