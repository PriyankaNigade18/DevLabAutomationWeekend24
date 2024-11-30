package com.Generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;

public class Utility {

	
	public static void scrollDown(AppiumDriver driver,WebElement ele)
	{
		driver.executeScript("mobile: scrollGesture",ImmutableMap.of(
				  "elementId",((RemoteWebElement)ele),
				  "direction","down",
				  "percent",1.0
				  		  
				  ));
	}
	
	public static void scrollUp(AppiumDriver driver,WebElement ele)
	{
		driver.executeScript("mobile: scrollGesture",ImmutableMap.of(
				  "elementId",((RemoteWebElement)ele),
				  "direction","up",
				  "percent",1.0
				  		  
				  ));
	}
	
	public static void scrollDownUptoCount(AppiumDriver driver,WebElement ele,int count)
	{
		for(int i=1;i<=count;i++)
		{
		driver.executeScript("mobile: scrollGesture",ImmutableMap.of(
				  "elementId",((RemoteWebElement)ele),
				  "direction","down",
				  "percent",1.0
				  		  
				  ));
		System.out.println("Iteration : "+i);
		}
	}
	
	
}
