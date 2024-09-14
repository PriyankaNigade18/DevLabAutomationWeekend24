package com.CoreJava.CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo 
{
	/*
	 * LinkedHashSet it extends HashSet class
	 * It has both features List(linkedlist)+Set(hashtable)
	 * It is order collection
	 * Duplication not allowed
	 */

	public static void main(String[] args)
	{

		LinkedHashSet<Integer> ls=new LinkedHashSet<Integer>();
		if(ls.isEmpty())
		{
			ls.add(10);
			ls.add(20);
			ls.add(30);
			ls.add(20);
			ls.add(10);
			ls.add(40);
			
		}

		System.out.println(ls);
		
		/*
		 * How to remove duplicate elements from the list
		 * LinkedHashSet
		 */
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(200);
		al.add(100);
			
		System.out.println(al);
		System.out.println("Duplicate elements get removed :");
		LinkedHashSet<Integer> l1=new LinkedHashSet<>(al);
		System.out.println(l1);
		
		//to remove duplicate characters
			String s1="aabbccddee";
		
		LinkedHashSet<Character> res=new LinkedHashSet<>();
		
		for(int i=0;i<s1.length();i++)
		{
			res.add(s1.charAt(i));
		}
		
		System.out.println(res);
		
		
		
		
		
		
		
	}

}
