package com.SwagLabs.TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SwagLabs.BaseClass.BaseTest;

public class LoginPageTest extends BaseTest
{
  @Test(priority=1)
  public void validateUrl() 
  {
	  String actUrl=lp.getAppUrl();
	  AssertJUnit.assertTrue(actUrl.contains("demo"));
	  System.out.println("Url matched: "+actUrl);
  }
  
  @Test(priority=2)
  public void validateTitle() 
  {
	  String actTitle=lp.getAppTitle();
	  AssertJUnit.assertTrue(actTitle.contains("Labs"));
	  System.out.println("Title matched: "+actTitle);
  }
  
  @Test(priority=3)
  public void validateLogin()
  {
	  lp.doLogin(prop.getData("un"),prop.getData("psw"));
	  AssertJUnit.assertTrue(lp.getAppUrl().contains("inventory"));
	  System.out.println("Login completed!");
	  
	  
  }
}
