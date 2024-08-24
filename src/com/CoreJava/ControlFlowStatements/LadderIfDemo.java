package com.CoreJava.ControlFlowStatements;

import java.util.Scanner;

public class LadderIfDemo {

	public static void main(String[] args)
	{	
		/*
		 * String is class
		 * String compare is possible with methods
		 * -----------------------------
		 * 1.equals()-exact matching and it is case sensitive
		 * 
		 * 2.equalsIgnoreCase()- exact match & it is not case sensitive
		
		
		String s1="Hello All";
		String s2="hello all";
		
		System.out.println("equals(): "+s1.equals(s2));//true-->false
		System.out.println("equalsIgnoreCase(): "+s1.equalsIgnoreCase(s2));//true
		
		*/
		
		
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter browser name");	
				String bname=sc.nextLine();
				
				if(bname.equalsIgnoreCase("chrome"))
				{
					System.out.println("Test case is running on chrome!");
				}else if(bname.equalsIgnoreCase("edge"))
				{
					System.out.println("Test case is running on edge!");

				}else if(bname.equalsIgnoreCase("firefox"))
				{
					System.out.println("Test case is running on firefox!");

				}else
				{
					System.out.println("Please provide appropriate browser name!");
				}
				
				
				
				
				
				
				
				
				
				
				
				

	}

}
