package com.WebElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FacebookDropdownAutomation
{
	public static void selectBasedDropDown(WebElement ele,String value)
	{
		Select dd=new Select(ele);
		  System.out.println("Is multiple selection allowed?: "+dd.isMultiple());
		  
		  List<WebElement> allOptions=dd.getOptions();
		  System.out.println("Total Options are: "+allOptions.size());
		  
		  for(WebElement i:allOptions)
		  {
			  System.out.println(i.getText());
			  if(i.getText().contains(value))
			  {
				  i.click();
				  break;
			  }
		  }
	}
	
	
	
  @Test
  public void testDropdown() 
  
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.facebook.com");
	  
	  //create new account page
	  driver.findElement(By.linkText("Create new account")).click();
	  
	  //day
	  WebElement ele1=driver.findElement(By.id("day"));
	  selectBasedDropDown(ele1,"29");
	  
	  //month
	  WebElement ele2=driver.findElement(By.id("month"));
	  selectBasedDropDown(ele2,"Nov");
	  
	  //year
	  WebElement ele3=driver.findElement(By.id("year"));
	  selectBasedDropDown(ele3,"2010");
	  
	  
	  
//	  Select daydd=new Select(ele1);
//	  System.out.println("Is multiple selection allowed?: "+daydd.isMultiple());
//	  
//	  List<WebElement> allOptions=daydd.getOptions();
//	  System.out.println("Total Options are: "+allOptions.size());
//	  
//	  for(WebElement i:allOptions)
//	  {
//		  System.out.println(i.getText());
//		  if(i.getText().contains("29"))
//		  {
//			  i.click();
//			  break;
//		  }
//	  }
	  
	 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  //year
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
