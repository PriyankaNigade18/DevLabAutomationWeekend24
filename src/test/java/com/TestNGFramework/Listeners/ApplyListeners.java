package com.TestNGFramework.Listeners;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(com.TestNGFramework.Listeners.TestListener.class)
public class ApplyListeners 
{
  @Test
  public void testCase1() 
  {
	  System.out.println("Test Case 1 is runnig");
	  AssertJUnit.assertEquals(true,true);//pass
  }
  
  @Test(dependsOnMethods = "testCase1")
  public void testCase2() 
  {
	  System.out.println("Test Case 2 is runnig");
	  AssertJUnit.assertEquals(true,false);//fail
  }
  
  @Test(dependsOnMethods = "testCase2")
  public void testCase3() 
  {
	  System.out.println("Test Case 3 is runnig");
	  AssertJUnit.assertEquals(true,true);//skip
	  
  }
}
