package com.cooper.client;

  
import com.smartgwt.client.types.ListGridFieldType;  
import com.smartgwt.client.widgets.grid.CellFormatter;  
import com.smartgwt.client.widgets.grid.ListGrid;  
import com.smartgwt.client.widgets.grid.ListGridField;  
import com.smartgwt.client.widgets.grid.ListGridRecord;  
import com.smartgwt.client.widgets.layout.Layout;
   

public class LayTest implements LayoutIF {

	public Layout getLayout() {
		// grid layout 
		  
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
        listGrid.setAutoFetchData(true);  
//        listGrid.setDataSource(dataSource);  
  
        listGrid.setFields(rowNum, itemName, sku, description, category, units, unitCost);  
  
        Layout layout = new Layout(); 
        layout.addChild(listGrid); 
        
        // listGrid.draw();
        
        return layout; 
	}  

}  

