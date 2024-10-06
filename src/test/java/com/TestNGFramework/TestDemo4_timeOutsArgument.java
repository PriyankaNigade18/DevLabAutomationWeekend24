package com.TestNGFramework;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestDemo4_timeOutsArgument {
  @Test
  public void testCase1() 
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  System.out.println("Title is: "+driver.getTitle());
	  
  }
  
  @Test(timeOut = 3000)
  public void testCase2() 
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.com");
	  System.out.println("Title is: "+driver.getTitle());
	  
  }
  
  
}
