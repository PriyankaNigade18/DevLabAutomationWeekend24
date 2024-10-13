package com.TestNGFramework.PageObjectUsingByLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
	//Encapsulation= private data + public function
	
	private WebDriver driver;
	
	//create constructor for initialize Object
	public LoginPage(WebDriver driver)//driver form base class
	{
		this.driver=driver;
	}
	
	//Locator
	private By email=By.id("email-id");
	private By password=By.id("password");
	private By btn=By.id("submit-id");
	
	//actions Method
	public void enterEmail(String id)
	{
		driver.findElement(email).sendKeys(id);
	}
	
	public void enterPassword(String psw)
	{
		driver.findElement(password).sendKeys(psw);
	}
	public void clickOnSubmit()
	{
		driver.findElement(btn).click();
	}
	
	
	public void doLogin(String eid,String psw)
	{
		driver.findElement(email).sendKeys(eid);
		driver.findElement(password).sendKeys(psw);
		driver.findElement(btn).click();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}

	
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
}
