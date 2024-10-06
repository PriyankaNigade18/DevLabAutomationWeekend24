package com.MouseInteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ResizeAction {
  @Test
  public void testResize()
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/resizable/");
	  
	  driver.switchTo().frame(0);
	  
	  WebElement ele=driver.findElement(By.className("ui-icon"));
	  
	  Actions act=new Actions(driver);
	  act.moveToElement(ele).dragAndDropBy(ele,100,50).build().perform();
	  
	  
	  
	  
	  
	  
  }
}
