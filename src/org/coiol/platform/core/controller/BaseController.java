/**   
* @Project: PlatFormCore 
* @Title: BaseController.java 
* @Package com.coiol.platform.core.controller 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2015年7月26日 上午10:25:50 
* @Copyright: 2015  
* @version V1.0 
 */
package org.coiol.platform.core.controller;

import java.beans.PropertyEditor;
import java.io.IOException;
import java.util.Date;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.coiol.platform.core.dto.AjaxResult;
import org.coiol.platform.core.dto.Page;
import org.coiol.platform.core.util.StringUtil;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/** 
 * @ClassName BaseController  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2015年7月26日 
 * 
 */
public class BaseController
{
	 public Page page;

	  @Resource
	  public AjaxResult ajaxResult;

	  public void errMsg(HttpServletResponse response, String code, String msg)
	  {
	    response.setContentType("application/json;charset=UTF-8");
	    response.setHeader("Pragma", "No-cache");
	    response.setHeader("Cache-Control", "no-cache");
	    response.setDateHeader("Expires", 0L);
	    try
	    {
	      response.getWriter().write("[{'succ':false,'code':'" + code + "', 'msg':'" + msg + "'}]");
	    }
	    catch (IOException e)
	    {
	      e.printStackTrace();
	    }
	  }

	  @InitBinder
	  protected void init(HttpServletRequest request, ServletRequestDataBinder binder) {
	    binder.registerCustomEditor(Date.class, (PropertyEditor) new CustomDateEditor(false));
	  }

	  public void str2JSON(HttpServletResponse response, String jsonStr)
	  {
	    response.setContentType("application/json;charset=UTF-8");
	    response.setHeader("Pragma", "No-cache");
	    response.setHeader("Cache-Control", "no-cache");
	    response.setDateHeader("Expires", 0L);
	    try
	    {
	      if (jsonStr == null)
	      {
	        jsonStr = "";
	      }
	      response.getWriter().write(jsonStr);
	    }
	    catch (IOException e)
	    {
	      e.printStackTrace();
	    }
	  }

	  public void obj2JSON(HttpServletResponse response, Object obj)
	  {
	    response.setContentType("application/json;charset=UTF-8");
	    response.setHeader("Pragma", "No-cache");
	    response.setHeader("Cache-Control", "no-cache");
	    response.setDateHeader("Expires", 0L);
	    try
	    {
	      response.getWriter().write(JSONArray.toJSON(obj).toString());
	    }
	    catch (IOException e)
	    {
	      e.printStackTrace();
	    }
	  }

	  public void obj2JSONObject(HttpServletResponse response, Object obj)
	  {
	    response.setContentType("application/json;charset=UTF-8");
	    response.setHeader("Pragma", "No-cache");
	    response.setHeader("Cache-Control", "no-cache");
	    response.setDateHeader("Expires", 0L);
	    try
	    {
	      response.getWriter().write(JSONObject.toJSON(obj).toString());
	    }
	    catch (IOException e)
	    {
	      e.printStackTrace();
	    }
	  }

	  public void obj2JSONArray(HttpServletResponse response, Object obj)
	  {
	    response.setContentType("application/json;charset=UTF-8");
	    response.setHeader("Pragma", "No-cache");
	    response.setHeader("Cache-Control", "no-cache");
	    response.setDateHeader("Expires", 0L);
	    try
	    {
	      response.getWriter().write(JSONArray.toJSON(obj).toString());
	    }
	    catch (IOException e)
	    {
	      e.printStackTrace();
	    }
	  }

	  public void sendAjaxResult(HttpServletResponse response)
	  {
	    str2JSON(response, JSONObject.toJSON(this.ajaxResult).toString());
	  }

	  public void obj2Page(HttpServletResponse response, Page paramPage, Object datas)
	  {
	    response.setContentType("application/json;charset=UTF-8");
	    response.setHeader("Pragma", "No-cache");
	    response.setHeader("Cache-Control", "no-cache");
	    response.setDateHeader("Expires", 0L);
	    try
	    {
	      if (!StringUtil.validate(paramPage))
	      {
	        paramPage = new Page();
	      }
	      JSONObject json = new JSONObject();
	      json.put("total", Integer.valueOf(paramPage.getTotalResult()));
	      json.put("rows", datas);
	      response.getWriter().write(json.toString());
	    }
	    catch (IOException e)
	    {
	      e.printStackTrace();
	    }
	  }
}
