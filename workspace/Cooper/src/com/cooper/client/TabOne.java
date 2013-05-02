package com.cooper.client;

import com.smartgwt.client.widgets.grid.CellFormatter;  
import com.smartgwt.client.widgets.grid.ListGrid;  
import com.smartgwt.client.widgets.grid.ListGridField;  
import com.smartgwt.client.widgets.grid.ListGridRecord;  
import com.smartgwt.client.widgets.layout.Layout;
import com.smartgwt.client.widgets.tab.Tab;

public class TabOne extends Tab {

	public TabOne(String tabName) {
		  
		ListGridField rowNum = new ListGridField("No.", 30);  
        
		rowNum.setCellFormatter(new CellFormatter() {  
            public String format(Object value, ListGridRecord record, int rowNum, int colNum) {  
                return rowNum +"";  
            }  
        });  
  
        ListGridField comNm = new ListGridField("회사명", 150);  
        ListGridField bizNo = new ListGridField("법인번호", 100);  
        ListGridField anniDt = new ListGridField("창립기념일", 80);  
        ListGridField ceoNm = new ListGridField("대표이사명", 80);  
        ListGridField desc = new ListGridField("설명", 300);  
  
        // ListGridField unitCost = new ListGridField("unitCost", 100);  
        // unitCost.setType(ListGridFieldType.FLOAT);  
          
        final ListGrid listGrid = new ListGrid();  
        listGrid.setWidth100();  
        listGrid.setHeight100();  
        listGrid.setAutoFetchData(true);  
  
        listGrid.setFields(rowNum, comNm, bizNo, anniDt, ceoNm, desc);  
  
        Layout layout = new Layout(); 
        layout.addChild(listGrid); 

        setTitle(tabName); 
        setPane(layout); 
	}  
}  

