package com.WaitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitUsingWebDriverWaitDemo1 {
  @Test
  public void testExplicitWait() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	  
	  //By locators
	 By emailEle=By.id("input-email");
	 By passEle=By.name("password");
	 By btnEle=By.xpath("//input[@value='Login']");
	 /*
	  * TimeoutException: 
	  * Expected condition failed: waiting for presence of element located by: 
	  * By.id: input-email### 
	  * (tried for 5 second(s) with 500 milliseconds interval)
	  * interval time=Polling time=500ms=0.5 sec
	  * 
	  * What is default polling timeout for selenium= 0.5sec
	  * 
	  */
	 //explicitWait
	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	 WebElement ele1=wait.until(ExpectedConditions.presenceOfElementLocated(emailEle));
	 ele1.sendKeys("test@gmail.com");
	 
	 //password
	 WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(5));
	 wait2.until(ExpectedConditions.visibilityOfElementLocated(passEle)).sendKeys("test1123");
	 
	 //button
	 WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(5));
	 wait3.until(ExpectedConditions.elementToBeClickable(btnEle)).click();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	  
	  
	  
	  
	  
	  
  }
}
