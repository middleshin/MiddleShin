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
  
import com.smartgwt.client.widgets.Label;   
import com.smartgwt.client.widgets.layout.HLayout;   
import com.smartgwt.client.widgets.layout.VLayout;   
  
import com.google.gwt.core.client.EntryPoint;   
  
public class Cooper implements EntryPoint {   
  
    public void onModuleLoad() {   
  
        HLayout layout = new HLayout();   
        layout.setWidth100();   
        layout.setHeight100();   
        layout.setMembersMargin(5);   
        layout.setLayoutMargin(5);
        
        VLayout vLayout = new VLayout();   
        vLayout.setWidth(200);   
        vLayout.setMembersMargin(3);   
        vLayout.setLayoutMargin(5);   
        vLayout.setShowEdges(true);   
        vLayout.setEdgeSize(1);
        
        // menu title 
        vLayout.addMember(new BlueBox(null, 30, "Cooper"));
        // login user 
        vLayout.addMember(new BlueBox((String)null, "120", "Hellow User's Info"));

        // menu list 

        HLayout menuLayout = new HLayout(); 
        
        menuLayout.setWidth100();   
        menuLayout.setHeight100();   
        menuLayout.setShowEdges(true);   
        menuLayout.setEdgeSize(2);
        
        final ContentMenu menu = new ContentMenu();
        
        menu.setHeight100();
        menu.setWidth100();
        menuLayout.addMember(menu);
        vLayout.addMember(menuLayout);

        // foot message 
        vLayout.addMember(new BlueBox(null, 30, "Cooper.co.kr"));
        
        layout.addMember(vLayout);   
  
        HLayout hLayout = new HLayout();   
        hLayout.setShowEdges(true);   
        // hLayout.setHeight(150);   
        hLayout.setMembersMargin(5);   
        hLayout.setLayoutMargin(1);
        hLayout.setEdgeSize(1);
        
        //hLayout.addMember(new BlueBox(50, (Integer) null, "width 50"));   
        //hLayout.addMember(new BlueBox("*", null, "width *"));   
        //hLayout.addMember(new BlueBox("30%", null, "width 30%"));   
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
