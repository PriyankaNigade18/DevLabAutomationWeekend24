package com.CoreJava.ExceptionHandling;

import java.io.IOException;

public class CompileTimeExecption {

	public static void main(String[] args) throws InterruptedException,IOException 
	{

		System.out.println("Execution started......");
//		try {
//		Thread.sleep(4000);
//		}catch(InterruptedException i)
//		{
//			i.printStackTrace();
//		}
		Thread.sleep(2000);
		System.out.println("Execution ends......");
		
		System.in.read();
		
	}

}
