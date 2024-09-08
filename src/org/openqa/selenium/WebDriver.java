package org.openqa.selenium;

public interface WebDriver extends SearchContext
{

	void get(String url);
	String getTitle();
	String getCurrentUrl();
	
}

