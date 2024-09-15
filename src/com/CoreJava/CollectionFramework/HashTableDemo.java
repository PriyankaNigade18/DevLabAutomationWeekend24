package com.CoreJava.CollectionFramework;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

		/*
		 * Hashtable is class implement Map interface
		 * Underline data structure is hash table
		 * 
		 */
	public static void main(String[] args)
	{

		Hashtable<Integer,String> table=new Hashtable<Integer,String>();
		table.put(101,"C");
		table.put(102,"c++");
		table.put(103, "Java");
		table.put(104,"Python");
		//table.put(105, null);
		System.out.println(table);
		System.out.println("Total Elements: "+table.size());
		
		System.out.println("**********for each loop*****************");

		for(Map.Entry<Integer,String> i:table.entrySet())
		{
			System.out.println(i.getKey()+" : "+i.getValue());
		}
		
		
		
		
		
		
		
		

		
	}

}
