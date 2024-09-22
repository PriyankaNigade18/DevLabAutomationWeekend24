package com.Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreshworksFooterScenario {

	public static void main(String[] args)
	{
		//Create a driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.freshworks.com/");
		
		//footer list-company
		List<WebElement> list1=driver.findElements(By.xpath("(//ul[contains(@class,'kTjuIu')])[1]//li"));
		for(WebElement i:list1)
		{
			System.out.println(i.getText());
		}
		
		
		System.out.println("*****************************");
		
		//(//ul[contains(@class,'kTjuIu')])[3]//li
		List<WebElement> allList=driver.findElements(By.xpath("//ul[contains(@class,'kTjuIu')]"));
		int x=1;
		for(WebElement i:allList)
		{
			List<WebElement> list=driver.findElements(By.xpath("(//ul[contains(@class,'kTjuIu')])["+x+"]//li"));
			for(WebElement j:list)
			{
				System.out.println(j.getText());
			}
			x++;
		}
		

	}

}
