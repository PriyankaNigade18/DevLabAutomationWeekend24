package com.CoreJava.Array_String;

import java.util.Arrays;

public class Array1DDemo {
/*
 * Array is static data structure 
 * Array is collection of similar data types/Objects
 * Array always store data at index position
 * Array in java implemented as Object
 * Array is always fixed in size
 *  
 * 
 * Types of array
 * ===================
 * 1.single dimensional 
 * 2.Multi dimensional
 * 
 * Ways
 * =========
 * 1.Using new Keyword
 * 2.Using literal
 * 
 * Iteration
 * =============
 * 1.for
 * 2.for each loop
 *  
 */
	public static void main(String[] args)
	{

		//declaration-using new keyword
	
		int sid[]=new int[5];
		
		//initialize
		sid[0]=101;
		sid[1]=102;
		sid[2]=103;
		sid[3]=104;
		sid[4]=105;
		
		System.out.println("Total id from array: " +sid.length);//5
		System.out.println("Single data: "+sid[3]);//104
		
		//System.out.println(sid[5]);//ArrayIndexOutOfBoundsException
		
		System.out.println("**************Iteration***************");
		
		for(int i=0;i<sid.length;i++)
		{
			System.out.println(sid[i]);
		}
		
		
		System.out.println("**************Iteration using for each loop***************");

		for(int i:sid)
		{
			System.out.println(i);
		}
		
		System.out.println("**********************************");
		
		//using literal
		String loc[]= {"Pune","Mumbai","Delhi"};
		
		System.out.println("Total locations are: "+loc.length);
		
		System.out.println(loc[1]);//Mumbai
		System.out.println("****************");
		for(String i:loc)
		{
			System.out.println(i);
		}
		
		System.out.println("**********************************");

		double marks[]= {89.66,78.55,58.88,98.77,45.7};
		System.out.println("Total entries for marks: "+marks.length);
		System.out.println(marks[4]);//45.7
		
		System.out.println(marks[0]+marks[4]);//addition
		
		System.out.println("*************");
		
		for(double i:marks)
		{
			System.out.println(i);
		}
		
		
		System.out.println("************************************");
		
		Object empdata[]= {"Sarang","Pune",30,'M',887655549L};
		System.out.println("Total data for employee: "+empdata.length);
		
		for(Object i:empdata)
		{
			System.out.println(i);
		}
		
		System.out.println("************************************");
		int num[]= {100,67,90,56,12,4,77,83};
		System.out.println("Original Array:");
		for(int i:num)
		{
			System.out.println(i);
		}
		
		//sort this array
		/*
		 * Arrays class from Object class
		 * Arrays.sort()
		 */
		
		Arrays.sort(num);
		System.out.println("After sort Array Values:");
		
		for(int i:num)
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
