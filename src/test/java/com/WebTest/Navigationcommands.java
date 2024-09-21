package com.WebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationcommands {

	public static void main(String[] args) throws InterruptedException
	{
		// Create  a driver session
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		//navigate to facebook
		driver.navigate().to("https://www.facebook.com");
		
		//static wait-Thread.sleep(2000)
		Thread.sleep(1500);
		
		//back()
		driver.navigate().back();//google
		
		Thread.sleep(1500);
		
		//forward()
		driver.navigate().forward();//facebook
		Thread.sleep(1500);
		
		//refresh()
		driver.navigate().refresh();
		
		
		
		
		
		
		

	}

}
