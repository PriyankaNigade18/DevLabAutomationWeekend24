package com.CoreJava.Day1;

public class MethodDemo 
{
	public void accept()
	{
		System.out.println("Instance method calling......");
	}
	
	public static void display()
	{
		System.out.println("Static method calling.....");
	}
	
	public static void main(String[] args)
	{

		display();
		MethodDemo.display();
		
		MethodDemo m1=new MethodDemo();
		m1.accept();
		
		/*
		 * The static method display() from the type
		 *  MethodDemo should be accessed in a static way
		 */
		//m1.display();



	}

}
