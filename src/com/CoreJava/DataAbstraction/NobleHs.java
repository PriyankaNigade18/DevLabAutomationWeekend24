package com.CoreJava.DataAbstraction;

//Multiple inheritance in Java
public class NobleHs implements IMA,USMA
{

	public void medical()
	{
		System.out.println("NobleHs.....MedicalService()");
	}

	@Override
	public void physio() {
		System.out.println("NobleHs.....PhysioService()");
		
	}

	@Override
	public void dental() {
		System.out.println("NobleHs.....DentalService()");
		
	}

	@Override
	public void nero() {
		System.out.println("NobleHs.....neroService()");
		
	}

	@Override
	public void cardio() {
		System.out.println("NobleHs.....cardioService()");

		
	}

	@Override
	public void covid19Test() {
		System.out.println("NobleHs.....covid19Test()");
		
	}
}
