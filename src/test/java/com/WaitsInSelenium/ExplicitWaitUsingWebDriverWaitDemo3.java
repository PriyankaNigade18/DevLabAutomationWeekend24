package com.WaitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class ExplicitWaitUsingWebDriverWaitDemo3 {
  @Test
  public void testExplicitWait() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	  
	  By btn=By.xpath("//button[text()='Start']");
	  By textEle=By.xpath("(//h4)[2]");
	  
//	  driver.findElement(btn).click();
//	  String text=driver.findElement(textEle).getText();
//	  System.out.println(text);
	  
	  Utility.waitForPresenceOfElement(driver,btn).click();
	  String text=Utility.waitForVisibilityOfElement(driver,textEle).getText();
	  System.out.println(text);
	 
	 
	  
	  
	  
	  
	  
	  
  }
}
