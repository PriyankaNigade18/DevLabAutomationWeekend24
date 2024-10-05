package com.WebElementHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PaginationWebTableHandling {
  @Test
  public void testDynamicTable()
  {
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  System.out.println("*********Total Pages from the table***********");
	  
	  List<WebElement> pages=driver.findElements(By.xpath("//ul[@id='pagination']//li//a"));
	  System.out.println("Total Pages are: "+pages.size());
	  
	  System.out.println("********Get the headings*************");
	  List<WebElement> headings=driver.findElements(By.xpath("//table[@id='productTable']//thead//tr//th"));
	  for(WebElement i:headings)
	  {
		  System.out.println(i.getText());
	  }
	  
	  System.out.println("********Number of rows*************");
	  int rowCount=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
	  System.out.println("Total Rows are: "+rowCount);
	  
	  System.out.println("********Number of columns*************");
	  int cellCount=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr[1]//td")).size();
	  System.out.println("Total Columns are: "+cellCount);
	  
	  System.out.println("***************Get the all page data**************");
	  
	  for(WebElement i:pages)
	  {
		  System.out.println("Page number: "+i.getText());
		  i.click();//to open that page
		  //to get the page data
		  List<WebElement> pageData=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr//td"));
		  for(WebElement j:pageData)
		  {
			  System.out.println(j.getText());
		  }
		  
		  
		  
	  }
	  
	  System.out.println("***************Get the 4th number page and select all checkboxes************");

	  //iterate all pages
	  for(WebElement i:pages)
	  {
		  if(i.getText().contains("4"))
		  {
			  i.click();//open the page
			  //select all the checkboxes
			 List<WebElement> allCheckboxes=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr//td[4]//input"));
			 
			 	for(WebElement j:allCheckboxes)
			 	{
			 		j.click();
			 	}
			 
			 
			 
			 
		  }
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
