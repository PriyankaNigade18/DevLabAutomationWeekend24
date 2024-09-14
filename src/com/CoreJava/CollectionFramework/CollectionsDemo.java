package com.CoreJava.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {

	public static void main(String[] args) {
		/*
		 * Collection vs Collections
		 * Collection is interface in java
		 * Collections is class in java
		 * It has static methods
		 * sort()
		 * 
		 */
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(80);
		al.add(20);
		al.add(10);
		al.add(55);
		al.add(11);
		al.add(48);
		
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
		ArrayList<Integer> l2=new ArrayList<Integer>(al);
		System.out.println(l2);
		
		System.out.println("Max element: "+Collections.max(l2));
		System.out.println("Min element:  "+Collections.min(l2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
