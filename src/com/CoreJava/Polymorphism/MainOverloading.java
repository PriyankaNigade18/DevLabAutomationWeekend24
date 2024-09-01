package com.CoreJava.Polymorphism;

public class MainOverloading {

	public static void main(String[] args)
	{

		System.out.println("Main() with String arguments");
		
		int arr[]= {10,20,30};
		main(arr);

	}
	
	public static void main(int[] args)
	{
		System.out.println("Main() with int arguments");
		for(int i:args)
		{
			System.out.println(i);
		}


	}
	
	public static void main(double[] args)
	{
		System.out.println("Main() with double arguments");


	}

}
