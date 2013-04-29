package com.cooper.client;

import com.smartgwt.client.types.SelectionStyle;
import com.smartgwt.client.types.TreeModelType;
import com.smartgwt.client.widgets.layout.VLayout;
import com.smartgwt.client.widgets.tree.Tree;
import com.smartgwt.client.widgets.tree.TreeGrid;
import com.smartgwt.client.widgets.tree.TreeNode;
import com.smartgwt.client.widgets.tree.events.NodeClickEvent;
import com.smartgwt.client.widgets.tree.events.NodeClickHandler;
import com.smartgwt.client.widgets.tab.Tab;
import com.smartgwt.client.widgets.tab.TabSet;

public class ContentLeft {
    
	private TabSet ts; 
	
	public void setTabSet(TabSet ts){
		this.ts = ts; 
	}

	public 	ContentLeft(){ 
	}
	
	public TreeGrid getMenu(){
		TreeGrid tg = new TreeGrid(); 
		
/* Node Icon Setting ************************** 
		//setNodeIcon("arrow_down.png"); 
		//setFolderIcon("arrow_up.png"); 
		//setShowOpenIcons(false);
		//setShowDropIcons(false);
***********************************************/
		
		tg.setHoverWidth(10); 
		
		tg.setShowSelectedStyle(true);
		// tg.setShowRoot(true); 
		tg.setShowPartialSelection(true); 
		tg.setCascadeSelection(false);
		tg.setCanSort(false);
		tg.setShowConnectors(true);
		tg.setShowHeader(false);
		
		tg.setLoadDataOnDemand(false);
		tg.setSelectionType(SelectionStyle.SINGLE);
		Tree data = new Tree();

		data.setModelType(TreeModelType.CHILDREN);
		
		data.setRoot(
			new TreeNode("User's",
				new TreeNode("Admin",
						new TreeNode("Customer")),
						new TreeNode("작성",
								new TreeNode("하위수정",
										new TreeNode("EditGrandChild"))),
										new TreeNode("윈도우"))
		);

		tg.setData(data);

		// create New Tab 
		tg.addNodeClickHandler(new NodeClickHandler() {  
			public void onNodeClick(NodeClickEvent event) {
				String name = event.getNode().getName();
				
				VLayout vLayout = new VLayout(); 
				Tab t = new Tab();
				t.setPane(vLayout); 
				ts.addTab(new Tab(name));
				
			}
		});

		return tg; 
	}
	
	
  
}
