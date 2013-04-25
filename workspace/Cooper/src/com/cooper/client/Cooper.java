package com.cooper.client; 

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Cooper implements EntryPoint {

	public void onModuleLoad() {
		
		SplitLayoutPanel p = new SplitLayoutPanel();		
		
		BoardContent bc = new BoardContent(); 

		p.addNorth(bc.create(), 50);
		p.addWest(bc.create(), 200);
		p.addWest(bc.create(), 200);
		p.add(bc.create());
	
		RootLayoutPanel.get().add(p);
	} 
}
