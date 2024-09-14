package com.CoreJava.CollectionFramework;

import java.util.ArrayList;

public class ArrayListDemo1
{
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

		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("Before Adding elements List is empty?: "+al.isEmpty());//true
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(20);
		al.add(null);
		System.out.println("After adding elements List is empty?: "+al.isEmpty());//false
		System.out.println(al);
		System.out.println("Total Elements in list: "+al.size());
		System.out.println("Search for 50?: "+al.contains(50));//false
		//insert element at 3rd position
		al.add(3,70);
		System.out.println(al);
		//remove
		al.remove(6);
		System.out.println(al);
		//all the elements removed
		al.clear();
		System.out.println(al);//[]
		System.out.println(al.size());//0
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
