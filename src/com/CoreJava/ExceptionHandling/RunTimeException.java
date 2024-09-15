package com.CoreJava.ExceptionHandling;

import java.util.Scanner;

public class RunTimeException 
{
	int id=101;
	public void show() 
	{
		System.out.println(id);
	}

	public static void main(String[] args) 
	{
		RunTimeException r1=new RunTimeException();
		r1=null;
		try {
		r1.show();//NullPointerException
		}catch(NullPointerException n)
		{
			System.out.println("Check for Object which is null!");
		}
		
		
		String s1="100AB";
		System.out.println(s1+100);//100100
	
		int num=Integer.parseInt(s1);//NumberFormatException
		System.out.println(num+100);//200
		
		
		
		
		
		
		
		
	
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter index between 0 to 4");
			int index=sc.nextInt();
			int arr[]= {10,20,30,40,50};
			try {
			System.out.println(arr[index]);//ArrayIndexOutOfBoundsException
			}catch(ArrayIndexOutOfBoundsException a)
			{
				
				System.out.println("Please enter appropriate index!");
			}
			
			
			
			System.out.println("Enter two numbers");
			int a=sc.nextInt();
			int b=sc.nextInt();
			
			System.out.println("Addition is: "+(a+b));
			System.out.println("Subtraction is: "+(a-b));
			try {
			System.out.println("Division is: "+(a/b));//ArithmeticException
			}catch(ArithmeticException r)
			{
				System.out.println("Please enter other number than 0");
			}
			System.out.println("Multiplicationis: "+(a*b));
			
			
			
	}

}
