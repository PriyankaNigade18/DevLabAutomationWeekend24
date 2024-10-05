package com.JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class JavaScriptScroll {
  @Test
  public void testScroll() throws InterruptedException
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in");
	  
	  Utility.scrollDown(driver);
	  
	  Thread.sleep(3000);
	  
	  Utility.scrollUp(driver);
	  
	  Thread.sleep(3000);
	  //scroll up to the element
	  WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'Deals on smartphones')]"));
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  js.executeScript("arguments[0].scrollIntoView(true);",ele);
	  
	  
	  /*
	//scroll down
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  //js.executeScript("window.scrollTo(0,3000)");
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  
	  Thread.sleep(2000);
	  
	  //scroll up
	  js.executeScript("window.scrollTo(document.body.scrollHeigth,0)");
	  */
	  
	  
	  
  }
}
