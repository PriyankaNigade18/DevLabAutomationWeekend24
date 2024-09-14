package com.CoreJava.CollectionFramework;

import java.util.ArrayList;

public class ArrayListDemo2 {

	/*
	 * ArrayList is class implement List interface
	 * Underline data structure is DynamicArray
	 * ArrayList is ordered collection
	 * ArrayList allowed duplicate elements
	 * ArrayList is not Synchronize(not thread safe)-multiple process
	 * ArrayList initial capacity is 10 virtual segment
	 * ArrayList is based indexing
	 * ArrayList is best suitable for data retrieval
	 */
	public static void main(String[] args)
	{

		ArrayList<String> loc=new ArrayList<String>();
		loc.add("Pune");
		loc.add("Mumbai");
		loc.add("Delhi");
		
		System.out.println(loc);
		
		System.out.println("***************************");
		
		ArrayList<Double> marks=new ArrayList<Double>();
		marks.add(89.66);
		marks.add(56.76);
		marks.add(79.66);
		
		System.out.println(marks);
		
		System.out.println("***************************");
		ArrayList<Object> empdata=new ArrayList<Object>();
		empdata.add("Sarang");
		empdata.add('M');
		empdata.add(40);
		empdata.add("Pune");
		
		System.out.println(empdata);
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
