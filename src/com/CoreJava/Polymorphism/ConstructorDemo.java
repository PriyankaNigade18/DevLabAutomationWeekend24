package com.CoreJava.Polymorphism;

public class ConstructorDemo 
{
	
	public ConstructorDemo()
	{
		System.out.println("This is default constructor");
	}

	public ConstructorDemo(int id)
	{
		System.out.println("This is parameterized constructor calling: "+id);
	}
	
	public ConstructorDemo( String name)
	{
		System.out.println("This is parameterized constructor calling: "+name);
	}
	
	public ConstructorDemo(int id,String name)
	{
		System.out.println("This is parameterized constructor calling: "+id+" "+name);
	}
	
	public ConstructorDemo(String name,int id)
	{
		System.out.println("This is parameterized constructor calling: "+id+" "+name);
	}
	public static void main(String[] args)
	{
		ConstructorDemo c1=new ConstructorDemo();
		
		ConstructorDemo c2=new ConstructorDemo("Pooja");

	}

}
