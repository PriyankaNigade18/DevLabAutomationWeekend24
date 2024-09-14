package com.CoreJava.CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo4_Scenarios {
	/*
	 * ArrayList is class implement List interface
	 * Underline data structure is DynamicArray
	 * ArrayList is ordered collection
	 * ArrayList allowed duplicate elements
	 * ArrayList is not Synchronize(not thread safe)-multiple process
	 * ArrayList initial capacity is 10 virtual segment
	 * ArrayList is based indexing
	 * ArrayList is best suitable for data retrieval
	 * Iteration 1.simple for loop 2.for each loop 3.iterator() 4.listiterator()
	 */
	public static void main(String[] args)
	{

		/*
		 * Arrays class
		 * 
		 */
		
		List<Integer> l1=Arrays.asList(10,20,30);
		System.out.println(l1);
		
		/*
		 * one list you can save into other
		 * 1.using constructor
		 * 2.using addAll()
		 */
		//using constructor
		ArrayList<Integer> l2=new ArrayList<Integer>(l1);
		System.out.println(l2);
		
		
		//using addAll()
		ArrayList<Integer> l3=new ArrayList<Integer>();
		l3.addAll(l1);
		System.out.println(l3);
		
		System.out.println("**************************");
		
		List<Integer> list1=Arrays.asList(11,12,13);
		List<Integer> list2=Arrays.asList(14,15,16);
		List<Integer> list3=Arrays.asList(17,18);
		
		ArrayList<Integer> list4=new ArrayList<Integer>();
		list4.addAll(list1);
		list4.addAll(list2);
		list4.addAll(list3);
		
		System.out.println(list4);
		
		ArrayList<List<Integer> > list5=new ArrayList<List<Integer> >();
		list5.add(list1);
		list5.add(list2);
		list5.add(list3);
		
		System.out.println(list5);
		
		
		
		
		
		
		
		
		
		

	}

}
