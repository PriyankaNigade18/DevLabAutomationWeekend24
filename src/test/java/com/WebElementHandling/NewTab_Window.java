package com.WebElementHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTab_Window {
  @Test
  public void testTab_Window()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  
	  //new tab--->facebook
	  for(int i=1;i<=10;i++) {
	  WebDriver tab=driver.switchTo().newWindow(WindowType.TAB);
	  tab.get("https://www.facebook.com");
	  }
	  
	  //new window
	  WebDriver window=driver.switchTo().newWindow(WindowType.WINDOW);
	  window.get("https://www.amazon.in");
	  
	  
	  
	  
	  
  }
}
