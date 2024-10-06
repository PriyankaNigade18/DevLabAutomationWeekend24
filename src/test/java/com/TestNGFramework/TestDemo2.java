package com.TestNGFramework;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo2 
{
  @Test(priority=1,description="Test Case 1")
  public void registerTest() 
  {
	  System.out.println("User will register first!");
  }
  
  @Test(priority=2,description="Test Case 2",invocationCount=3)
  public void loginTest() 
  {
	  System.out.println("After registration user will login!");
  }
  
  @Test(priority=3,description="Test Case 3")
  public void searchProductTest() 
  {
	  System.out.println("User will search for product");
  }
  
  @Test(priority=4,description="Test Case 4")
  public void addToCartTest() 
  {
	  System.out.println("User will add product to the cart");
  }
}
