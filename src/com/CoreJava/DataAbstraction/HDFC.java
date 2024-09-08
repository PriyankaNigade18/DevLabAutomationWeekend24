package com.CoreJava.DataAbstraction;

public class HDFC implements Bank
{
	
	public void custDetails()
	{
		System.out.println("HDFC.....custDetails()");
	}

	@Override
	public void deposit() {
		System.out.println("HDFC.....deposit()");
		
	}

	@Override
	public void withdraw() {
		System.out.println("HDFC.....withdraw()");
		
	}

	@Override
	public void rateOfIneterest() {
		System.out.println("HDFC.....rateOfInterest=10%()");
		
	}

}
