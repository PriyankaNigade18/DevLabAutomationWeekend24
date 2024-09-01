package com.CoreJava.Polymorphism;

public class ChildPoly  extends ParentPoly
{
	/*
	 * Method can be overrided only when same name method with same 
	 * signature if we declare in both parent as well child class then
	 * child override parent class method
	 */
	
	//child class override parent class method
	

	@Override
	public void color()
	{
		System.out.println("Blue");
	}
	public static void main(String[] args)
	{

		//child class ref and child class object
		ChildPoly c1=new ChildPoly();
		c1.color();//blue
		
		//parent class ref and parent class obj
		ParentPoly p1=new ParentPoly();
		p1.color();//yellow
		
		//parent class ref and child class object
		ParentPoly p2=new ChildPoly();
		p2.color();//blue
		
		
		
		
		
		
		
		
		

	}

}
