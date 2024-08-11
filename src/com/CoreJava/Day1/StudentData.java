package com.CoreJava.Day1;

public class StudentData 
{
	//data
	int id;
	String name;
		
	//method
	public void show()
	{
		System.out.println("Student id is: "+id);
		System.out.println("Student name is:"+ name);
	}
	
	public static void main(String args[])
	{
		/*
		 * To access any class members we need to create object
		 * Object is instance of a class
		 * 
		 * new keyword used to create object
		 * 
		 * Syntax:
		 * --------
		 * classname refvariablename=new className();
		 * 
		 * className()= constructor
		 * constructor helps to intialize object
		 * 
		 */
		
		StudentData s1=new StudentData();
		//s1.show();
		s1.id=101;
		s1.name="Jay";
		s1.show();
		
		StudentData s2=new StudentData();
		s2.id=102;
		s2.name="Abhi";
		s2.show();
		
		
		
		
		
		
		
		
	}
	
	
	

}
