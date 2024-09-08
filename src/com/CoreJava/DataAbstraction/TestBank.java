package com.CoreJava.DataAbstraction;

public class TestBank {

	public static void main(String[] args)
	{

		HDFC h1=new HDFC();
		h1.custDetails();//individual
		h1.deposit();//inherited abstract method
		h1.withdraw();//inherited abstract method
		h1.rateOfIneterest();//inherited abstract method
		System.out.println(h1.data);
		//h1.data=90;
		

		System.out.println("**************************");
		//Bank b1=new Bank();
		
		Bank b1=new HDFC();
		b1.rateOfIneterest();
		b1.deposit();
		b1.withdraw();
		
		System.out.println("**************************");
		
		Axis a1=new Axis();
		a1.custDetails();
		a1.deposit();
		a1.withdraw();
		a1.rateOfIneterest();
		
	}

}
