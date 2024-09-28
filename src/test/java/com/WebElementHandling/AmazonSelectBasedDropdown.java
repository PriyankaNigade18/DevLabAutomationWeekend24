package com.WebElementHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class AmazonSelectBasedDropdown {
  @Test
  public void testDropDown() throws InterruptedException
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in");
	  
	  //dropdown address
	  WebElement dropdown=driver.findElement(By.name("url"));
	  
	  Utility.selectBasedDropDown(dropdown,"Books");
	  
	  
	  
	  /*
	  //select class for <select> tag
	  Select dd=new Select(dropdown);
	  
	  System.out.println("Is dropdown support multiple selection?: "+dd.isMultiple());
	  
	  //single selection
	  dd.selectByIndex(3);
	  Thread.sleep(2000);
	  
	  dd.selectByValue("search-alias=stripbooks");
	  Thread.sleep(2000);
	  
	  dd.selectByVisibleText("Jewellery");
	  
	  //to get all options
	  List<WebElement> allOptions=dd.getOptions();
	  System.out.println("Total Options are: "+allOptions.size());
	  
	  for(WebElement i:allOptions)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("Video Games"))
		  {
			  i.click();
			  break;
		  }
	  }
	  
	  */
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
