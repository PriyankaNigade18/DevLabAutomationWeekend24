package com.TestNGFramework.PageObjectUsingByLocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest 
{

	public WebDriver driver;
	public LoginPage lp;
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/login.html");
		lp=new LoginPage(driver);
		
		
	}
	
}
