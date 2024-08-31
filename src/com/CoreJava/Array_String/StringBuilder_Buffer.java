package com.CoreJava.Array_String;

public class StringBuilder_Buffer
{

	public static void main(String args[])
	{
		
		//Stringbuilder and buffer both classes are mutable
		StringBuilder br=new StringBuilder("Java");
		br.append("Selenium");
		System.out.println(br);
		
		//reverse string using method
		
		StringBuilder ss1=new StringBuilder("Java");
		System.out.println(ss1.reverse());
		
		//how to reverse a string without method
		String s1="Java selenium";
		String res="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			res=res+s1.charAt(i);
		}
		
		System.out.println(res);
		
		
		
		
		
		
		
	}
}
