package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo5_CssSelector {

	public static void main(String[] args) 
	{
		// Create a driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		
		//email- tagname with id
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("sumit11@gmail.com");
		
		//password- tagname with attribute
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("test123");
		
		//button -tagname with classname
		//driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

		//button -tagname with id,classname,attribute
		driver.findElement(By.cssSelector("input.btn.btn-primary[value='Login']")).click();
		
	}

}
