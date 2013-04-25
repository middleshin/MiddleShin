package com.cooper.client;

import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Widget;

public class BoardContent {

	public BoardContent(){
	}
	
	public Widget create() {

		DecoratorPanel deco = new DecoratorPanel(); 
		
		deco.setWidth("2px"); 
		
		deco.add(new HTML("aaabbbbbbbbbbbbdsffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff")); 

		return deco ; 
		
		/*
		// Create a Dock Panel
	    DockPanel dock = new DockPanel();
	    dock.setStyleName("cw-DockPanel");
	    dock.setSpacing(4);
	    dock.setHorizontalAlignment(DockPanel.ALIGN_CENTER);

	    // Add text all around
	    dock.add(new HTML(constants.cwDockPanelNorth1()), DockPanel.NORTH);
	    dock.add(new HTML(constants.cwDockPanelSouth1()), DockPanel.SOUTH);
	    dock.add(new HTML(constants.cwDockPanelEast()), DockPanel.EAST);
	    dock.add(new HTML(constants.cwDockPanelWest()), DockPanel.WEST);
	    dock.add(new HTML(constants.cwDockPanelNorth2()), DockPanel.NORTH);
	    dock.add(new HTML(constants.cwDockPanelSouth2()), DockPanel.SOUTH);

	    // Add scrollable text in the center
	    HTML contents = new HTML(constants.cwDockPanelCenter());
	    ScrollPanel scroller = new ScrollPanel(contents);
	    scroller.setSize("400px", "100px");
	    dock.add(scroller, DockPanel.CENTER);

	    // Return the content
	    dock.ensureDebugId("cwDockPanel");
	    return dock;
	  
	  */
		
	}
}
