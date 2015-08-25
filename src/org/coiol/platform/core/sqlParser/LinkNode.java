/**   
* @Project: PlatFormCore 
* @Title: LinkNode.java 
* @Package com.coiol.platform.core.sqlParser 
* @author Yin MingXing master@coiol.com 
* @date 2015年7月26日 上午9:54:24 
* @Copyright: 2015  
* @version V1.0 
 */
package org.coiol.platform.core.sqlParser;

/** 
 * @ClassName LinkNode  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2015年7月26日 
 * 
 */
public class LinkNode <T>
{

	 public T node;
	  public LinkNode<T> next;

	  public T getNode()
	  {
	    return this.node;
	  }

	  public void setNode(T node)
	  {
	    this.node = node;
	  }

	  public LinkNode<T> getNext()
	  {
	    return this.next;
	  }

	  public void setNext(LinkNode<T> next)
	  {
	    this.next = next;
	  }

	  public int size()
	  {
	    int size = 0;
	    LinkNode<T> cur = this;
	    while ((cur != null) && (cur.getNode() != null))
	    {
	      size++;
	      cur = cur.getNext();
	    }
	    return size;
	  }

	  public boolean hasNext()
	  {
	    return getNext() != null;
	  }
}
