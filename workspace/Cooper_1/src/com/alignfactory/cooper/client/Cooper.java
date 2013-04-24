package com.alignfactory.cooper.client; 

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.RootLayoutPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Cooper implements EntryPoint {
	/**
	 * This is the entry point method.
	 */
	// private final CwConstants constants;

	public void onModuleLoad() {

		// 제일상단의 메뉴바를 만든다.
		// 제일 안쪽에 들어가는 위젯부터 만들어서 넣는다. 
		// 안쪽 메뉴 바 
		HorizontalPanel hPanel = new HorizontalPanel();
		hPanel.setSize("1200px", "20px"); 
		hPanel.setSpacing(3);
		hPanel.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		
		hPanel.add(new HTML("반갑습니다. 홍길동님!"));
		
		// Add some content to the panel
		for (int i = 1; i < 6; i++) {
			hPanel.add(new Button("button" + i));
		}
		
		// 바깥쪽 메뉴 바 
		HorizontalPanel topBar = new HorizontalPanel();
		topBar.setBorderWidth(1);
		topBar.setSize("100%", "25px");
		topBar.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		topBar.add(hPanel); 
		RootLayoutPanel.get().add(topBar);

	} 
}
