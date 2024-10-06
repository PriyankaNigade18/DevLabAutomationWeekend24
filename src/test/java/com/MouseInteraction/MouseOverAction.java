package com.MouseInteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOverAction {
  @Test
  public void testMouseOver() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_onmouseover");
	  
	  //frame
	  driver.switchTo().frame("iframeResult");
	  
	  //ele
	  WebElement ele=driver.findElement(By.xpath("//img[@alt='Smiley']"));
	  
	  
	  Actions act=new Actions(driver);
	  act.moveToElement(ele).perform();
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
