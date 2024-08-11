package com.CoreJava.Day1;

public class StaticVsInstance 
{
	static int count=1;
	
	//constructor
	public StaticVsInstance()
	{
		System.out.println(count);
		count=count+1;
	}
	public static void main(String[] args)
	{

		StaticVsInstance s1=new StaticVsInstance();

		StaticVsInstance s2=new StaticVsInstance();

		StaticVsInstance s3=new StaticVsInstance();

		StaticVsInstance s4=new StaticVsInstance();

		StaticVsInstance s5=new StaticVsInstance();
		
		

	}

}
