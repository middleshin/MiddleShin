package com.cooper.client; 

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.dom.client.Style.Unit;
/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Cooper implements EntryPoint {
	/**
	 * This is the entry point method.
	 */
	// private final CwConstants constants;

	Unit unit;
	
	public void onModuleLoad() {

/*
		// 제일상단의 메뉴바를 만든다.
		// 제일 안쪽에 들어가는 위젯부터 만들어서 넣는다. 
		// 안쪽 메뉴 바 
		HorizontalPanel hPanel = new HorizontalPanel();
		hPanel.setSize("1000px", "20px"); 
		hPanel.setSpacing(3);
		hPanel.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		
		hPanel.add(new HTML("반갑습니다. 홍길동님!"));
		
		// Add some content to the panel
		for (int i = 1; i < 6; i++) {
			hPanel.add(new Button("button" + i));
		}
		
		// 바깥쪽 메뉴 바 
		DecoratorPanel topBar = new DecoratorPanel();
		topBar.setWidth("2");
		//topBar.setSize("1200", "25px");
		topBar.add(hPanel);
		
		DecoratorPanel main = new DecoratorPanel();
		main.setWidth("2");
		main.add(new HTML("kkkdsfjsdlfks"));

		
		LayoutPanel layout = new LayoutPanel(); // com.google.gwt.dom.client.Style.Unit.PX);
		//layout.add(topBar); 
		// layout.add(main);
		
		layout.addNorth(topBar, 2) ; // , 100, com.google.gwt.dom.client.Style.Unit.PX, 100, com.google.gwt.dom.client.Style.Unit.PX);
		
		layout.addEast(new HTML("addEast"), 2);
		
		layout.addWest(new HTML("addWest"), 2);
		
		layout.addSouth(new HTML("addSouth"), 2);
		
		layout.add(new HTML("Center"));
		
		
		
		
		// layout.addEast(main, 100); 
		
		//setWidgetTopBottom(main, 50, com.google.gwt.dom.client.Style.Unit.PX, 100, com.google.gwt.dom.client.Style.Unit.PX);
*/
		
		
/*		DockLayoutPanel p = new DockLayoutPanel(com.google.gwt.dom.client.Style.Unit.EM);
		// p.setWidth("1200PX"); 
		
		p.addNorth(new HTML("headerlskdjflsdkjflsdkjflskdjflskdjflsdkjflksdjflksdjflskdjflksdjflksdjflksdjfoisejfsekjslkfjslkdjlskdjfliserjlistjsldkj"), 2);
		p.addSouth(new HTML("footer oiewrueowirujwoeijrijweroijweiorjweoiruweoiuroweijrweoirjskldfjsoldijfselkjfslkfjksldjhfksjdhgkjsdhfkjhsoejslkfjaslke"), 2);
		p.addWest(new HTML("navigation"), 10);
		p.add(new HTML("동해물과 백두산이 마르로 닳도록 하느님이 보우하사 우리나라 만세"));
*/
/*		
		HorizontalPanel hPanel = new HorizontalPanel();
		hPanel.setSpacing(1);
		hPanel.add(new HTML("반갑습니다. 홍길동님!"));
		
		// Add some content to the panel
		for (int i = 1; i < 6; i++) {
			hPanel.add(new Button("button" + i));
		}
		
		LayoutPanel p = new LayoutPanel(); 
		
		// p.setWidth("1900px"); 
		
		HTML html = new HTML("headerlskdjflsdkjflsdkjflskdjflskdjflsdkjflksdjflksdjflskdjflksdjflksdklfhjsdklfjesifjslkfjlsdkjfslkmdsflk123o0983u09428304982djflksdjfoisejfsekjslkfjslkdjlskdjfliserjlistjsldkLKGJLKDSJFLKJLKJLSDGKJSDRIOGJDSLKGJRDSIJGSDLKJGFDLKJGDLFKSJGLSDKFGJSIDLRJGLSKDJLSDKJFDSLKRILJGLKSDJGFDLSKJFGSDFLJIRDJGLSDKJFGLSDIRJGLSKDJFLKDSFGJLDSIFGJj");  
		p.add(html);
		p.setWidgetLeftRight(html, 5, unit.PX, 5, unit.PX);     // Center panel 
		p.setWidgetTopBottom(html, 5, unit.PX, 5, unit.PX); 
		p.setWidth("1200px"); 
		
		
		
		DecoratorPanel main = new DecoratorPanel();
		main.setWidth("100%");
		main.add(hPanel);
		
		// RootLayoutPanel.get().setWidth("1900px"); 
		RootLayoutPanel.get().add(main);
		RootLayoutPanel.get().setWidgetLeftRight(main, 100, unit.PX, 100, unit.PX);
		
		//RootLayoutPanel.get().add(layout);
*/
		  // Create scrollable text 
	      HTML contents = new HTML("This is a ScrollPanel."
	      +" By putting some fairly large contents in the middle"
	      +" and setting its size explicitly, it becomes a scrollable area"
	      +" within the page, but without requiring the use of an IFRAME."
	      +" Here's quite a bit more meaningless text that will serve primarily"
	      +" to make this thing scroll off the bottom of its visible area."
	      +" Otherwise, you might have to make it really, really"
	      +" small in order to see the nifty scroll bars!");

	      //create scrollpanel with content
	      ScrollPanel scrollPanel = new ScrollPanel(contents);
	      scrollPanel.setSize("400px", "100px");

	      DecoratorPanel decoratorPanel = new DecoratorPanel();

	      decoratorPanel.add(scrollPanel);

	      // Add the widgets to the root panel.
	      RootLayoutPanel.get().add(decoratorPanel);

	      
	} 
}
