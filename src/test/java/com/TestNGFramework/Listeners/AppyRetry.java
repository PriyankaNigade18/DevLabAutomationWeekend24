package com.TestNGFramework.Listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppyRetry 
{
  @Test(retryAnalyzer = com.TestNGFramework.Listeners.RetryAnalyzer.class)
  public void testCase1()
  {
	  System.out.println("TestCase 1 is executing!");
	  Assert.assertEquals(true,true);
  }
  
  
  @Test(retryAnalyzer = com.TestNGFramework.Listeners.RetryAnalyzer.class)
  public void testCase2()
  {
	  System.out.println("TestCase 2 is executing!");
	  Assert.assertEquals(false,true);
  }
}
