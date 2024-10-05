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

public class ExplicitWaitUsingWebDriverWaitDemo2 {
  @Test
  public void testExplicitWait() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	  
	  //By locators
	 By emailEle=By.id("input-email");
	 By passEle=By.name("password");
	 By btnEle=By.xpath("//input[@value='Login']");
	 //url
	 
	 boolean urlstatus=Utility.waitForUrlContains(driver,"demo");
	 System.out.println("Url contais that expected text/url: "+urlstatus);
	 
	 boolean titlestatus=Utility.waitForTitleContains(driver,"Account");	 
	 System.out.println("Title contains that expected title: "+titlestatus);

	 Utility.waitForPresenceOfElement(driver,emailEle).sendKeys("test@gmail.com");
	 Utility.waitForVisibilityOfElement(driver,passEle).sendKeys("test111");
	 Utility.waitForElementToBeClickable(driver,btnEle).click();
	 
	 
	 
	 
	 
	 
	 
	 
	  
	  
	  
	  
	  
	  
  }
}
