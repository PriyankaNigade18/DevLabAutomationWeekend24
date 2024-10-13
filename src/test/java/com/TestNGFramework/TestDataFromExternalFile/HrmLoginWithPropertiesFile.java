package com.TestNGFramework.TestDataFromExternalFile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Generic.PropertiesFile;

public class HrmLoginWithPropertiesFile {
  @Test
  public void hrmLogin()
  {
	  PropertiesFile prop=new PropertiesFile();
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get(prop.getData("url"));
	  
	  driver.findElement(By.name("username")).sendKeys(prop.getData("un"));
	  driver.findElement(By.name("password")).sendKeys(prop.getData("psw"));
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  
	  Assert.assertTrue(driver.getCurrentUrl().contains(prop.getData("expUrl")));
	  System.out.println("Login done!");
  }
}
