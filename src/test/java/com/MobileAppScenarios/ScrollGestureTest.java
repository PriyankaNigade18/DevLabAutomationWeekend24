package com.MobileAppScenarios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.DriverSession.DriverUtil;
import com.Generic.Utility;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ScrollGestureTest {
  @Test
  public void testScroll()
  {
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  //view
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  WebElement area=driver.findElement(AppiumBy.id("android:id/list"));
	  
	  Utility.scrollDownUptoCount(driver,area,3);
	  
	  
	  
	  /*
	  //scroll
	  driver.executeScript("mobile: scrollGesture",ImmutableMap.of(
			  "elementId",((RemoteWebElement)area),
			  "direction","down",
			  "percent",1.0
			  		  
			  ));
	  
	 System.out.println("Scroll gesture for down direction is completed!");
	  
	  */
	  
  }
}
