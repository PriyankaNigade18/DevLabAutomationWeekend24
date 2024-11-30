package com.MobileAppScenarios;

import java.time.Duration;

import org.testng.annotations.Test;

import com.DriverSession.DriverUtil;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class WorkingWithApp {
  @Test
  public void testApplicationcmd() throws InterruptedException 
  {
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  System.out.println("After Application Launch current state: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

	  ((AndroidDriver)driver).terminateApp("io.appium.android.apis");
	  Thread.sleep(1500);
	  
	  System.out.println("After terminate current state: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));
	  
	  //activate app
	  
	  ((AndroidDriver)driver).activateApp("io.appium.android.apis");
	  Thread.sleep(1500);
	  System.out.println("After Activate current state: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

	  //uninstall
	  ((AndroidDriver)driver).removeApp("io.appium.android.apis");
	  System.out.println("After Remove current state: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));
	  Thread.sleep(1500);
	  
	  
	  String path=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
	  //install
	  ((AndroidDriver)driver).installApp(path);
	  System.out.println("After install current state: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

	  Thread.sleep(1500);
	  
	  ((AndroidDriver)driver).activateApp("io.appium.android.apis");
	  Thread.sleep(1500);
	  System.out.println("After Activate current state: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

	  
	  ((AndroidDriver)driver).runAppInBackground(Duration.ofMillis(5000));
	  System.out.println("After running in background current state: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
