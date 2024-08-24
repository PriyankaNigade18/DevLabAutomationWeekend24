package com.CoreJava.Day3_4;

public class Calculator
{
	
	public int add(int a,int b)
	{
		return a+b;
	}
	
	public int sub(int a,int b)
	{
		return a-b;
	}
	public int mul(int a,int b)
	{
		return a*b;
	}
	public int div(int a,int b)
	{
		return a/b;
	}
	
	
	public static void main(String[] args) 
	{
		Calculator c1=new Calculator();
		int res1=c1.add(110,200);
		System.out.println("Addition is: "+res1);
		
		int res2=c1.sub(100,20);
		System.out.println("Subtraction is: "+res2);
		
		int res3=c1.mul(10,10);
		System.out.println("Multiplication is: "+res3);
				
		int res4=c1.div(100,20);
		System.out.println("Division is: "+res4);
		
		System.out.println("Addition is: "+c1.add(100,100));
		

	}

}
