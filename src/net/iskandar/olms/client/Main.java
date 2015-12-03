package net.iskandar.olms.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.core.client.GXT;
import com.sencha.gxt.core.client.util.Margins;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.Window;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.BorderLayoutContainer;
import com.sencha.gxt.widget.core.client.container.CenterLayoutContainer;
import com.sencha.gxt.widget.core.client.container.MarginData;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.Viewport;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;

public class Main implements EntryPoint {

	interface TreeNodeBase {
		
	}
	
	
	
	@Override
	public void onModuleLoad() {

		Viewport viewport = new Viewport();
		viewport.addStyleName("x-viewport");

		BorderLayoutContainer borderLayoutContainer = new BorderLayoutContainer();
        borderLayoutContainer.setBorders(true);
        
        VerticalLayoutContainer north = new VerticalLayoutContainer();
        north.add(new HTML("<div class=\"olms-title\">Open License Management Server</div>"));
        
        BorderLayoutContainer.BorderLayoutData northData = new BorderLayoutContainer.BorderLayoutData(150);
        northData.setCollapsible(false);
        northData.setSplit(false);
        northData.setCollapseMini(false);
        northData.setMargins(new Margins(0, 5, 0, 5));
        northData.setSize(50);
        
        ContentPanel west = new ContentPanel();
        west.add(new HTML("This is west panel"));
        
        BorderLayoutContainer.BorderLayoutData westData = new BorderLayoutContainer.BorderLayoutData(250);
        westData.setCollapsible(true);
        westData.setSplit(true);
        westData.setCollapseMini(true);
        westData.setMargins(new Margins(0, 5, 0, 5));

		CenterLayoutContainer centerLayoutContainer = new CenterLayoutContainer();
		TextButton textButton = new TextButton("Click Me!");
		textButton.addSelectHandler(new SelectHandler() {
			@Override
			public void onSelect(SelectEvent event) {
				Window basicWindow = new Window();
				basicWindow.setHeadingHtml("GXT CookBook | Recipe One");
				basicWindow.setClosable(true);
				basicWindow.setSize("250px", "50px");
				// prepare content to show
				VerticalLayoutContainer textPanel = new VerticalLayoutContainer();
				textPanel.addStyleName("text-panel");
				//setStyleAttribute("padding", "15px");
				textPanel.add(new HTML("<div>This is our first recipe from GXT Cookbook, how are we doing so far ...</div>"));
				// place content on the window
				// and display it.
				basicWindow.add(textPanel);
				basicWindow.show();		
			}
		});
		centerLayoutContainer.add(textButton);

        MarginData centerData = new MarginData();

        borderLayoutContainer.setNorthWidget(north, northData);
        borderLayoutContainer.setWestWidget(west, westData);
	    borderLayoutContainer.setCenterWidget(centerLayoutContainer, centerData);

		viewport.add(borderLayoutContainer);
		RootPanel.get().add(viewport);		
	}

}
