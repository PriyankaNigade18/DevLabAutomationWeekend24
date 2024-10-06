package com.Capabilities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HeadlessTest {
  @Test
  public void testHeadless()
  {
	  //129-->bug
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("--headless=old");
	  
	  System.out.println("creating driver session.....");
	  WebDriver driver=new ChromeDriver(options);
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  System.out.println("driver session created!.....");

	  driver.get("https://www.google.com");
	  System.out.println("Application open!....");

	  driver.findElement(By.name("q")).sendKeys("TestNG");
	  
	  System.out.println("Search for testng!.....");

	  List<WebElement> list=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
	  
	  System.out.println("Total Options are: "+list.size());
	  
	  System.out.println("List of Options are:");
	  for(WebElement i:list)
	  {
		  System.out.println(i.getText());
	  }
  }
}
