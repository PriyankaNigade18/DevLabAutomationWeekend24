package com.CoreJava.Day3_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HowToReadInputFromUser 
{

	public static void main(String[] args) throws IOException 
	{
		//Scanner class
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name");
		String name=sc.nextLine();
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		System.out.println("Your Name is: "+name+" & your age is: "+age);
		sc.close();
		
		
		
		
		
		
		/*
		System.out.println("Enter your age: ");
		//BufferedReader class
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		String data=br.readLine();
		//string to int
		int age=Integer.parseInt(data);
		System.out.println("Your age is: "+age);
		
		*/
		
		
		
		
		
		//reads single char and returns its ascii as int data
//		System.out.println("Enter your age");
//		int age=System.in.read();
//		System.out.println((char)age);
		

	}

}
