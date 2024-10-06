package com.TestNGFramework;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo3_DisableTest
{
  @Test(priority=1)
  public void interviewProcess()
  {
	  System.out.println("Employee Interview process is completed!");
  }
  
  @Test(priority=2)
  public void documentSubmissionProcess()
  {
	  System.out.println("Employee Document Submission process is completed!");
  }
  
  @Test(priority=3)
  public void OnboardingProcess()
  {
	  System.out.println("Employee Onbording process is completed!");
  }
  
  //ignore test case 4 using argument
  @Test(priority=4,enabled=false)
  public void kTProcess()
  {
	  System.out.println("Employee KT process is completed!");
  }
  
  @Test(priority=5)
  public void projectAssignProcess()
  {
	  System.out.println("Employee Project Assignment process is completed!");
  }
  
  
  
}
