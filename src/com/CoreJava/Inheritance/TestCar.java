package com.CoreJava.Inheritance;

public class TestCar {

	public static void main(String[] args) 
	{
		//child class ref and child class object
		BMW b1=new BMW();
		b1.start();//inherited
		b1.refule();//inherited
		b1.stop();//inherited
		b1.autoEngine();//individual
		b1.breakFeature();//inherited
		b1.price();
		
		System.out.println("************************");
		//parent ref and parent object
		Car c1=new Car();
		c1.start();
		c1.refule();
		c1.stop();
		c1.breakFeature();
		c1.price();
		
		System.out.println("************************");
		Car c2=new BMW();
		c2.start();
		c2.refule();
		c2.stop();
		c2.breakFeature();
		
		System.out.println("************************");

		Audi a1=new Audi();
		a1.start();
		a1.refule();
		a1.stop();
		a1.autoGear();
		a1.breakFeature();
		a1.price();
		
		
		

	}

}
