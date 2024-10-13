package com.TestNGFramework.TestDataFromExternalFile;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDataFromXmlfile
{
	@Parameters({"un","psw"})
  @Test
  public void loginTest(String un,String psw) 
  {
	  System.out.println("UserName is : "+un);
	  System.out.println("Password is: "+psw);
  }
}
