package com.JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestScrenarionOnJavascript {
  @Test
  public void testJs() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in");
	  
	  //how to get the title
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  String title=js.executeScript("return document.title").toString();
	  System.out.println("title is: "+title);
	  
	  driver.findElement(By.linkText("Best Sellers")).click();
	  
	  //how to refresh the page
	  js.executeScript("history.go(0)");
	  System.out.println("Page refreshed!");
	  
	  
	  //how to interact with element using js
	  WebElement ele=driver.findElement(By.linkText("Mobiles"));
	  js.executeScript("arguments[0].click()",ele);
	  
	  
  }
}
