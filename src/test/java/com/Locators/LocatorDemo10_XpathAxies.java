package com.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo10_XpathAxies {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/customers.html?email-name=test%40gmail.com&password-name=dasdas&submit-name=");
		
		System.out.println("****Identify Ancestor node for John*****");
		String tagname=driver.findElement(By.xpath("//td[text()='John']//ancestor::tbody")).getTagName();
		System.out.println("Ancestor node tagname is: "+tagname);//tbody
		
		System.out.println("****Identify parent node for John*****");
		String ptagname=driver.findElement(By.xpath("//td[text()='John']//parent::tr")).getTagName();
		System.out.println("Parent node tag name is: "+ptagname);//tr
		
		System.out.println("****Identify all child nodes for 4th row****");
		List<WebElement> list1=driver.findElements(By.xpath("//tbody//tr[4]//child::td"));
		System.out.println("Total Childs for row 4 are: "+list1.size());
		
		for(WebElement i:list1)
		{
			System.out.println(i.getText());
		}
		
		System.out.println("****Identify all following node for John*****");
		int fnode=driver.findElements(By.xpath("//td[text()='John']//following::td")).size();
		System.out.println("Total following nodes for John are: "+fnode);//13
		
		System.out.println("****Identify all preceding node for John*****");
		int pnode=driver.findElements(By.xpath("//td[text()='John']//preceding::td")).size();
		System.out.println("Total following nodes for John are: "+pnode);//16
		
		System.out.println("****Identify all following-siblings node for John*****");
		int fscount=driver.findElements(By.xpath("//td[text()='John']//following-sibling::td")).size();
		System.out.println("Total following siblings for John are: "+fscount);//3
		
		
		System.out.println("****Identify all following-siblings node for John*****");
		int pscount=driver.findElements(By.xpath("//td[text()='John']//preceding-sibling::td")).size();
		System.out.println("Total preceding siblings for John are: "+pscount);//3
		

	}

}
