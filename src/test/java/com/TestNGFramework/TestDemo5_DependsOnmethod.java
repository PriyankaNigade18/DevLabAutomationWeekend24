package com.TestNGFramework;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo5_DependsOnmethod
{
  @Test(priority=1)
  public void registerTest()
  {
	System.out.println("User will register!");  
	AssertJUnit.assertEquals(true,false);
  }
  
  
  @Test(priority=2,dependsOnMethods = "registerTest")
  public void loginTest()
  {
	System.out.println("User will login!");  
  }
}
