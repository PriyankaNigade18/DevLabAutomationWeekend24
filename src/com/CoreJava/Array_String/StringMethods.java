package com.CoreJava.Array_String;

public class StringMethods {

	public static void main(String[] args)
	{

		String s1="Hello All";
		//length()
		System.out.println("Total characters/length of String: "+s1.length());//9
		//conversion-toUpperCase()  toLowerCase()
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		//charAt(index)
		System.out.println("character at 4th position: "+s1.charAt(4));//o
		
		//indexOf(char)-returns index of only first occurance of character
		System.out.println("Index of character is: "+s1.indexOf('o'));
		
		/*
		 * To test equality of string we have
		 * 1.equals():case sensitive
		 * 2.equalsIgnoreCase()- not case sensitive
		 * 
		 */
		
		
		String act="Selenium WebDriver is webui atomation library";
		String exp="Selenium WebDriver is Webui Atomation Library";
		
		System.out.println(act.equals(exp));//true-->false
		System.out.println(act.equalsIgnoreCase(exp));//true-->true
		
		System.out.println("ComapreTo(): "+act.compareTo(exp));//based on unicode value-false
		
		//partial string- contains()
		System.out.println("Is act string contains Tool?: "+act.contains("Tool"));//false
		System.out.println("Is act string contains webui?: "+act.contains("webui"));//true
		System.out.println("Is act string contains Webui?: "+act.contains("Webui"));//false

		//prefix value/character startsWith(prefix)
		System.out.println("Is act string starts with Selenium?: "+act.startsWith("Selenium"));//true
		System.out.println("Is act string starts with Sele?: "+act.startsWith("Sele"));//true
		System.out.println("Is act string starts with S?: "+act.startsWith("S"));//true
		System.out.println("Is act string starts with nium?: "+act.startsWith("nium"));//false

		
		//suffix value/character  endsWith(suffix)
		System.out.println("Is act string ends with library?: "+act.endsWith("library"));//true
		System.out.println("Is act string ends with ary?: "+act.endsWith("ary"));//true
		System.out.println("Is act string ends with y?: "+act.endsWith("y"));//true
		System.out.println("Is act string ends with li?: "+act.endsWith("li"));//false

		//concat()
		String s2="Welcome to learn OOP Principles in Java";
		System.out.println(s1+" "+s2);
		System.out.println(s1.concat(" "+s2));

		//trim()- ignore white space before and after string
		String s3="      Welcome all      ";
		System.out.println(s3);
		System.out.println(s3.trim());
		
		String s4="";
		System.out.println(s4.isEmpty());//Returns true if, and only if, length() is 0.
		System.out.println(s4.isBlank());//true
		String s5=" ";
		System.out.println(s5.isEmpty());//false
		System.out.println(s5.isBlank());//true
		
		
		//substring()
		
		String tools="Selenium,Postman,JMeter,Jira";
		System.out.println("substring of 9: "+tools.substring(9));
		System.out.println(tools.substring(9,23));
		
		//replace()
		String s6="Java selenium";
		System.out.println(s6);
		System.out.println(s6.replace('e','*'));
		System.out.println(s6.replace("selenium","Language"));
		
		
		//toCharArray()

		char arr[]=s6.toCharArray();
		for(char i:arr)
		{
			System.out.println(i);
		}
		
		//split(regular expression)=pattern matching
		System.out.println(tools);
		//String tools="Selenium,Postman,JMeter,Jira";
		String t[]=tools.split(",");
		System.out.println(tools.split(",")[0]);
		System.out.println(tools.split(",")[1]);
		System.out.println(tools.split(",")[2]);
		
		System.out.println("*************");
		for(String i:t)
		{
			System.out.println(i);
		}
		
		
		//live task-compare bill amount is 2000(int)
		String bill="Total 2000 is bill for this purches!";
		
		String data=bill.split(" ")[1];
		
		//string to int
		int amount=Integer.parseInt(data);
		if(amount==2000)
		{
			System.out.println("Amount matched!");
		}
		else
		{
			System.out.println("Amount not matched!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
