package com.Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo3_tagName {

	public static void main(String[] args)
	{
		// Create a driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Number of input boxes
		List<WebElement> inputBoxes=driver.findElements(By.tagName("input"));
		System.out.println("Total Input boxes are: "+inputBoxes.size());
		
		//Number of Images
		int allImages=driver.findElements(By.tagName("img")).size();
		System.out.println("Total Images are: "+allImages);
		
		//Number of Links
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total links are: "+allLinks.size());
		
		//every link link href value and text
		
		for(WebElement i:allLinks)
		{
			System.out.println(i.getText());
			System.out.println(i.getAttribute("href"));
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
