package com.cooper.client;

import com.smartgwt.client.types.ContentsType;
import com.smartgwt.client.types.ListGridFieldType;
import com.smartgwt.client.types.SelectionStyle;
import com.smartgwt.client.types.TreeModelType;
import com.smartgwt.client.widgets.HTMLPane;
import com.smartgwt.client.widgets.Img;
import com.smartgwt.client.widgets.grid.CellFormatter;
import com.smartgwt.client.widgets.grid.ListGrid;
import com.smartgwt.client.widgets.grid.ListGridField;
import com.smartgwt.client.widgets.grid.ListGridRecord;
import com.smartgwt.client.widgets.layout.Layout;
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
				
				Cooper.addTab(name); 
				
				
/*
				ListGridField rowNum = new ListGridField("itemNum", "Item No.");  
		        rowNum.setWidth(65);  
		        rowNum.setCellFormatter(new CellFormatter() {  
		            public String format(Object value, ListGridRecord record, int rowNum, int colNum) {  
		                return rowNum +"";  
		            }  
		        });  
		  
		        ListGridField itemName = new ListGridField("itemName", 100);  
		        ListGridField sku = new ListGridField("SKU", 100);  
		        ListGridField description = new ListGridField("description", 150);  
		        ListGridField category = new ListGridField("category", 100);  
		        ListGridField units = new ListGridField("units", 100);  
		  
		        ListGridField unitCost = new ListGridField("unitCost", 100);  
		        unitCost.setType(ListGridFieldType.FLOAT);  
		          
		        final ListGrid listGrid = new ListGrid();  
		        listGrid.setWidth100();  
		        listGrid.setHeight100();  
		        // listGrid.setAutoFetchData(true);  
//		        listGrid.setDataSource(dataSource);  
		  
		        listGrid.setFields(rowNum, itemName, sku, description, category, units, unitCost);  
		  
		        Layout layout = new Layout(); 
		        layout.addChild(listGrid); 
		        
		        // listGrid.draw();
		        

				Tab t = new Tab(name);
				
				//Layout l = lay.getLayout();
				
				 HTMLPane fetchPane = new HTMLPane();
				 fetchPane.setContentsURL("http://www.naver.com");  
		        fetchPane.setContentsType(ContentsType.PAGE);  
		        
			     t.setPane(fetchPane);  
			        
				
				ts.addTab(t);
				
				ts.redraw();
				
				 
				// t.draw(); 
//				l.redraw(); 
*/ 				
			}
		});

		return tg; 
	}
	

	
	
}
