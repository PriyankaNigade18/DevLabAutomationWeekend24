package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementIdentificationWays {

	public static void main(String[] args)
	{
		// Create a driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		
		//technique3: Identify +Action
		driver.findElement(By.id("APjFqb")).sendKeys("cucumber");
		//NoSuchElementException
		
		/*
		//technique2: Identify + Validate + Perform action
		WebElement searchbox=driver.findElement(By.id("APjFqb"));
		
		//validate
		if(searchbox.isDisplayed() && searchbox.isEnabled())
		{
			//action
			searchbox.sendKeys("selenium");
			
			
		}
		*/
		
		
		
		
		
		/*
		//technique1: By Locator (framework)
		//get the address
		By searchEle=By.id("APjFqb");
		
		//identify using selenium
		WebElement searchbox=driver.findElement(searchEle);
		
		//validate webElement
		System.out.println("SearchBox is displayed onto page?: "+searchbox.isDisplayed());
		System.out.println("Serachbox is enabled?: "+searchbox.isEnabled());
		
		
		//perform action
		searchbox.sendKeys("Java",Keys.ENTER);
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
