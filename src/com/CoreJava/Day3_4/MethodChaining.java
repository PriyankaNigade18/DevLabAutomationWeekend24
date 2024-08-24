package com.CoreJava.Day3_4;

public class MethodChaining 
{
	public void initSession()
	{
		System.out.println("Sesson Initialized!");
		initApplication();
	}

	
	public void initApplication()
	{
		System.out.println("Application started!");
		tearDownSession();
	}
	
	public void tearDownSession()
	{
		System.out.println("Sesson closed!");
		//initSession();
	}
	
	
	public static void main(String[] args)
	{

		MethodChaining m1=new MethodChaining();
		m1.initSession();

	}

}
