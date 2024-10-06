package com.TestNGFramework;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class AnnotationsInTestNG {
  @Test(priority=1)
  public void registerTest() 
  {
	  System.out.println("This is Register test case 1");
  }
  
  @Test(priority=2)
  public void loginTest() 
  {
	  System.out.println("This is login test case 2");
  }
  
  @Test(priority=3)
  public void searchTest() 
  {
	  System.out.println("This is Search test case 3");
  }
  
  
  //Annotation
  @BeforeMethod
  public void bmethod()
  {
	  System.out.println("BeforeMethod run before every test case");
  }
  
  @AfterMethod
  public void amethod()
  {
	  System.out.println("Aftermethod run after every test case");
  }
  
  @BeforeClass
  public void bclass()
  {
	  System.out.println("BeforeClass run only  before  first test case!");
  }
  
  @AfterClass
  public void aclass()
  {
	  System.out.println("AfterClass run only after  last test case!");
  }
  
  @BeforeTest
  public void btest()
  {
	  System.out.println("BeforeTest run before class");
  }
  
  @AfterTest
  public void atest()
  {
	  System.out.println("AfterTest run after class");
  }
  
  
  @BeforeSuite
  public void bsuite()
  {
	  System.out.println("Before suite will run before test!");
	  
  }
  
  
  @AfterSuite
  public void asuite()
  {
	  System.out.println("After suite will run after test!");
	  
  }
}

