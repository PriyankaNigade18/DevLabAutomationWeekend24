package com.CoreJava.ExceptionHandling;

import java.io.IOException;

public class ThrowsKeywordDemo
{
	public void m1() throws IOException
	{
		m2();
	}
	
	public void m2() throws IOException
	{
		m3();
	}
	
	public void m3()throws IOException
	{
		System.out.println("Enter number");
		int num=System.in.read();
		System.out.println((char)num);
	}

	public static void main(String[] args) throws IOException
	{
		ThrowsKeywordDemo t1=new ThrowsKeywordDemo();
		t1.m1();


	}

}
