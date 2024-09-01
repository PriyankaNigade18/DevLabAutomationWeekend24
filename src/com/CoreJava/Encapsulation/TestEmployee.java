package com.CoreJava.Encapsulation;

public class TestEmployee {

	public static void main(String[] args)
	{
		EmployeeData e1=new EmployeeData();
		e1.details();
		
		e1.setId(301);
		e1.setName("Jay");
		
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		//e1.id=201;
		//e1.details();

	}

}
