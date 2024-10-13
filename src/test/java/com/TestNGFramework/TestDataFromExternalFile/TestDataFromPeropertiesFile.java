package com.TestNGFramework.TestDataFromExternalFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.Generic.PropertiesFile;

public class TestDataFromPeropertiesFile {
  @Test
  public void testData() throws IOException
  {
	  //File path
//	  File f1=new File(System.getProperty("user.dir")+"//ConfigData//config.properties");
//	  FileInputStream fs=new FileInputStream(f1);
//	  Properties p1=new Properties();
//	  p1.load(fs);
//	  System.out.println("User name is: "+p1.getProperty("un"));
//	  System.out.println("Password is: "+p1.getProperty("psw"));
	    
	  PropertiesFile p1=new PropertiesFile();
	  System.out.println("User name is: "+p1.getData("un"));
	  System.out.println("Password is: "+p1.getData("psw"));
  }
}
