package com.CoreJava.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
		/*
		 * HashSet is class implements Set interface
		 * Underline data structure is HashTable
		 * HashTable maintains data as per hashing function
		 * hash(data)
		 * {Key
		 * hashcode
		 * index(code,key)
		 * }
		 * what is hashcode/index for null value?
		 * 0
		 * 
		 * node
		 * =========
		 * |key|hashcode|data|address of next element|
		 * 
		 * Initial it provides 16 virtual segments
		 * 
		 */
	public static void main(String[] args)
	{
		HashSet<Integer> hs=new HashSet<Integer>();
		System.out.println("Is set empty?: "+hs.isEmpty());
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(20);
		hs.add(null);
		System.out.println("Is set empty?: "+hs.isEmpty());

		System.out.println(hs);
		
		System.out.println("total elements: "+hs.size());
		
		System.out.println("Search for null: "+hs.contains(null));
		
		hs.remove(null);
		
		System.out.println(hs);
		
		/*
		 * how to sort the set?
		 * convert set to list and apply collections
		 */
		System.out.println("******Sort the Set********");
		ArrayList<Integer> al=new ArrayList<Integer>(hs);
		Collections.sort(al);
		
		System.out.println(al);
		
		System.out.println("********Iteration foreach***************");
		
		for(Integer i: hs)
		{
			System.out.println(i);
		}
		
		System.out.println("********Iteration using iterator()***************");

		Iterator<Integer> ir=hs.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		


	}

}
