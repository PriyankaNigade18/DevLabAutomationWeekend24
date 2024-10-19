package com.TestNGFramework.ParallelTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ClassA
{
  @Test(priority=1)
  public void chromeTest() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  System.out.println(driver.getTitle());
  }
  
  
  @Test(priority=2)
  public void EdgeTest() 
  {
	  WebDriver driver=new EdgeDriver();
	  driver.get("https://www.facebook.com");
	  System.out.println(driver.getTitle());
  }
  
  
}
