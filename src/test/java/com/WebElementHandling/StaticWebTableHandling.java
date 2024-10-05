package com.WebElementHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StaticWebTableHandling {
  @Test
  public void testTable()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  System.out.println("************All Headings***************");
	  List<WebElement> headings=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr[1]//th"));
	  for(WebElement i:headings)
	  {
		  System.out.println(i.getText());
	  }
	  
	  System.out.println("************Number of Rows***************");
	  int size=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr")).size();
	  System.out.println("Including heading total rows are: "+size);//7
	  System.out.println("Excluding headings total rows are: "+(size-1));//6
	  
	  System.out.println("************Number of Columns***************");

	  int cell=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr[2]//td")).size();
	  System.out.println("Total Columns are: "+cell);//4
	  System.out.println("************Specific row***************");
	  //5th row records
	  List<WebElement> row5=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr[5]//td"));

	  for(WebElement i:row5)
	  {
		System.out.print(i.getText()+"  ");  
	  }
	  
	  System.out.println();
	  System.out.println("************Specific Column data***************");
	  List<WebElement> cells=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//td[2]"));
	  
	  for(WebElement i:cells)
	  {
		  System.out.println(i.getText());
	  }
	  
	  
	  
  }
}
