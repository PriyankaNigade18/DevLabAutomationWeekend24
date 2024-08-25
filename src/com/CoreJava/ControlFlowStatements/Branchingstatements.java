package com.CoreJava.ControlFlowStatements;

public class Branchingstatements {

	public static void main(String[] args)
	{

		for(int i=1;i<=10;i++)
		{
			if(i>5)
			{
				break;//exit from loop/switch
			}else
			{
				System.out.println(i);//1234
			}
		}
		System.out.println("*********************");
		
		
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;//skip the certain part of code and continue execution till end
			}else
			{
				System.out.println(i);
			}
		}
		
		
		
		System.out.println("*********************");

		//write a java code to skip odd numbers upto 10
		
		for(int i=1;i<=10;i++)
		{
			if(i%2!=0)
			{
				continue;
			}else
			{
				System.out.println(i);
			}
		}
		
		System.out.println("****************************************");
		
		//Prime number
		int num=6;
		int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println(num+" is not prime number");
		}else
		{
			System.out.println(num+" is prime number");

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
