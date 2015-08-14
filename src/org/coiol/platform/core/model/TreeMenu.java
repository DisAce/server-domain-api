
package org.coiol.platform.core.model;

import java.util.*;



public class TreeMenu {

	private List<BaseModules> list;
	private BaseModules root;

	public TreeMenu(List<BaseModules> list) {
		this.list = list;
		root = new BaseModules();
	}

	private Tree getNodeJson(List<BaseModules> list, BaseModules node) {
		Tree tree = new Tree();
		tree.setId(node.getId());
		tree.setName(node.getName());
		tree.setIconCls(node.getIconCss());
		tree.setChildren(new ArrayList<Tree>());
		if (list == null)
			return tree;
		if (hasChild(list, node)) {
			ArrayList<Tree> lt = new ArrayList<Tree>();
			tree.setUrl("");
			tree.setLeaf(node.getLeaf().shortValue() == 1);
			tree.setType(node.getType());
			tree.setExpanded(node.getExpanded().shortValue() == 1);
			List<BaseModules> childList = getChildList(list, node);
			Iterator<BaseModules> it = childList.iterator();
			while (it.hasNext()) {
				BaseModules modules = (BaseModules) it.next();
				lt.add(getNodeJson(list, modules));
			}
			tree.setChildren(lt);
		} else {
			tree.setUrl(node.getModuleUrl());
			tree.setLeaf(node.getLeaf().shortValue() == 1);
			tree.setType(node.getType());
			tree.setExpanded(node.getExpanded().shortValue() == 1);
		}
		return tree;
	}

	private boolean hasChild(List<BaseModules> list, BaseModules node) {
		return getChildList(list, node).size() > 0;
	}

	private List<BaseModules> getChildList(List<BaseModules> list,
			BaseModules modules) {
		List<BaseModules> li = new ArrayList<BaseModules>();
		Iterator<BaseModules> it = list.iterator();
		while (it.hasNext()) {
			
			BaseModules temp = (BaseModules) it.next();
		    
			if (temp.getParent().equals(modules.getId()))
				li.add(temp);
		}
		return li;
	}

	public Tree getTreeJson() {
		root.setId("0");
		root.setLeaf(0);
		root.setExpanded(0);
		return getNodeJson(list, root);
	}
}
