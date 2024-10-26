package com.SwagLabs.BaseClass;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.SwagLabs.Pages.*;
import com.SwagLabs.Utility.PropertiesFile;

public class BaseTest
{
	public WebDriver driver;
	public PropertiesFile prop;
	public LoginPage lp;
	public InventoryPage ip;
	public CartPage cp;
	public CheckOutPage ch;
	public OverViewPage op;
	
	
	
	@BeforeSuite
	public void projectSetup()
	{
		
	}
	
	@BeforeTest
	public void browserSetUp()
	{
		
		prop=new PropertiesFile();
		driver=new ChromeDriver();
		driver.get(prop.getData("url"));
		lp=new LoginPage(driver);
		ip=new InventoryPage(driver);
		cp=new CartPage(driver);
		ch=new CheckOutPage(driver);
		op=new OverViewPage(driver);
		
		
	}
	
	public void addWait()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public  String captureScreen(String tname)
	{
	String timestamp=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	 TakesScreenshot ts=(TakesScreenshot)driver;
	 File source=ts.getScreenshotAs(OutputType.FILE);
	String targetFilePath=System.getProperty("user.dir")+"\\Screenshots\\"+tname+"_"+timestamp+".png";
	File targetFile=new File(targetFilePath);
	source.renameTo(targetFile);
	return targetFilePath;
		
	}


}
