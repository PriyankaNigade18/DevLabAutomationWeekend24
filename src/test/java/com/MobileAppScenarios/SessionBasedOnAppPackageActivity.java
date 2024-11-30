package com.MobileAppScenarios;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class SessionBasedOnAppPackageActivity {
  @Test
  public void testSession() throws MalformedURLException
  {
	  UiAutomator2Options options=new UiAutomator2Options();
//	  options.setCapability("appium:appPackage","com.android.deskclock");
//	  options.setCapability("appium:appActivity","com.android.deskclock.DeskClock");
	  
	  options.setCapability("appium:appPackage","io.appium.android.apis");
	  options.setCapability("appium:appActivity","io.appium.android.apis.ApiDemos");
	 
	  //server address
	  URL url=new URL("http://0.0.0.0:4723");
	  
	  //create driver session
	  
	  AppiumDriver driver=new AndroidDriver(url,options);
	  
	  System.out.println("Session id is: "+driver.getSessionId());
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
