package com.CoreJava.CollectionFramework;

import java.util.TreeSet;

public class TreeSetDemo {
	/*
	 * TreeSet is extends SortedSet
	 * Underline data structure is SearchTree
	 * Ascending order
	 * 
	 */
	public static void main(String[] args) {

		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(2);
		ts.add(6);
		ts.add(1);
		ts.add(8);
		ts.add(10);
		ts.add(9);
		ts.add(7);
		ts.add(20);
		
		
		System.out.println(ts);
		System.out.println(ts.descendingSet());
		System.out.println(ts.headSet(10));//less that 10
		System.out.println(ts.tailSet(8));//greater than +equal
		System.out.println(ts.subSet(6,10));
		
		System.out.println(ts.first());

		System.out.println(ts.last());
		
		
		
		
		

	}

}
