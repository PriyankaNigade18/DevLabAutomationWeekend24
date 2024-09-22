package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo9_XpathMethods {

	public static void main(String[] args)
	{
		// Create a driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		//mobile page- text()
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		
		//open cart page- normalize-space()
		driver.findElement(By.xpath("//span[normalize-space()='Cart']")).click();
		
		//cart message -normalize-space()
		String text1=driver.findElement(By.xpath("//h2[normalize-space()='Your Amazon Cart is empty']")).getText();
		System.out.println(text1);
		
		//search box- contains()
		driver.findElement(By.xpath("//input[contains(@id,'tabsearch')]")).sendKeys("watch",Keys.ENTER);
		
		//search box -starts-with()prefix
		WebElement ele=driver.findElement(By.xpath("//input[starts-with(@id,'two')]"));
		ele.clear();
		ele.sendKeys("Bags",Keys.ENTER);
		
		
		
		
		
		

	}

}
