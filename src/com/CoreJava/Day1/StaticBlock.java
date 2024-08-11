package com.CoreJava.Day1;

public class StaticBlock 
{
	static int x;
	public void show()
	{
		System.out.println("Show() is calling....!");
	}
	
	//static block
	static
	{
		x=90;
	System.out.println("Static block is calling.....!");
	System.out.println("x value: "+x);
	}

	public static void main(String[] args) 
	{
		System.out.println("Main() is calling.....!");
		StaticBlock s1=new StaticBlock();
		s1.show();
		
	}

}
