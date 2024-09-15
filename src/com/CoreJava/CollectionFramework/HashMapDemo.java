package com.CoreJava.CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

		/*
		 * HashMap is class implement Map interface
		 * Underline data structure is HashTable
		 * by default 16 virtual segment 
		 * <key,value>
		 * duplication in Key not allowed
		 * duplication in value allowed
		 * 
		 */
	public static void main(String[] args)
	{

		HashMap<String,Integer> loc=new HashMap<String,Integer>();
		
		System.out.println("Is map Empty?: "+loc.isEmpty());
		loc.put("VimanNagar",411014);
		loc.put("Kharadi", 411045);
		loc.put("Wagholi",411047);
		loc.put("Lohegaon",411047);
		loc.put("VimanNagar",411015);
		
		System.out.println(loc);
		System.out.println("Total locations: "+loc.size());
		System.out.println("Search for key VimanNagar: "+loc.containsKey("VimanNagar"));
		System.out.println("Search for value 411044: "+loc.containsValue(411044));
		
		System.out.println("get the value for Kharadi: "+loc.get("Kharadi"));
		
		loc.remove("Lohegaon");
		System.out.println(loc);
		
		
		System.out.println("******Ietration in Map**************");
		
		for(Map.Entry<String,Integer> i:loc.entrySet())
		{
			System.out.println(i.getKey()+" : "+i.getValue());
		}
		
		System.out.println("******Ietration using iterator()**************");
/*
 * convert map into set then apply iterator()
 * 
 */
		Set<Entry<String,Integer>> set=loc.entrySet();
		
		Iterator<Entry<String,Integer>> ir=set.iterator();
		
		while(ir.hasNext())
		{
		System.out.println(ir.next());	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
