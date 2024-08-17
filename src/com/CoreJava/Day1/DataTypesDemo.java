package com.CoreJava.Day1;

public class DataTypesDemo {

	public static void main(String[] args) 
	{

		System.out.println("******Boolean datatype**********");
		//1 bit true/false
		boolean status=true;
		System.out.println("boolean data is: "+status);
		status=false;
		System.out.println("updated status is: "+status);
		
		boolean newstatus=true;
		System.out.println("new status is: "+newstatus);

		
		
		System.out.println("********Character**************");
		
		/*
		 * character (char) type 2byte
		 * --------------------------
		 * 1.single character
		 * 2.special character
		 * 3.ASCII numbers
		 * A-Z = 65 to 90
		 * a-z = 97 to 122
		 * 0 to 9= 48 to 57
		 */
		char c1='A';
		System.out.println("Single character: "+c1);
		
		char c2='$';
		System.out.println("Special character: "+c2);
		
		char c3=69;//accepting ascii 122 for a character
		System.out.println("character for ascii 69: "+c3);
		
		System.out.println("*****************************");
		//integral-->Integer
		//byte 1byte -128 to 127
		
		byte b1=120;
		byte b2=-128;
		//byte b3=128;//Type mismatch: cannot convert from int to byte
		System.out.println("Byte data is: "+b1);
		System.out.println(b2);
		
		//short 2byte -32768 to 32767
		short b3=10000;
		//short b4=32768;//Type mismatch: cannot convert from int to short
		short b4=32000;
		System.out.println("Short data is: "+b3);
		System.out.println(b4);
		
		//int 4byte 
		
		int i1=987654;
		System.out.println("int data is: "+i1);
		//int i2=9999999999;//The literal 9999999999 of type int is out of range 
		
		
		//long 8byte
		long l1=9999999999L;
		System.out.println("Long data is: "+l1);
		
		//floating point 
		//float 4byte
		float f1=67.77F;
		System.out.println("float data is: "+f1);
		
		//double 8byte
		double d1=78.88;
		System.out.println("double data is: "+d1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
