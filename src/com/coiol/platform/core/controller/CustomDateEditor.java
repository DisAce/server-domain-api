/**   
* @Project: PlatFormCore 
* @Title: CustomDateEditor.java 
* @Package com.coiol.platform.core.controller 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2015年7月26日 上午10:26:17 
* @Copyright: 2015  
* @version V1.0 
 */
package com.coiol.platform.core.controller;

import java.beans.PropertyEditorSupport;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.util.StringUtils;


/** 
 * @ClassName CustomDateEditor  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2015年7月26日 
 * 
 */
public class CustomDateEditor extends PropertyEditorSupport
{

	  private DateFormat dateFormat;
	  private final boolean allowEmpty;
	  private final int exactDateLength;

	  public CustomDateEditor(boolean allowEmpty)
	  {
	    this.allowEmpty = allowEmpty;
	    this.exactDateLength = -1;
	  }

	  public CustomDateEditor(DateFormat dateFormat, boolean allowEmpty)
	  {
	    this.dateFormat = dateFormat;
	    this.allowEmpty = allowEmpty;
	    this.exactDateLength = -1;
	  }

	  public CustomDateEditor(DateFormat dateFormat, boolean allowEmpty, int exactDateLength)
	  {
	    this.dateFormat = dateFormat;
	    this.allowEmpty = allowEmpty;
	    this.exactDateLength = exactDateLength;
	  }

	  public void setAsText(String text)
	    throws IllegalArgumentException
	  {
	    if ((this.allowEmpty) && (!StringUtils.hasText(text)))
	    {
	      setValue(null);
	    } else {
	      if ((text != null) && (this.exactDateLength >= 0) && (text.length() != this.exactDateLength))
	      {
	        throw new IllegalArgumentException("Could not parse date: it is not exactly" + this.exactDateLength + 
	          "characters long");
	      }

	      try
	      {
	        setValue(formatDate(text));
	      }
	      catch (ParseException ex)
	      {
	        IllegalArgumentException iae = new IllegalArgumentException("Could not parse date: " + ex.getMessage());
	        iae.initCause(ex);
	        throw iae;
	      }
	    }
	  }

	  private Date formatDate(String date) throws ParseException
	  {
	    String eL = "[0-9]{4}-[0-9]{2}-[0-9]{2}";
	    Pattern p = Pattern.compile(eL);
	    Matcher m = p.matcher(date);
	    boolean dateFlag = m.matches();
	    if (dateFlag)
	    {
	      SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	      return format.parse(date);
	    }

	    eL = "[0-9]{4}-[0-9]{2}-[0-9]{2} [0-9]{2}:[0-9]{2}:[0-9]{2}";
	    p = Pattern.compile(eL);
	    m = p.matcher(date);
	    dateFlag = m.matches();
	    if (dateFlag)
	    {
	      SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	      return format.parse(date);
	    }

	    return null;
	  }

	  public static void main(String[] args)
	  {
	    CustomDateEditor cd = new CustomDateEditor(false);
	    try
	    {
	      Date date = cd.formatDate("2013-08-03 0=9:32:23");
	      System.out.print(date);
	    }
	    catch (ParseException e)
	    {
	      e.printStackTrace();
	    }
	  }

	  public String getAsText()
	  {
	    Date value = (Date)getValue();
	    return value != null ? this.dateFormat.format(value) : "";
	  }
}
