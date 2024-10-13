package com.TestNGFramework.PageObjectUsingPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenCartLoginPage //extends BaseClass
{
	WebDriver driver;
	
	public OpenCartLoginPage(WebDriver driver)
	{
		this.driver=driver;
		//initialize element
		PageFactory.initElements(driver,this);
	}
	
	
	//Locator
	@FindBy(id="input-email")
	WebElement email;
	
	@FindBy(id="input-password")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement btn;
	
	
	//actions methods

	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	
	public void doLogin(String em,String psw)
	{
		email.sendKeys(em);
		password.sendKeys(psw);
		btn.click();
	}
	
	
	
	
	

}
