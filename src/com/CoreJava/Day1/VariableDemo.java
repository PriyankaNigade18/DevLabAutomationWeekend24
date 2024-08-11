package com.CoreJava.Day1;

public class VariableDemo
{
	int id=101;//instance variable
	String name="Sumit";//instance variable
	static String cname="AISSPMS";//static variable
	
	public void show()
	{
		System.out.println("Student id: "+id);
		System.out.println("Student name: "+name);
		System.out.println(cname);
		int marks=90;//local variable show()
		System.out.println("marks from show(): "+marks);
	}
	
	public void display()
	{
		System.out.println("Student id: "+id);
		System.out.println("Student name: "+name);
		System.out.println(cname);
		int marks=70;//local to display()
		System.out.println("Marks from display():"+marks);
	}
	
	public static void main(String[] args) 
	{
		//only execution point
		
		System.out.println(cname);
		int marks=100;//local to main()
		System.out.println("marks from main():"+marks);

		VariableDemo v1=new VariableDemo();
		v1.show();
		v1.display();
		
		System.out.println("Student id: "+v1.id);
		System.out.println("Student name: "+v1.name);
		

	}

}
