package com.Capabilities;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class FileDownloadAutomation {
  @Test
  public void testDownload()
  {
	  
	  ChromeOptions options = new ChromeOptions();
	  Map<String, Object> prefs = new HashMap<String, Object>();
	  prefs.put("download.default_directory",System.getProperty("user.dir"));
	  options.setExperimentalOption("prefs", prefs);
	  
	  
	  
	  WebDriver driver=new ChromeDriver(options);
	  driver.get("https://the-internet.herokuapp.com/download");
	  
	  
	  
	  driver.findElement(By.linkText("selenium-java-4.25.0.zip")).click();
	  
  }
}
