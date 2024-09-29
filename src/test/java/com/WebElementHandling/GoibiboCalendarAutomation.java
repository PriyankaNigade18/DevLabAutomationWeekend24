package com.WebElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoibiboCalendarAutomation {
  @Test
  public void testCalendar() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.goibibo.com/flights/");
	  driver.manage().window().maximize();
	  
	  //close the popup
	  driver.findElement(By.xpath("//span[contains(@class,'icClose')]")).click();
	  
	//Expectation
	  String date="6";
	  String month="April";
	  String year="2025";
	  
	  
	  //open calendar
	  driver.findElement(By.xpath("(//span[contains(@class,'DownArrow')])[1]")).click();
	  
	  //month selection
	  while(true)
	  {
	  //get the current month
	  String datetext=driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
	  //System.out.println(datetext);
	  String currentmonth=datetext.split(" ")[0];
	  String currentyear=datetext.split(" ")[1];
	  //System.out.println("Current month is: "+currentmonth);
	  //System.out.println("Current year is: "+currentyear);
	//compare current month till expected
	  
	  if(currentmonth.contains(month) && currentyear.contains(year))
	  {
		  //if month matched then select date
		  break;
	  }else
	  {
		  //if month not match then click on arrow
		  driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		  
	  }
	  }
	  
	  //date selection
	  List<WebElement> allDates=driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[1]//div[@class='DayPicker-Day']"));
	  
	  for(WebElement i:allDates)
	  {
		  if(i.getText().contains(date))
		  {
			  i.click();
			  break;
		  }
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
