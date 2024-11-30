package com.MobileAppScenarios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.DriverSession.DriverUtil;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class DragGestureTest {
  @Test
  public void testDragGesture()
  {

	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  
	  //view
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //drag n drop
	  driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	  
	  
	  WebElement ele=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_3"));
	  
	  
	  driver.executeScript("mobile: dragGesture",ImmutableMap.of(
			  "elementId",((RemoteWebElement)ele).getId(),
			  "endX",709,
			  "endY",1124
			  
			  
			  ));
	  
	  
	  //message
	  String text=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_result_text")).getText();
	  
	  System.out.println("After Action completed: "+text);
	  
  }
}
