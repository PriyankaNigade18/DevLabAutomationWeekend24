package com.CoreJava.Day3_4;

public class StackOverflowErrorTest
{

	public void m1()
	{
		System.out.println("M1 calling");
		m2();
	}
	public void m2()
	{
		System.out.println("M2 calling");
		//m1();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackOverflowErrorTest s1=new StackOverflowErrorTest();
		s1.m1();
	}

}
