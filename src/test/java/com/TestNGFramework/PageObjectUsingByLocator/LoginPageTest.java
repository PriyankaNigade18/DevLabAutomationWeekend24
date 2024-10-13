package com.TestNGFramework.PageObjectUsingByLocator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest
{
  @Test(priority=1)
  public void validateUrl() 
  {
	  //LoginPage lp=new LoginPage();
	  String actUrl=lp.getAppUrl();
	  Assert.assertTrue(actUrl.contains("login"),"Test Fail: Url not matched!");
	  System.out.println("Test Pass: Url matched!");
  }
  
  @Test(priority=2)
  public void validateTitle() 
  {
	  String actTitle=lp.getAppTitle();
	  Assert.assertTrue(actTitle.contains("Login"),"Test Fail: As title not matched!");
	  System.out.println("Test Pass: Title matched!");
  }
  
  
  @Test(priority=3)
  public void validateLogin() 
  {
	  lp.enterEmail("test@gmail.com");
	  lp.enterPassword("test123");
	  lp.clickOnSubmit();
	  
	  Assert.assertTrue(lp.getAppUrl().contains("customers"),"Login Fail");
	  System.out.println("Login Done!");
	  
	  //lp.doLogin("test@gmail.com","test123");
  }
}
