package com.SwagLabs.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage 
{

	
	WebDriver driver;
	
	public InventoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	
	@FindBy(xpath="//div[@class='inventory_item_name ']")
	List<WebElement> pcount;
	
	@FindBy(xpath="//button[text()='Add to cart']")
	WebElement addToCartbtn;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement cartBtn;
	
	
	//methods
	public int getProductCount()
	{
		int count=pcount.size();
		return count;
	}
	
	public void getProductDetails()
	{
		System.out.println("**********Product Names are*********");
		for(WebElement i:pcount)
		{
			System.out.println(i.getText());
		}
	}
	
	
	public void addProductToCart(String pname)
	{
		for(WebElement i:pcount)
		{
			if(i.getText().contains(pname))
			{
				i.click();
				break;
			}
		}
		//click on add to cart btn
		addToCartbtn.click();
		System.out.println("Product added to cart: "+pname);
		
	}
	
	public CartPage getCartPage()
	{
		cartBtn.click();
		return new CartPage(driver);
	}
	
	
}
