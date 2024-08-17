package com.CoreJava.Day2;

public class WrapperDemo {

	public static void main(String[] args)
	{

		//primitive to Object 
		int x=100; //primitive int
		Integer obj1=Integer.valueOf(x);
		System.out.println(obj1);
		
		double d1=89.77;
		Double dobj=Double.valueOf(d1);
		System.out.println(dobj);
		
		char ch='A';
		//char to object
		Character cobj=Character.valueOf(ch);
		System.out.println(cobj);
	
//		cobj='B';
//		System.out.println(cobj);
		
		//Object to primitive
		
		Integer i=200;
		int num1=i.intValue();
		//object to primitive
		System.out.println(num1);
		
		Float f1=78.55F;
		float ff1=f1.floatValue();
		System.out.println(ff1);
		
		
		Long l1=997676554L;
		long ll1=l1.longValue();
		
		System.out.println(ll1);
	
		
		System.out.println("******************");
		
		String s1="100";
		System.out.println(s1+100);//100100
		int num=Integer.parseInt(s1);
		//NumberFormatException
		//if the string does not contain a parsable integer.
		System.out.println(num+100);//200
		
		
		
		
		String s2="67.88";
		System.out.println(s2+11.11);//67.8811.11
		double dnum=Double.parseDouble(s2);
		System.out.println(dnum+11.11);
		
		String s3="Hello";
		char ch1=s3.charAt(3);
		
		System.out.println(ch1);//l
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}

}
