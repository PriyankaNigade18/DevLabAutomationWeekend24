package com.CoreJava.Inheritance;

public class ChildSuper extends ParentSuper
{

	int cid=201;
	
	public void childIncome()
	{
		//Constructor call must be the first statement in a constructor
		//super();
		System.out.println("Parent id is: "+super.pid);
		super.parentIncome();
		System.out.println("Child id is: "+cid);
		System.out.println("child income is 20$");
	}
	public ChildSuper()
	{
		//super();
		super(100);
	
		System.out.println("child constructor calling!");
	}
	public static void main(String[] args)
	{
		ChildSuper c1=new ChildSuper();
		c1.childIncome();


	}

}
