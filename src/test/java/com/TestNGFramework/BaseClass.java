package com.TestNGFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass
{
	public WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
	}
	@BeforeMethod
	  public void getAppTitle()
	  {
		  System.out.println("Application title is: "+driver.getTitle());
	  }
	  
	  @AfterMethod
	  public void getAppUrl()
	  {
		  System.out.println("Application url: "+driver.getCurrentUrl());
	  }
	  @AfterClass
	  public void tearDown()
	  {
		  //close
		driver.quit();  
	  }

}
