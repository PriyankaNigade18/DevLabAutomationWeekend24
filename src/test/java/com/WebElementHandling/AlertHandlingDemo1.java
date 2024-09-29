package com.WebElementHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertHandlingDemo1 {
  @Test
  public void testAlert() 
  {
	  
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  
	  //signin
	  driver.findElement(By.name("proceed")).click();
	  /*
	   * UnhandledAlertException: unexpected alert open:
	   *  {Alert text : Please enter a valid user name}
	   */
	  
	  Alert alt1=driver.switchTo().alert();
	  System.out.println("Alert text is: "+alt1.getText());
	  alt1.accept();
	    
	  //username
	  driver.findElement(By.id("login1")).sendKeys("Priyanka");
	  
	  
	  
	  
	  
	  
	  
  }
}
