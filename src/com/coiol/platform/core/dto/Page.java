/**   
* @Project: PlatFormCore 
* @Title: Page.java 
* @Package com.coiol.platform.core.dto 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2015年7月26日 上午10:24:47 
* @Copyright: 2015  
* @version V1.0 
 */
package com.coiol.platform.core.dto;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;
import com.coiol.platform.core.util.StringUtil;

/** 
 * @ClassName Page  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2015年7月26日 
 * 
 */
@Component
public class Page
{
	 private int showCount = 10;
	  private int totalPage;
	  private int totalResult;
	  private int currentPage;
	  private int currentResult;
	  private boolean entityOrField;

	  public Page()
	  {
	  }

	  public Page(HttpServletRequest request)
	  {
	    String curPage = request.getParameter("page");
	    String count = request.getParameter("rows");
	    if (StringUtil.validate(curPage))
	    {
	      setCurrentPage(Integer.parseInt(curPage));
	    }
	    else
	    {
	      setCurrentPage(1);
	    }
	    if (StringUtil.validate(curPage))
	    {
	      setShowCount(Integer.parseInt(count));
	    }
	    else
	    {
	      setShowCount(10);
	    }
	  }

	  public int getTotalPage()
	  {
	    if (this.totalResult % this.showCount == 0)
	      this.totalPage = (this.totalResult / this.showCount);
	    else
	      this.totalPage = (this.totalResult / this.showCount + 1);
	    return this.totalPage;
	  }

	  public void setTotalPage(int totalPage)
	  {
	    this.totalPage = totalPage;
	  }

	  public int getTotalResult()
	  {
	    return this.totalResult;
	  }

	  public void setTotalResult(int totalResult)
	  {
	    this.totalResult = totalResult;
	  }

	  public int getCurrentPage()
	  {
	    if (this.currentPage <= 0)
	      this.currentPage = 1;
	    if (this.currentPage > getTotalPage())
	      this.currentPage = getTotalPage();
	    return this.currentPage;
	  }

	  public void setCurrentPage(int currentPage)
	  {
	    this.currentPage = currentPage;
	  }

	  public int getShowCount()
	  {
	    return this.showCount;
	  }

	  public void setShowCount(int showCount)
	  {
	    this.showCount = showCount;
	  }

	  public int getCurrentResult()
	  {
	    this.currentResult = ((getCurrentPage() - 1) * getShowCount());
	    if (this.currentResult < 0)
	      this.currentResult = 0;
	    return this.currentResult;
	  }

	  public void setCurrentResult(int currentResult)
	  {
	    this.currentResult = currentResult;
	  }

	  public boolean isEntityOrField()
	  {
	    return this.entityOrField;
	  }

	  public void setEntityOrField(boolean entityOrField)
	  {
	    this.entityOrField = entityOrField;
	  }

}
