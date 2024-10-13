package com.TestNGFramework.PageObjectUsingPageFactory;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartLoginPageTest  extends BaseClass
{
  @Test(priority=1)
  public void validateUrl() 
  {
	 String actUrl=lp.getAppUrl();
	 Assert.assertTrue(actUrl.contains("account"));
	 System.out.println("Url matched: "+actUrl);
	  
  }
  
  @Test(priority=2)
  public void validateTitle() 
  {
	 String actTitle=lp.getAppTitle();
	 Assert.assertTrue(actTitle.contains("Login"));
	 System.out.println("Title matched: "+actTitle);
	  
  }
  
  @Test(priority=3)
  public void validateLogin()
  {
	  lp.doLogin("sumit11@gmail.com","test123");
	  Assert.assertTrue(lp.getAppUrl().contains("account"));
	  System.out.println("Login Done");
  }
}
