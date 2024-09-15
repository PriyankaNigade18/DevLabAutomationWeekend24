package com.CoreJava.ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		/*
		 * Finally block is used to store special code
		 * and Finally block always execute with or without exception
		 * 
		 * try-finally
		 */
		
		System.out.println(9/3);
		try {
		System.out.println(9/9);
		
		}catch(Exception e)
		{
			System.out.println("Please enter number other than 0");
		}
		
		finally 
		{
			System.out.println("Thank you for Visit!");
		}

	}

}
