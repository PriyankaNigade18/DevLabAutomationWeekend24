package com.CoreJava.CollectionFramework;

import java.util.Vector;

public class VectorDemo {
	/*
	 * Vector is class implement List interface
	 * Underline data structure is DynamicArray
	 * It is thread safe and synchronized
	 * Performance wise it is slow
	 */
	public static void main(String[] args) 
	{
		Vector<Integer> v1=new Vector<Integer>();
		System.out.println("Before adding elements status is: "+v1.isEmpty());

		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(20);
		v1.add(40);
		
		System.out.println("Adding adding elements status is: "+v1.isEmpty());
		
		System.out.println("Total elements : "+v1.size());
		
		System.out.println(v1);

	}

}
