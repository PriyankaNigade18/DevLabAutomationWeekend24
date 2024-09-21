package com.WebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitleValidation {

	public static void main(String[] args)
	{
		//Create a driver session
		WebDriver driver=new ChromeDriver();
		
		//To open Google application
		driver.get("https://www.google.com");
		
		//To get the actual title -getTitle()
		String actTitle=driver.getTitle();
		String exp="Google";
		//compare
		if(actTitle.equals(exp))
		{
			System.out.println("Title is matched....Test Pass!");
			System.out.println("Application title is: "+actTitle);
		}else
		{
			System.out.println("Title is not matched....Test Fail!");

		}
		
		//close the browser close()-current open page/window | quit()- closed all open windows by selenium
		//driver.close();
		
		driver.quit();
		
		

	}

}
