package com.CoreJava.Inheritance;

public class AccessModifierTest
{
	
	int id=101;//default
	public String name="Smita";
	private long phno=988987777L;
	protected int acno=777766;
	

	public static void main(String[] args)
	{
		System.out.println("In Same class");
		AccessModifierTest a1=new AccessModifierTest();
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a1.phno);
		System.out.println(a1.acno);
	}

}
