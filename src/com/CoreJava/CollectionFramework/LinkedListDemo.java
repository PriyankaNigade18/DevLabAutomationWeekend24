package com.CoreJava.CollectionFramework;

import java.util.LinkedList;

public class LinkedListDemo {

		/*
		 * LinkedList is class implements List interface
		 * Underline data structure is DoublyLinkedList
		 * Frequent operation is data insertion and data deletion
		 * LinkedList is index based
		 * Ordered collection
		 * Duplication allowed
		 * Based on Node structure
		 * |head|
		 * |data|address of next element|
		 * 
		 */
	public static void main(String[] args)
	{
		LinkedList<Integer> l1=new LinkedList<Integer>();
		if(l1.isEmpty())
		{
			l1.add(10);
			l1.add(20);
			l1.add(30);
			l1.add(40);
			l1.add(50);
			l1.add(20);
			
		}
		
		System.out.println("Total elements are : "+l1.size());
		
		System.out.println(l1);
		System.out.println("search for 30?: "+l1.contains(30));
		l1.add(0,110);
		System.out.println(l1);
		
		l1.addFirst(10000);
		l1.addLast(20000);
		
		System.out.println(l1);
		System.out.println(l1.get(4));
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
