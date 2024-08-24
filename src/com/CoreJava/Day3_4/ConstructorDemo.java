package com.CoreJava.Day3_4;

public class ConstructorDemo 
{
	int id;
	String name;
	
	//default -called by jvm
	public ConstructorDemo()
	{
		System.out.println(id);
		System.out.println(name);
		
	}
	


	
	public ConstructorDemo(int i,String n)//i=101 n=Riya local
	{
		//instance=local
		id=i;
		name=n;
		System.out.println("Id is: "+id);
		System.out.println("Name is: "+name);
		
	}
	
	public  void display()
	{
		System.out.println(id);
		System.out.println(name);
	}
	
	

	public static void main(String[] args)
	{
		ConstructorDemo c1=new ConstructorDemo();
		

		ConstructorDemo c2=new ConstructorDemo(101,"Riya");
	}

}
