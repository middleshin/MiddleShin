package com.alignfactory.cooper.client; 

import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.HTML;

public class CompositeExample  {
	
	public CompositeExample(){
	}
	
	public DockPanel addPanel(){ 
		DockPanel dockPanel = new DockPanel();
	
		dockPanel.add(new HTML("This is the first north component."), DockPanel.NORTH);
		
		return dockPanel;
	}
	
	 
}
