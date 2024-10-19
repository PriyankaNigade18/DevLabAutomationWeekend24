package com.TestNGFramework.DataDrivenTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DatadrivenTestDemo1
{
//	@DataProvider(name="TestData")
//	public Object[][] testData()
//	{
//		Object data[][]= {{"Kiran","test123"},{"Sagar","test123"},{"Rushi","test123"}};
//		return data;
//	}
	
	
	
  @Test(dataProvider="TestData",dataProviderClass = CustomData.class)
  public void testCase(String un,String psw) 
  {
	  System.out.println("UserName is:  "+un);
	  System.out.println("Password is: "+psw);
  }
}
