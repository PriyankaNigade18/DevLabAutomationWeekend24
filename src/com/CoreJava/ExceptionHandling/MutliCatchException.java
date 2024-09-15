package com.CoreJava.ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MutliCatchException {

	public static void main(String[] args) throws IOException 
	{

		//File path to read
		File f1=new File(System.getProperty("user.dir")+"//config.properties");
				
		//To read data in stream -FileInputStream
		
		FileInputStream fs=new FileInputStream(f1);
		
		//Properties class --->load the file
		Properties p1=new Properties();
		p1.load(fs);
		
		//read the file content using key
				System.out.println("BrowserName is:"+p1.getProperty("browsername"));
				
				System.out.println("Os name is: "+p1.getProperty("os"));
		
//		try {
//			FileInputStream fs=new FileInputStream(f1);
//			p1.load(fs);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
			
		


	}

}
