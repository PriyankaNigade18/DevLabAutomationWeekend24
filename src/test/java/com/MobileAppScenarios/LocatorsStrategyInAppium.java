package com.MobileAppScenarios;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.DriverSession.DriverUtil;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LocatorsStrategyInAppium {
  @Test
  public void testLocator() throws InterruptedException 
  {
	  //create driver session
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  //accessibility id
	  WebElement ele1=driver.findElement(AppiumBy.accessibilityId("Access'ibility"));
	  System.out.println("Text of Element1: "+ele1.getText());
	  ele1.click();
	  
	  Thread.sleep(1500);
	  
	  //navigate back
	  driver.navigate().back();
	  
	  //android uiautomator
	  WebElement ele2=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Accessibility\")"));
	  System.out.println("Text of Element2: "+ele2.getText());
	  ele2.click();
	  
	  Thread.sleep(1500);
	  //navigate back
	  driver.navigate().back();
	  
	  
	  //xpath
	  WebElement ele3=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Animation\"]"));
	  System.out.println("Text of Element3: "+ele3.getText());
	  ele3.click();
	  
	  Thread.sleep(1500);
	  
	  //navigate back
	  driver.navigate().back();
	  
	  //className
	  WebElement ele4=driver.findElements(AppiumBy.className("android.widget.TextView")).get(4);
	  System.out.println("Text of Element4: "+ele4.getText());
	  ele4.click();
	  
	  Thread.sleep(1500);
	  
	  //navigate back
	  driver.navigate().back();
	  
	  
	  //id/resource-id
	  
	  WebElement ele5=driver.findElements(AppiumBy.id("android:id/text1")).get(4);
	  
	  System.out.println("Text of Element5: "+ele5.getText());
	  
	  ele5.click();
	  Thread.sleep(1500);
	  
	  //navigate back
	  driver.navigate().back();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
