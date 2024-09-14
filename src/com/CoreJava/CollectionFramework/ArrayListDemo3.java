package com.CoreJava.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo3 {

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

		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		System.out.println(al);
    System.out.println("********simple for loop**************");
		
	for(int i=0;i<al.size();i++)
	{
		System.out.println(al.get(i));
	}
	System.out.println("********for each loop**************");
	
	for(Integer i:al)
	{
		System.out.println(i);
	}
	System.out.println("********using iterator()**************");
	/*
	 * method is iterator()
	 * It returns Iterator interface object of same type
	 * hasNext():Returns true if the iteration has more elements.
	 * next(): Returns next element
	 * 
	 * 
	 */
	
	Iterator<Integer> ir=al.iterator();
	while(ir.hasNext())
	{
		System.out.println(ir.next());
	}
	
	System.out.println("********using listiterator()**************");

	ListIterator<Integer> lr=al.listIterator();
	while(lr.hasNext())
	{
		System.out.println(lr.next());
	}
	
	System.out.println("Reverse order");
	while(lr.hasPrevious())
	{
		System.out.println(lr.previous());
	}
	
	
	
	
		
	}

}
