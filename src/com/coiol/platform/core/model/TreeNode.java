/**   
* @Project: PlatFormCore 
* @Title: TreeNode.java 
* @Package com.coiol.platform.core.model 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2015年7月26日 上午10:06:04 
* @Copyright: 2015  
* @version V1.0 
 */
package com.coiol.platform.core.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/** 
 * @ClassName TreeNode  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2015年7月26日 
 * 
 */
public class TreeNode
{
	private Object id;
	  private Object parentId;
	  private String name;
	  private String text;
	  private String state;
	  private String uuid;
	  private boolean open;
	  private String url;
	  private String target;
	  private LinkedList<TreeNode> children;
	  private String click;
	  private String icon;
	  private boolean isParent;

	  public TreeNode()
	  {
	  }

	  public TreeNode(Object id, String text, Object pId, boolean open, String uuid)
	  {
	    this.id = id;
	    this.text = text;
	    this.parentId = pId;
	    this.open = open;
	    this.uuid = uuid;
	  }

	  public String getName()
	  {
	    return this.name;
	  }

	  public void setName(String name)
	  {
	    this.name = name;
	  }

	  public Object getId()
	  {
	    return this.id;
	  }

	  public void setId(Object id)
	  {
	    this.id = id;
	  }

	  public Object getParentId()
	  {
	    return this.parentId;
	  }

	  public void setParentId(Object pId)
	  {
	    this.parentId = pId;
	  }

	  public String getText()
	  {
	    return this.text;
	  }

	  public void setText(String text)
	  {
	    this.text = text;
	  }

	  public String getUuid()
	  {
	    return this.uuid;
	  }

	  public void setUuid(String uuid)
	  {
	    this.uuid = uuid;
	  }

	  public String getUrl()
	  {
	    return this.url;
	  }

	  public void setUrl(String url)
	  {
	    this.url = url;
	  }

	  public String getTarget()
	  {
	    return this.target;
	  }

	  public void setTarget(String target)
	  {
	    this.target = target;
	  }

	  public LinkedList<TreeNode> getChildren()
	  {
	    return this.children;
	  }

	  public void setChildren(LinkedList<TreeNode> children)
	  {
	    this.children = children;
	  }

	  public String getClick()
	  {
	    return this.click;
	  }

	  public void setClick(String click)
	  {
	    this.click = click;
	  }

	  public String getIcon()
	  {
	    return this.icon;
	  }

	  public void setIcon(String icon)
	  {
	    this.icon = icon;
	  }

	  public boolean getIsParent()
	  {
	    return this.isParent;
	  }

	  public void setIsParent(boolean isParent)
	  {
	    this.isParent = isParent;
	  }

	  public boolean isOpen()
	  {
	    return this.open;
	  }

	  public void setOpen(boolean open)
	  {
	    this.open = open;
	  }

	  public TreeNode(LinkedList<TreeNode> tns)
	  {
	    LinkedHashMap tnMaps = new LinkedHashMap();
	    for (TreeNode n : tns)
	    {
	      tnMaps.put(castString(n.getId()), n);
	    }

	    List<String> removeNotes = new ArrayList();

	    Set tnKey = tnMaps.keySet();
	    Iterator it = tnKey.iterator();
	    TreeNode tn;
	    while (it.hasNext())
	    {
	      String id = (String)it.next();
	      tn = (TreeNode)tnMaps.get(id);
	      String parentId = castString(tn.getParentId());
	      if ((parentId == null) || ("".equals(parentId)) || (tnMaps.get(parentId) == null)) {
	        continue;
	      }
	      removeNotes.add(id);
	      if (((TreeNode)tnMaps.get(parentId)).getChildren() == null)
	      {
	        ((TreeNode)tnMaps.get(parentId)).setChildren(new LinkedList());
	      }

	      ((TreeNode)tnMaps.get(parentId)).getChildren().add(tn);
	      ((TreeNode)tnMaps.get(parentId)).setIsParent(true);
	    }

	    for (String s : removeNotes)
	    {
	      tnMaps.remove(s);
	    }

	    Iterator it2 = tnKey.iterator();
	    setId("-1");
	    setChildren(new LinkedList());
	    while (it2.hasNext())
	    {
	      getChildren().add((TreeNode)tnMaps.get(it2.next()));
	    }
	  }

	  private String castString(Object obj)
	  {
	    if (obj == null) return "";
	    if ((obj instanceof Integer)) return ((Integer)obj).toString();
	    if ((obj instanceof BigDecimal))
	    {
	      return ((BigDecimal)obj).toString();
	    }

	    return (String)obj;
	  }

	  public LinkedList<TreeNode> getSelectTreeList(String preStr)
	  {
	    LinkedList result = new LinkedList();
	    String preStrTmp = preStr + "&nbsp;&nbsp;&nbsp;&nbsp;";
	    if (getChildren() != null)
	    {
	      for (TreeNode tn : getChildren())
	      {
	        "".equals(castString(tn.getParentId()));

	        tn.setText(preStrTmp + "|-" + tn.getText());
	        result.add(tn);
	        result.addAll(tn.getSelectTreeList(preStrTmp));
	      }
	    }
	    return result;
	  }

	  public String getLiStr()
	  {
	    String li = "";
	    if (!"-1".equals(getId()))
	    {
	      li = li + "<li>";
	      li = li + "<span>";
	      if ((getUrl() != null) || (!"".equals(getUrl())))
	      {
	        li = li + "<a href='" + getUrl() + "' target='" + getTarget() + "' >" + getText() + "</a>";
	      }
	      else
	      {
	        li = li + getText();
	      }
	      li = li + "</span>";
	      if ((getChildren() != null) && (getChildren().size() > 0))
	      {
	        li = li + "<ul>";
	        for (TreeNode tn : getChildren())
	        {
	          li = li + tn.getLiStr();
	        }
	        li = li + "</ul>";
	      }
	      li = li + "</li>";
	    }
	    else if ("-1".equals(getId()))
	    {
	      for (TreeNode tn : getChildren())
	      {
	        li = li + tn.getLiStr();
	      }
	    }

	    return li;
	  }

	  public String getState()
	  {
	    return this.state;
	  }

	  public void setState(String state)
	  {
	    this.state = state;
	  }

	  public void setParent(boolean isParent)
	  {
	    this.isParent = isParent;
	  }

}
