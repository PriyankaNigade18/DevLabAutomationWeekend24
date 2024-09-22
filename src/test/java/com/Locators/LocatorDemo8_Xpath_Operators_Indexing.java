package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo8_Xpath_Operators_Indexing {

	public static void main(String[] args) 
	{
		// Create a driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		//fname
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Amit");
		
		//lname- xpath with and operator
		driver.findElement(By.xpath("//input[@name='lastname' and @class='form-control']")).sendKeys("Sharma");
		
		//email- xpath with or operator
		driver.findElement(By.xpath("//input[@placeholder='E-Mail' or @class='abc']")).sendKeys("amitsharma11@gmail.com");
		
		//telephone xpath with indexing
		driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("767897766");
		
		//password - xpath with position()
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=5]")).sendKeys("test123");
		
		//confirm password
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=6]")).sendKeys("test123");
		
		//radio button-yes
		driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).click();
		
		//checkbox
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		
		
		
		//continue
		
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		//message
		String text=driver.findElement(By.xpath("(//h1)[2]")).getText();
		System.out.println(text);
		

	}

}
