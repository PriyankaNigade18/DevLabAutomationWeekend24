package com.CoreJava.Encapsulation;

import com.CoreJava.Inheritance.AccessModifierTest;

//import com.CoreJava.Inheritance.AccessModifierTest;
public class DiffPackage extends AccessModifierTest
{

	public static void main(String[] args)
	{

		AccessModifierTest a1=new AccessModifierTest();
		System.out.println(a1.name);
		
		
		
		DiffPackage d1=new DiffPackage();
		System.out.println(d1.name);
		System.out.println(d1.acno);

	}

}
