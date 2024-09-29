package com.WebElementHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameHandlingDemo2_Nested {
  @Test
  public void testNestedFrame() {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/nested_frames");
	  
	  //top---->left
	  
//	  driver.switchTo().frame(0);//top
//	  driver.switchTo().frame("frame-left");//left
	  
	  driver.switchTo().frame(0).switchTo().frame("frame-left");
	  System.out.println("************On Left Frame*****************");
	  System.out.println(driver.getPageSource());
	  
	  
	  //main document
	  driver.switchTo().defaultContent();
	  
	  //top--->middle
	  driver.switchTo().frame(0).switchTo().frame("frame-middle");
	  
	  System.out.println("************On Middle Frame*****************");
	  System.out.println(driver.getPageSource());
	  
	  
	  //top--->right
	  
	  //bottom
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
