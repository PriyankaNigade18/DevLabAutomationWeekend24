package com.CoreJava.Day1;

public class HelloTest {

	
	
	public static void main(String args[])
	{
		System.out.println("Hello");
		
		
		MethodDemo.display();
		
		MethodDemo m1=new MethodDemo();
		m1.accept();
		
		StudentData s7=new StudentData();
		s7.show();
		s7.id=6666;
		s7.show();
	}
	
	
}
