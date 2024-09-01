package com.CoreJava.Encapsulation;

public class EmployeeData
{
	private int id=101;
	private String name="Sarang";
	
		
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}





	public void details()
	{
		System.out.println("Employee id is: "+id);
		System.out.println("Employee name is: "+name);
	}

}
