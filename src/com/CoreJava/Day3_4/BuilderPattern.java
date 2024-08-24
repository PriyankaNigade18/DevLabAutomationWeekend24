package com.CoreJava.Day3_4;

public class BuilderPattern
{
	
	//Method-->object
	public BuilderPattern startApp()
	{
		System.out.println("Application started!");
		return this;
	}
	
	public  BuilderPattern runApp()
	{
		System.out.println("Application Running!");
		return this;
	}
	
	public void stopApp()
	{
		System.out.println("Application stop!");
	}

	public static void main(String[] args)
	{
		BuilderPattern b1=new BuilderPattern();
		b1.startApp().runApp().stopApp();

	}

}
