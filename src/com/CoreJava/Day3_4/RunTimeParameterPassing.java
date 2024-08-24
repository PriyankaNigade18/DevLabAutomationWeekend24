package com.CoreJava.Day3_4;

import java.util.Scanner;

public class RunTimeParameterPassing
{
	public int add(int a,int b)
	{
		//System.out.println("Addition is: "+(a+b));
		return a+b;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();	
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		
		RunTimeParameterPassing r1=new RunTimeParameterPassing();
		int res=r1.add(num1,num2);
		System.out.println("Addition is: "+res);
		
		
	}

}
