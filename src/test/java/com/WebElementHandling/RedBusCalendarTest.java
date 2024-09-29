package com.WebElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RedBusCalendarTest {
  @Test
  public void testCalendar() 
  {
	  WebDriver driver=new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.redbus.in/");
	  //Expectation
	  String date="6";
	  String month="Apr";
	  String year="2025";
	  
	  
	  //open calendar
	  driver.findElement(By.xpath("//span[text()='Date']")).click();
	  
	  //month selection
	  while(true)
	  {
	  //get the current month
	  String datetext=driver.findElement(By.xpath("(//div[contains(@class,'DayNavigator__')])[3]")).getText();
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
		  driver.findElement(By.xpath("(//div[contains(@class,'DayNavigator__')])[4]")).click();
		  
	  }
	  }
	  
	  //date selection
	  List<WebElement> allDates=driver.findElements(By.xpath("//div[contains(@class,'DayTilesWrapper')]//span[contains(@class,'DayTiles__CalendarDays')]"));
	  
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
