package com.cooper.client;
/*  
 * Smart GWT (GWT for SmartClient)  
 * Copyright 2008 and beyond, Isomorphic Software, Inc.  
 *  
 * Smart GWT is free software; you can redistribute it and/or modify it  
 * under the terms of the GNU Lesser General Public License version 3  
 * as published by the Free Software Foundation.  Smart GWT is also  
 * available under typical commercial license terms - see  
 * http://smartclient.com/license  
 *  
 * This software is distributed in the hope that it will be useful,  
 * but WITHOUT ANY WARRANTY; without even the implied warranty of  
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU  
 * Lesser General Public License for more details.  
 */  
  
import com.smartgwt.client.types.Alignment;   
import com.smartgwt.client.types.Side;
import com.smartgwt.client.util.SC;
  
import com.smartgwt.client.widgets.Label;   
import com.smartgwt.client.widgets.layout.HLayout;   
import com.smartgwt.client.widgets.layout.VLayout;   
import com.smartgwt.client.widgets.tab.Tab;
import com.smartgwt.client.widgets.tab.TabSet;
import com.smartgwt.client.widgets.tree.TreeGrid;
  
import com.google.gwt.core.client.EntryPoint;   
  
public class Cooper implements EntryPoint {   
	
	final static TabSet tabSet = new TabSet();
	
	
	public static void addTab(String msg){
		//SC.say(msg); 
		 
		tabSet.clear(); 
		tabSet.redraw(); 
		
		Tab tab = new Tab(msg); 
		LayTest lay = new LayTest();
		 
		 tab.setPane(lay.getLayout()); 
		 tabSet.addTab(tab);
		 
		 tabSet.redraw(); 
	}
	
	
    public void onModuleLoad() {   
  
/********************************************
 *  Left Menu Frame Setting 
 ********************************************/ 
        VLayout vLayout = new VLayout();   
        vLayout.setWidth(200);   
        vLayout.setMembersMargin(3);   
        vLayout.setLayoutMargin(5);   
        vLayout.setShowEdges(true);   
        vLayout.setEdgeSize(1);
        
        // menu title Place
        vLayout.addMember(new BlueBox(null, 30, "Cooper"));
        
        // login user Place 
        vLayout.addMember(new BlueBox((String)null, "120", "Hellow User's Info"));

        // Set Menu 
        ContentLeft contentMenu = new ContentLeft();
        TreeGrid menu = contentMenu.getMenu();  
        //menu.setHeight100();
        // menu.setWidth100();
        vLayout.addMember(menu);
        
        // foot Title Place  
        vLayout.addMember(new BlueBox(null, 30, "Cooper.co.kr"));
        
/*********************************
 * Right Content Frame Setting 
 ********************************/
        HLayout hLayout = new HLayout();   
        hLayout.setShowEdges(true);   
        hLayout.setMembersMargin(5);   
        hLayout.setLayoutMargin(1);
        hLayout.setEdgeSize(1);
        
        tabSet.setTabBarPosition(Side.TOP);   
        Tab tTab1 = new Tab("New") ;    
        tabSet.addTab(tTab1);   
        hLayout.addMember(tabSet); 

        // TabSet 
        contentMenu.setTabSet(tabSet); 
        tTab1.setPane(new BlueBox(100, 200, "dddd"));
        
 /***************************** 
 * main Frame Create
 *****************************/ 
        HLayout layout = new HLayout();   
        layout.setWidth100();   
        layout.setHeight100();   
        layout.setMembersMargin(5);   
        layout.setLayoutMargin(5);

        layout.addMember(vLayout);   
        layout.addMember(hLayout);   

        layout.draw();   
    }   
  
    class BlueBox extends Label {   
  
        public BlueBox(String contents) {   
            setAlign(Alignment.CENTER);   
            setBorder("1px solid #808080");   
            setBackgroundColor("#C3D9FF");   
            setContents(contents);   
        }   
  
        public BlueBox(Integer width, Integer height, String contents) {   
            this(contents);   
            if (width != null) setWidth(width);   
            if (height != null) setHeight(height);   
        }   
  
        public BlueBox(Integer width, String height, String contents) {   
            this(contents);   
            if (width != null) setWidth(width);   
            if (height != null) setHeight(height);   
        }   
  
        public BlueBox(String width, String height, String contents) {   
            this(contents);   
            if (width != null) setWidth(width);   
            if (height != null) setHeight(height);   
        }   
    }   
  
}  
