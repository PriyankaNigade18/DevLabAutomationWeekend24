package com.CoreJava.ControlFlowStatements;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=sc.nextInt();		
		int num2=sc.nextInt();
		if(num1>num2)
		{
			System.out.println(num1+" is greater than "+num2);
		}
		else
		{
			System.out.println(num2+" is greater than "+num1);

		}
		
		
		
		
		
		/*
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		
		if(age>=18)
		{
			System.out.println("Valid age!");
		}
		else
		{
			System.out.println("Invalid age!");
	
		}
*/
	}

}
