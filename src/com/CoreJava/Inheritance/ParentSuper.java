package com.CoreJava.Inheritance;

public class ParentSuper
{

	int pid=101;
	
	public void parentIncome()
	{
		System.out.println("Parent income is 11$");
	}
		
	public ParentSuper()
	{
		System.out.println("Parent constructor is calling!");
	}
	
	public ParentSuper(int id)
	{
		System.out.println("Parent constructor is calling with id!"+id);
	}
}

