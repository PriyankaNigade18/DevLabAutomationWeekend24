package com.CoreJava.Day3_4;

/*
 * this keyword used to refer current class instance variable and instance method
 * this can help to differntiate between instance and local variable
 * this can help to invoke any method
 * this can help to invoke any constructor
 */
public class ThisKeywordDemo1 {
//instance variable
	int id;
	String name;
	
	//default -called by jvm
	public ThisKeywordDemo1()
	{
		System.out.println(id);
		System.out.println(name);
		
	}
	
	public ThisKeywordDemo1(int id,String name)//
	{
		//local to instance
		this.id=id;
		this.name=name;
//		System.out.println("Id is: "+id);
//		System.out.println("Name is: "+name);
		
	}
	
	public  void display()
	{
		System.out.println(id);
		System.out.println(name);
	}
	
	

	public static void main(String[] args)
	{
		
		ThisKeywordDemo1 t1=new ThisKeywordDemo1(111,"Sunny");
		t1.display();
	}


}
