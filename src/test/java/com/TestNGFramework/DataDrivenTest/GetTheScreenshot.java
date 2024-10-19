package com.TestNGFramework.DataDrivenTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class GetTheScreenshot {
  @Test
  public void takeScreenshot() throws IOException 
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  
	  TakesScreenshot ts=(TakesScreenshot) driver;
	  
	  File temp=ts.getScreenshotAs(OutputType.FILE);
	  
	  //location
	  File dest=new File(System.getProperty("user.dir")+"//Screenshots//facebook"+System.currentTimeMillis()+".png");
	  
	  FileHandler.copy(temp,dest);
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
