package com.CoreJava.Day2;

public final class ProductDetails
{
	int pid;
	String pname;
	int price;
	
	public void display()
	{
		System.out.println("Product id is: "+pid);
		System.out.println("Product name is: "+pname);
		System.out.println("Product price is: "+price);
	}

	public static void main(String[] args)
	{
		ProductDetails p1=new ProductDetails();
		p1.pid=101;
		p1.pname="watch";
		p1.price=50000;
		p1.display();
		

	}

}
