package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class LocatorDemo11_RelativeLocator {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/login.html");
		
		//identify email which is above password
		WebElement passele=driver.findElement(By.id("password"));
		driver.findElement(RelativeLocator.with(By.id("email-id")).above(passele)).sendKeys("test@gmail.com");
		
				
		//identify password which is below emailid
		WebElement email=driver.findElement(By.id("email-id"));
		driver.findElement(RelativeLocator.with(By.id("password")).below(email)).sendKeys("test123");
		
		//identify search box which is left of signin
		
		WebElement signin=driver.findElement(By.linkText("Sign In"));
		driver.findElement(RelativeLocator.with(By.xpath("//input[@aria-label='Search']")).toLeftOf(signin)).sendKeys("Hello ");
		
		
		//identify search box which is right of customer service
		WebElement servicele=driver.findElement(By.linkText("Customer Service"));
		driver.findElement(RelativeLocator.with(By.xpath("//input[@aria-label='Search']")).toRightOf(servicele)).sendKeys("All");
		
		
		
		
//		driver.get("https://automationplayground.com/crm/customers.html?email-name=test%40gmail.com&password-name=dasdas&submit-name=");
//		
//		
//		//identify john which is above Aaron
//		
//		WebElement aaron=driver.findElement(By.xpath("//tbody//tr[5]//td[text()='Aaron']"));
//		WebElement ele=driver.findElement(RelativeLocator.with(By.xpath("//tbody//tr[4]//td[text()='John']")).above(aaron));
//		System.out.println(ele.getText());
//		
//		
//		
		
		//identify john which is below Audrey
		
		
		//identify john which is right of id 4
		
		
		//identify john which is left of Robinson	



	}

}
