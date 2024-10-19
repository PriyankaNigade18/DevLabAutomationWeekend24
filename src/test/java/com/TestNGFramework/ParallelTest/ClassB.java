package com.TestNGFramework.ParallelTest;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ClassB 
{
	@Test
	  public void firefoxTest() 
	  {
		  WebDriver driver=new FirefoxDriver();
		  driver.get("https://www.amazon.com");
		  System.out.println(driver.getTitle());
	  }
}
