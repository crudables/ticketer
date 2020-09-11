package com.ables.ticketer.frontend.ui;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;

@Route
@CssImport("./styles/shared-styles.css")
public class MainView extends AppLayout {
	public MainView() {
		createHeader();
		createRightHeading();
		
	}
	
	private void createHeader() {
		H1 logo = new H1("Ticketer");
		logo.addClassName("logo");
		
		HorizontalLayout header= new HorizontalLayout(logo);
		header.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.CENTER);
		header.setWidthFull();
		header.addClassName("header");
		
		addToNavbar(header);
		
	}

	private void createRightHeading() {
		HorizontalLayout rightHeading = new HorizontalLayout();
		Span organiseSpan = new Span("Organise");
		Span helpSpan = new Span("Help");
		Span signInSpan = new Span("Sign In");
		rightHeading.add(organiseSpan,helpSpan,signInSpan);
		
		addToNavbar(rightHeading);
	}
	
}
