package org.openqa.selenium;

public class RemoteWebDriver implements WebDriver
{

	@Override
	public void findElement() {
		System.out.println("FindElement will help to identify single WebElement");
		
	}

	@Override
	public void findElements() {
		System.out.println("FindElements will help to identify multiple WebElements");

		
	}

	@Override
	public void get(String url) {
		System.out.println("Open application: "+url);
		
	}

	@Override
	public String getTitle() {
		String title="Current application title";
		return title;
	}

	@Override
	public String getCurrentUrl() {
		String url="Current page URL";
		return url;
	}

}
