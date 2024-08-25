package com.CoreJava.ControlFlowStatements;

import java.util.Scanner;

public class LoopDemo1 {

	public static void main(String[] args) 
	{

		//print Hello message 5 time
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello All");
		}
		
		System.out.println("***************************");
		
		//1 to 10 numbers
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		System.out.println("***************************");

		//10 to 1 number
		
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
		System.out.println("**************************");
		
		//print sum of 100 naturals numbers= 5050
		//1+2+3+4.....+100
		
		int sum=0;
		for(int i=1;i<=100;i++)
		{
		sum=sum+i;
		}
		
		System.out.println(sum);
		
		System.out.println("*****************************");
		
//		for(;;)
//		{
//			System.out.println("Hi");
//		}
		/*
		//what is dead code?
		if(true)
		{
			System.out.println("Hello");
		}
		else
		{
			System.out.println("Bye");
		}
		
		*/
		
		
		int i=1,res=0;
		while(i<=10)
		{
			res=res+i;
			i++;
		}
		
		System.out.println("Sum of 10 naturals number is: "+res);
		
		//sum of digits no=123
		
		System.out.println("*******************************************");
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt(),rem,addres=0;
		
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			addres=addres+rem;
		}
		
		
		System.out.println("Sum of digits : "+addres);
		
		System.out.println("*******************************************");

		
		//do-while
		int j=1;
		do
		{
			System.out.println("Welcome");
			j++;
			
		}while(j==5);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
