package com.TestNGFramework.Listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class RetryAnalyzer implements IRetryAnalyzer
{

	int count=0;
	int limit=3;//3 time run if test fail
	public boolean retry(ITestResult result)
	{
		
		if(count<limit)
		{
			count++;
			return true;//test fail
		}
		return false;//test pass
	}
  

}
