package com.SwagLabs.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage
{

	WebDriver driver;
	public CheckOutPage(WebDriver driver)//base class
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="first-name")
	WebElement fname;
	
	@FindBy(id="last-name")
	WebElement lname;
	
	@FindBy(id="postal-code")
	WebElement zcode;
	
	@FindBy(id="continue")
	WebElement contBtn;
	
	//Action
	public OverViewPage doContinue(String fn,String ln,String zc)
	{
		fname.sendKeys(fn);
		lname.sendKeys(ln);
		zcode.sendKeys(zc);
		System.out.println("User enter firstname: "+fn+" lastname: "+ln+" zipcode: "+zc);
		
		contBtn.click();
		return new OverViewPage(driver);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
