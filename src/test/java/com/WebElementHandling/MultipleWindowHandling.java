package com.WebElementHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindowHandling {
  @Test
  public void testWindows()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  //home
	  String parentId=driver.getWindowHandle();
	  System.out.println(parentId);
	  
	  driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	  
	  //child
	  Set<String> allWindowId=driver.getWindowHandles();
	  System.out.println(allWindowId);
	  
	  //driver switch to child
	  for(String childId:allWindowId)
	  {
		  if(!parentId.equals(childId))
		  {
			  //when both ids are different
			  driver.switchTo().window(childId);
			//email id
			 driver.findElement(By.name("EmailHomePage")).sendKeys("test@gmail.com");
			 //driver.close();//close current active window
			 //driver.quit();//close all windows by selenium
			 /*
			  * NoSuchSessionException: Session ID is null.
			  */
		  }
		  
	  }
	  
	  //parent window
	  driver.switchTo().window(parentId);
	  driver.findElement(By.name("username")).sendKeys("priyanka");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
