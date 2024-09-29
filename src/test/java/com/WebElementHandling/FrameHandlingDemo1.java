package com.WebElementHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameHandlingDemo1 {
  @Test
  public void testFrame() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://ui.vision/demo/webtest/frames/");
	  
	  //frame1- indexing
	  driver.switchTo().frame(0);
	    
	  driver.findElement(By.name("mytext1")).sendKeys("First Frame!");
	  
	  //main document
	  driver.switchTo().defaultContent();
	  
	  //frame2- webElement
	  WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
	  driver.switchTo().frame(frame2);
	  
	  driver.findElement(By.name("mytext2")).sendKeys("Second Frame!");
	  
	  //main document
	  driver.switchTo().defaultContent();
	  
	  //frame3-nested scenario
	  
	  WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	  driver.switchTo().frame(frame3);
	  
	  //input box
	  driver.findElement(By.name("mytext3")).sendKeys("Third Frame!");
	  
	  
	  //inner frame
	  WebElement innerframe=driver.findElement(By.tagName("iframe"));
	  driver.switchTo().frame(innerframe);
	  
	  //radio button
	  driver.findElement(By.id("i8")).click();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
