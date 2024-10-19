package com.MouseInteraction;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class RightclickAction {
  @Test
  public void testRightclick() throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	  
	  WebElement eleBtn=driver.findElement(By.xpath("//span[text()='right click me']"));
	  
	  //Actions is class
	  Actions act=new Actions(driver);
	  act.contextClick(eleBtn).perform();
	  Utility.getScreenshot(driver,"RightclickAction");
	  
	  List<WebElement> list=driver.findElements(By.xpath("(//ul)[3]//li//span"));
	  
	  for(WebElement i:list)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("Delete"))
		  {
			  i.click();
			  break;
		  }
	  }
	  
	  //alert will open
	  Thread.sleep(2000);
	  
	  //alert handling
	  Alert alt=driver.switchTo().alert();
	  System.out.println("Alert text is: "+alt.getText());
	  
	  alt.accept();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
