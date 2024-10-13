package com.TestNGFramework.PageObjectUsingPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseClass
{
	public WebDriver driver;
	public OpenCartLoginPage lp;
	
	
	@BeforeClass
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		lp=new OpenCartLoginPage(driver);
	}

}
