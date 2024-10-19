package com.SwagLabs.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage 
{
	WebDriver driver;
	public CartPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//div[@class='cart_item_label']")
	WebElement details;
	
	@FindBy(xpath="//button[text()='Remove']")
	WebElement removebtn;
	
	@FindBy(id="continue-shopping")
	WebElement continuebtn;
	
	@FindBy(id="checkout")
	WebElement checkoutbtn;
	
	
	public void getDetails()
	{
		System.out.println(details.getText());
		
	}
	
	public void doRemove()
	{
		removebtn.click();
		System.out.println("Product removed!");
	}
	
	public InventoryPage doContinueShopping()
	{
		continuebtn.click();
		return new InventoryPage(driver);
	}
	
	public CheckOutPage doCheckout()
	{
		checkoutbtn.click();
		return new CheckOutPage(driver);
	}
	
	
}
