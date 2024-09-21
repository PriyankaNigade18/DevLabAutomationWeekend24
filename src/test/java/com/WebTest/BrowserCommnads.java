package com.WebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class BrowserCommnads {

	public static void main(String[] args)
	{
		//Create a driver session
		WebDriver driver=new ChromeDriver();
		
		//To open application
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//To maximize the browser window
		driver.manage().window().maximize();
		
		//To get the title- getTitle()
		String actTitle=driver.getTitle();
		System.out.println("Title of Current web page is: "+actTitle);
		
		
		//To get the current url- getCurrentUrl()
		System.out.println("Current url is: "+driver.getCurrentUrl());
		
		//To get the page source -getPageSource()
		System.out.println(driver.getPageSource());
		
		//close the browser- close() or quit()
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
