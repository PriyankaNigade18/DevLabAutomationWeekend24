package com.CoreJava.Array_String;

public class StringDemo1 {

	public static void main(String[] args)
	{

		String s1="Hello";
		String s2=new String("Hello");
		
		//== compares Id assigned by the jvm
		System.out.println(s1==s2);//false
		
		System.out.println("new Keyword string using method:"+s1.equals(s2));//true
		String s3="Hello";
		System.out.println(s1==s3);//true
		System.out.println("S3 with method:"+s1.equals(s3));//true
		System.out.println("**************");
		//String is immutable
		
		s1=s1+" ";
		
		System.out.println(s1==s3);//false
		
		
		
		
		
		
		
		
		
		


	}

}
