package com.CoreJava.Inheritance;

class A
{
	public void m1()
	{
		System.out.println("M1 is calling");
	}
}

class B extends A//A is parent and B is child-Single level Inheritance
{
	public void m2()
	{
		System.out.println("M2 is calling");
	}
}

class C extends B//B is parent and C is child-Multi level Inheritance
{
	public void m3()
	{
		System.out.println("M3 is calling");
	}
}

class D extends A//A is parent and D is child- Hierarchical Inheritance
{
	public void m4()
	{
		System.out.println("M4 is calling");
	}
}


public class InheritanceDemo {

	public static void main(String[] args) 
	{

		System.out.println("Child class ref and child class object:Parent+child");
		B b1=new B();
		b1.m1();//inherited
		b1.m2();//individual
		
		System.out.println("C is child class for B");
		C c1=new C();
		c1.m1();//inherited
		c1.m2();//inherited
		c1.m3();//individual
		
		System.out.println("D child for class A");
		D d1=new D();
		d1.m1();//inherited
		d1.m4();//individual
		
		System.out.println("parent class ref and parent class object:Parent");
		A a1=new A();
		a1.m1();//individual
		
		
		
		System.out.println("Parent class ref and child class object: Parent");
		
		A a2=new B();
		a2.m1();//individual
		
		
		System.out.println("Child class ref and Parent class object: Invalid");
		
		//B b2=new A();//Type mismatch: cannot convert from A to B
		
		
		
		
		

		
		
		
		

		
		
		
		
		

	}

}
