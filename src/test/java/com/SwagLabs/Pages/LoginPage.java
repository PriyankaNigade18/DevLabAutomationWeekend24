package com.SwagLabs.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	PageFactory.initElements(driver,this);	
	}
	
	
	@FindBy(id="user-name")
	WebElement un;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginbtn;
	
	//Actions Method
	
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	public InventoryPage doLogin(String usern,String psw)
	{
	un.sendKeys(usern);
	password.sendKeys(psw);
	loginbtn.click();
	return new InventoryPage(driver);
	}
	
}
