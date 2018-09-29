package com.dev.vaadinresponsive.ui;

import com.dev.vaadinresponsive.view.HomeView;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.UI;

@SpringUI(path = "")
//@Theme("mytheme")
public class HomeUI extends UI {

	Navigator nav;

	@Override
	protected void init(VaadinRequest request) {
		nav = new Navigator(this, this);
		nav.addView("", new HomeView());
	}

}
