package com.WebElementHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertHandlingDemo2_Types {
  @Test
  public void testAlerts() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	  
	  //alert1
	  driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	  //alert will open
	  Thread.sleep(1500);
	  
	  Alert alt1=driver.switchTo().alert();
	  System.out.println("Alert1 text is: "+alt1.getText());
	  alt1.accept();
	  
	  WebElement result=driver.findElement(By.id("result"));
	  System.out.println("Alert1 result is: "+result.getText());
	  
	  //alert2- confirmation alert
	  driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	  
	  //alert will open
	  Thread.sleep(1500);
	  
	  Alert alt2=driver.switchTo().alert();
	  System.out.println("Alert2 text is: "+alt2.getText());
	  alt2.dismiss();
	  System.out.println("Alert2 result is: "+result.getText());
	  
	  //alert3- prompt alert
	  driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	  //alert will open
	  Thread.sleep(1500);
	  
	  
	  Alert alt3=driver.switchTo().alert();	 
	  
	 System.out.println("Alert3 text is: "+alt3.getText());
	 alt3.sendKeys("Hello All");
	 alt3.accept();
	 
	 System.out.println("Alert3 result is: "+result.getText());
	 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
