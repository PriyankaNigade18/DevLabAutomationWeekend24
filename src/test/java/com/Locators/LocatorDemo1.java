package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo1 {

	public static void main(String[] args)
	{
		//Create a driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://automationplayground.com/crm/login.html");
		
		//email- id
		driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
		
		//password- name
		driver.findElement(By.name("password-name")).sendKeys("test123");
				
		//checkbox -id
		driver.findElement(By.id("remember")).click();
		
		//submit - className-InvalidSelectorException: Compound class names not permitted
		//driver.findElement(By.className("btn btn-default btn-primary")).click();
		
		driver.findElement(By.className("btn")).click();
		
		
		

	}

}
