package com.CoreJava.ControlFlowStatements;

import java.util.Scanner;

public class SwitchCaseDemo2 {

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter performance number vetween 1 to 5");
		int pno=sc.nextInt();
		
		switch(pno)
		{
		case 1:
			System.out.println("Poor Performance");
			break;
			
		case 2:
			System.out.println("Need to Improve");
			break;
			
		case 3:
			System.out.println("Good Performance");
			break;
			
		case 4:
			System.out.println("Excellent Performance");
			break;
			
		case 5:
			System.out.println("Employee of the month");
			break;
			
			default:
				System.out.println("Invalid number");
		
		}

	}

}
