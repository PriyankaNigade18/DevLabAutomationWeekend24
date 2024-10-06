package com.TestNGFramework;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class GroupingScenario {
  @Test(priority=1,groups = "SmokeTest")
  public void testSetupForBrowser()
  {
	  System.out.println("This is for browser setup");
  }
  
  
  @Test(priority=2,groups = "SmokeTest")
  public void testForApplicationLaunch()
  {
	  System.out.println("This is for application launch");
  }
  
  @Test(priority=3,groups = "FunctionalTest",dependsOnGroups = "SmokeTest")
  public void testForLogin()
  {
	  System.out.println("This is login test");
  }
  @Test(priority=4,groups = "FunctionalTest")
  public void testForLogout()
  {
	  System.out.println("This is for logout test");
  }
  
}
