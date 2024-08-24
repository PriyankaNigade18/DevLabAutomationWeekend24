package com.CoreJava.ControlFlowStatements;

import java.util.Scanner;

public class SwicthCaseDemo {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=sc.nextLine().charAt(0);
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println(ch+" is vowel");
		}else
		{
			System.out.println(ch+" is an alphabet");
		}
			//key==value
		/*
		switch (ch) 
		{
		case 'a':
			System.out.println(ch+" is vowel");
			break;
		case 'e':
			System.out.println(ch+" is vowel");
			break;
		case 'i':
			System.out.println(ch+" is vowel");
			break;
		case 'o':
			System.out.println(ch+" is vowel");
			break;
		case 'u':
			System.out.println(ch+" is vowel");
			break;

		default:

			System.out.println(ch+" is an alphabet");
		}
		*/
		
		
		
		
		
		
		
		
		
		
		/*
		if(ch=='a')
		{
			System.out.println(ch+" is vowel");
		}else if(ch=='e')
		{
			System.out.println(ch+" is vowel");
		}else if(ch=='i')
		{
			System.out.println(ch+" is vowel");
		}else if(ch=='o')
		{
			System.out.println(ch+" is vowel");
		}else if(ch=='u')
		{
			System.out.println(ch+" is vowel");
		}
		else
		{
			System.out.println(ch+" is alphabet");
		}
*/
	}

}
