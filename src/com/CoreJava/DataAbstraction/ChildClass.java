package com.CoreJava.DataAbstraction;

public class ChildClass extends TestAbstract
{
	public void test()
	{
		System.out.println("child....test()");
	}

	@Override
	public void display() {
		System.out.println("Child....Updated method");
		
	}
	public static void main(String[] args) 
	{
		//System.out.println("parent ref and parent object-Invalid");
		//TestAbstract a1=new TestAbstract();
		
		System.out.println("child class ref and child class Object");
		ChildClass c1=new ChildClass();
		c1.accept();//inherited
		c1.test();//individual
		c1.display();//inherited abstract method
		
		System.out.println("Parent class ref and child class Object");
		TestAbstract t1=new ChildClass();
		t1.accept();
		t1.display();//overrided method
		
		
		
	}

	

}
