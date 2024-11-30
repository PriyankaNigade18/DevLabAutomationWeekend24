package com.MobileAppScenarios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.DriverSession.DriverUtil;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ClickGuesture {
  @Test
  public void testClickGeusture() 
  {
	  
	  //create driver session
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  
	  //view
	 WebElement ele= driver.findElement(AppiumBy.accessibilityId("Views"));
	 
	 //clickGuesture
	 driver.executeScript("mobile: clickGesture",ImmutableMap.of(
			 "elementId",((RemoteWebElement)ele).getId()
			 
			 ));
	 
	 System.out.println("click guesture is completed!");
	 
	 
	 
	 
	 
	 
  }
}
