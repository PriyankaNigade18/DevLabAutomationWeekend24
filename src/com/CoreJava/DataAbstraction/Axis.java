package com.CoreJava.DataAbstraction;

public class Axis implements Bank
{

	public void custDetails()
	{
		System.out.println("Axis.....custDetails()");
	}

	@Override
	public void deposit() {
		System.out.println("Axis.....deposit()");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Axis....withdraw()");

		
	}

	@Override
	public void rateOfIneterest() {
		System.out.println("Axis.....interest=8%()");

		
	}
}
