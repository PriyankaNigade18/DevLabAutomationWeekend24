package com.SwagLabs.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverViewPage
{
	
	WebDriver driver;
	
	public OverViewPage(WebDriver driver)//base class
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//div[@class='summary_info']")
	WebElement summary;
	
	@FindBy(id="finish")
	WebElement finishBtn;
	
	@FindBy(tagName="h2")
	WebElement message;
	
	//Actions
	
	public void getOverView()
	{
		String text1=summary.getText();
		System.out.println("Summary of order is: "+text1);
		
		finishBtn.click();
		System.out.println("Purches Message: "+message.getText());
	}
	
	
	
	

}
