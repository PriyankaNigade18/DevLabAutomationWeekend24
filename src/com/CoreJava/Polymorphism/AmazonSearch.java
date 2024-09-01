package com.CoreJava.Polymorphism;

public class AmazonSearch 
{
	public void search(String pname)
	{
		System.out.println("Prduct search with product name: "+pname);
	}

	public void search(int price)
	{
		System.out.println("Prduct search with product price: "+price);
	}
	
	public void search(String pname,String bname)
	{
		System.out.println("Prduct search with product name: "+pname+" & Brand name: "+bname);
	}
	
	public void search(String pname,int price)
	{
		System.out.println("Prduct search with product name: "+pname+" & price: "+price);
	}
	
	public void search(int price,String pname)
	{
		System.out.println("Prduct search with product name: "+pname+" & price: "+price);
	}
	
}
