package com.TestNGFramework.Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class TestListener implements ITestListener
{
  
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test Started...."+result.getMethod());
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test Success: "+result.getName());
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test Failure: "+result.getName());

	}
	
	public void onTestSkip(ITestResult result)
	{
		System.out.println("Test Skip: "+result.getMethod());
	}
	

}
