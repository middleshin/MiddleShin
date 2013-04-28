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
  
import com.smartgwt.client.widgets.Label;   
import com.smartgwt.client.widgets.layout.HLayout;   
import com.smartgwt.client.widgets.layout.VLayout;   
import com.smartgwt.client.widgets.tab.Tab;
import com.smartgwt.client.widgets.tab.TabSet;
import com.smartgwt.client.widgets.tree.TreeGrid;
  
import com.google.gwt.core.client.EntryPoint;   
  
public class Cooper implements EntryPoint {   
  
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
        ContentMenu contentMenu = new ContentMenu();
        
        TreeGrid menu = contentMenu.getMenu();  
        menu.setHeight100();
        menu.setWidth100();
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
        
        final TabSet tabSet = new TabSet();   
        tabSet.setTabBarPosition(Side.TOP);   
        //tabSet.setWidth100();   
        //tabSet.setHeight100();   
  
        Tab tTab1 = new Tab("Blue") ; // , "pieces/16/pawn_blue.png");   
        //Img tImg1 = new Img("pieces/48/pawn_blue.png", 48, 48);   
        //tTab1.setPane(tImg1);   
  
        Tab tTab2 = new Tab("Green") ; //, "pieces/16/pawn_green.png");   
        //Img tImg2 = new Img("pieces/48/pawn_green.png", 48, 48);   
        //tTab2.setPane(tImg2);   
  
        tabSet.addTab(tTab1);   
        tabSet.addTab(tTab2);   

        
        hLayout.addMember(tabSet); 

        // TabSet 
        contentMenu.setTabSet(tabSet); 
        
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
