package com.TestNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import org.testng.annotations.Test;

public class CRMAnnotationDemo_RealTimeUse extends BaseClass
{
  
	//WebDriver driver;
	
	
	@Test(priority=1)
	  public void testSignInLink() 
	  {
			WebElement ele=driver.findElement(By.linkText("Sign In"));
			if(ele.isDisplayed() && ele.isEnabled())
			{
				ele.click();
			}
	  }
	  
	  @Test(priority=2)
	  public void testSignInFunctionality() 
	  {
		  driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
		  driver.findElement(By.id("password")).sendKeys("test123");
		  driver.findElement(By.id("submit-id")).click();
	  }
	
//	@BeforeClass
//	public void setup()
//	{
//		driver=new ChromeDriver();
//		driver.get("https://automationplayground.com/crm/");
//	}
	
	
  
//  @BeforeMethod
//  public void getAppTitle()
//  {
//	  System.out.println("Application title is: "+driver.getTitle());
//  }
//  
//  @AfterMethod
//  public void getAppUrl()
//  {
//	  System.out.println("Application url: "+driver.getCurrentUrl());
//  }
//  @AfterClass
//  public void tearDown()
//  {
//	  //close
//	driver.quit();  
//  }
}
