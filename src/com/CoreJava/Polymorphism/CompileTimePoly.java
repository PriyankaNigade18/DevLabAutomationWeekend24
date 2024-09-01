package com.CoreJava.Polymorphism;

public class CompileTimePoly
{
	/*
	 * Method Overloading
	 * ======================
	 * When we declare same name method in same class multiple time
	 * with different signature
	 * 1.number of arguments
	 * 2.Type of arguments
	 * 3.change order of arguments
	 * Then method is overloaded.
	 *  
	 * constructor overloading is possible
	 * Operator overloading is possible for one operator +
	 * main() overloading is possible but in practice we don't follow
	 * 
	 * Polymorphism will help for re-usability
	 */
	
	public void add()//0 parameter
	{
		int a=100,b=20;
		System.out.println("Addition is: "+(a+b));
	}

	public void add(int a,int b)//2 parameters
	{
		System.out.println("Addition is: "+(a+b));

	}
	public void add(double a,int b)//2 parameters
	{
		System.out.println("Addition is: "+(a+b));

	}
	public void add(int a,int b,int c)//3 parameters
	{
		System.out.println("Addition is: "+(a+b+c));

	}
	
	public void add(int a,double b)//2 parameters
	{
		System.out.println("Addition is: "+(a+b));

	}
	public static void main(String[] args)
	{
		CompileTimePoly c1=new CompileTimePoly();
		c1.add();
		c1.add(100.22,78);
		c1.add(200,90.80);
		c1.add(200,3000);
		c1.add(100,2000,8990);
		

	}

}
