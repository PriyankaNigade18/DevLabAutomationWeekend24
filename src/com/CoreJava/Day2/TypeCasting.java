package com.CoreJava.Day2;

public class TypeCasting {

	public static void main(String[] args) 
	{
		// Primitive to primitive
		//implicit (small size--->large size)
		
		int x=100;
		long l=x;
		System.out.println("int to long conversion: "+l);//100
		
		char ch='A';
		int y=ch;
		System.out.println("char to int conversion: "+y);//65
		
		int z=67;//4byte
		float f1=z;//4byte 67.0
		System.out.println("int to float conversion: "+f1);

		
		//Explicit -manual conversion (large size--->small size)
		
		
		long l2=9876565544L;//8byte
		int a=(int)l2;//4 byte
		
		System.out.println("Long data is: "+l2);
		System.out.println("long to int conversion: "+a);
		
		double d1=78.78876655; //8byte
		int b=(int) d1;
		System.out.println("double to int conversion: "+b);
		
		int g=97;
		char ch2=(char) g;
		
		System.out.println("int to char conversion: "+ch2);//a
		
		
		
		
		
		
		
	}

}
