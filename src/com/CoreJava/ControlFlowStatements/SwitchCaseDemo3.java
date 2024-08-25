package com.CoreJava.ControlFlowStatements;

import java.util.Scanner;

public class SwitchCaseDemo3 {

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name");
		String bname=sc.nextLine();
		//toUpperCase()    toLowerCase()
		switch(bname.toLowerCase())
		{
		case "chrome":
			System.out.println("Test case is executing on chrome!");
			break;
			
		case "edge":
			System.out.println("Test case is executing on edge!");
			break;
			
		case "firefox":
			System.out.println("Test case is executing on firefox!");
			break;
			
			default:
				System.out.println("Please provide valid browser name!");
		}
		
		
		
		
		
		

	}

}
