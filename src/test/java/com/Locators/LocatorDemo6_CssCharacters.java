package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo6_CssCharacters {

	public static void main(String[] args) {
		// Create a driver session
			WebDriver driver=new ChromeDriver();
			driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
				
			
			//email- contains(*)
			driver.findElement(By.cssSelector("input[placeholder *='Address']")).sendKeys("sumit11@gmail.com");
			
			//password -StartWith(^)
			driver.findElement(By.cssSelector("input[placeholder ^='Pas']")).sendKeys("test123");
			
			//login -endswith($)
			driver.findElement(By.cssSelector("input[class $='mary']")).click();
			
	}

}
