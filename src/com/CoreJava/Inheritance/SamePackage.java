package com.CoreJava.Inheritance;

public class SamePackage {

	public static void main(String[] args)
	{
		System.out.println("In same package- default,public,protected");
		AccessModifierTest a1=new AccessModifierTest();
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a1.acno);

	}

}
