package com.alignfactory.cooper.client; 

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
import com.google.gwt.user.client.ui.StackLayoutPanel;
import com.google.gwt.user.client.ui.TabLayoutPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class CopyOfCooper implements EntryPoint {
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		
		final TabLayoutPanel tab = new TabLayoutPanel(2.5, Unit.EM);
		
		//  button 입력 
		Button addBtn = new Button("Add");
		
		final StackLayoutPanel stack = new StackLayoutPanel(Unit.EM);
		stack.add(new HTML("this content"), new HTML("this"), 2);
		stack.add(new HTML("that content"), new HTML("that"), 2);
		stack.add(addBtn, new HTML("that"), 2);
		
		HTML html1 = new HTML("this content"); 
		
		tab.add(html1, "this");
		tab.add(new HTML("Others"), "Others");
		tab.add(new HTML("that content"), "that");
		
		tab.addStyleName("addPanel");

		SplitLayoutPanel p = new SplitLayoutPanel();
		//p.addStyleName("addPanel");
		p.addNorth(new HTML("this content"), 10); 
		
		// addWest(stack, 200);
		p.addWest(stack, 200);
		p.add(tab);

		RootLayoutPanel.get().add(p);
		
		addBtn.addClickHandler(new ClickHandler() {
		      public void onClick(ClickEvent event) {
		    	  
		    	  Window.alert("aa"); 
		    	  CompositeExample ce = new CompositeExample(); 
		    	  tab.add((IsWidget)ce.addPanel(), "TAB");
		      }

		});

		
		
		
	} 
}
