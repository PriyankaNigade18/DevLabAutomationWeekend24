package com.TestNGFramework;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class AsserssionTest {
  @Test
  public void hardAssertTest() 
  {
	  
	  String act="Selenium WebDriver is webui automation library.";
	  String exp="Selenium WebDriver is webui automation library/tool";
	  /*
	   * When Asserssion will fail the  we will get Assertion error
	   */
//	  Assert.assertEquals(act,exp,"Test Fail: Strings are not equal");
//	  System.out.println("Test Pass:Strings are equal!");
//	  
//	  Assert.assertTrue(act.contains("Selenium"),"Test Fail: As Selenium not found");
//	  System.out.println("Test Pass: As Selenium found!");
	  
	  Assert.assertFalse(act.contains("Testng"),"Test Fail: If Testng Found");
	  System.out.println("Test Pass: If TestNg will not found");
	  
  }
  
  
  @Test
  public void softAssertionTest()
  {
	  
	  int a=100,b=200;
	  SoftAssert sf=new SoftAssert();
	  sf.assertEquals(a,b,"Test Fail: As numbers are not equal");
	  System.out.println("Test Pass: As numbers are equal");
	  sf.assertAll();
	  
	  
	  
	  
	  
	  
  }
}
