package com.dev.vaadinresponsive.view;

import com.jarektoro.responsivelayout.ResponsiveColumn;
import com.jarektoro.responsivelayout.ResponsiveLayout;
import com.jarektoro.responsivelayout.ResponsiveRow;
import com.vaadin.navigator.View;
import com.vaadin.server.Page;
import com.vaadin.server.Page.Styles;
import com.vaadin.spring.annotation.SpringView;

@SpringView(name = "")
public class HomeView extends ResponsiveLayout implements View {

	public HomeView() {
		theme();

		/// create root layout
		setSizeFull();
		ResponsiveRow rootRow = addRow();

		/// create column for menu and main
		ResponsiveColumn sideMenuCol = new ResponsiveColumn(12, 12, 3, 3);
		rootRow.addColumn(sideMenuCol);
		sideMenuCol.addStyleName("bg-menu");
		// Fluent API (optional way)
		ResponsiveColumn mainSectionCol = rootRow.addColumn().withDisplayRules(12, 12, 9, 9);
		mainSectionCol.addStyleName("bg-main");

	}

	void theme() {
		Styles styles = Page.getCurrent().getStyles();
		styles.add(".bg-menu { background-color: #4286f4; } .bg-main { background-color: #f44141; }");
	}

}
