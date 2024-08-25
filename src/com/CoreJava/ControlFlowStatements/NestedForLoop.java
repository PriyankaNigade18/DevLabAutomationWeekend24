package com.CoreJava.ControlFlowStatements;

public class NestedForLoop {

	public static void main(String[] args)
	{
		// table of 2
		int num=2;
		for(int i=1;i<=10;i++)
		{
			System.out.println(num*i);
		}
		
		//print all the tables from 1 to 10
		System.out.println("*********************************");
		
		for(int i=1;i<=10;i++)//number
		{
			for(int j=1;j<=10;j++)
			{
				System.out.print(i*j+"\t");
			}
			System.out.println();
		}
	System.out.println("*********************************");

	for(int i=1;i<=4;i++)//row
	{
		for(int j=1;j<=4;j++)//cell
		{
			System.out.print("*"+" ");
		}
		System.out.println();
	}
	
	
	System.out.println("*********************************");

	for(int r=1;r<=4;r++)
	{
		
		for(int c=1;c<=r;c++)
		{
			System.out.print("*"+" ");
		}
		System.out.println();
	}
	
	System.out.println("*********************************");

	for(int i=1;i<=10;i++)
	{
		if(i>=5)
		{
			System.out.print(i+" ");
		}else
		{
			System.out.println(i);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		

	}

}
