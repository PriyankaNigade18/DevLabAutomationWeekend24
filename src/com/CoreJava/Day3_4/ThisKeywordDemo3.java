package com.CoreJava.Day3_4;

public class ThisKeywordDemo3 {

	/*
	 * this keyword used to refer current class instance variable and instance method
	 * 1.this can help to differntiate between instance and local variable
	 * 2.this can help to invoke any method
	 * 3.this can help to invoke any constructor-this()
	 */
	
	ThisKeywordDemo3()
	{	
		//this("Welcome!");
		System.out.println("Default constructor is calling!");
		
	}
	
	ThisKeywordDemo3(String data)
	{
		this();
		System.out.println("Parameterized constructor calling: "+data);
	}
	
	public void test()
	{
		System.out.println("This is test");
	}
	public static void main(String[] args) 
	{

		ThisKeywordDemo3 t1=new ThisKeywordDemo3("Hi");
		
		//ThisKeywordDemo3 t2=new ThisKeywordDemo3("Hello All");
		
		t1.test();

	}

}
