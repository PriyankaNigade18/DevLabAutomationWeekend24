package com.CoreJava.Day3_4;

public class ThisKeywordDemo2 {

	/*
	 * this keyword used to refer current class instance variable and instance method
	 * 1.this can help to differntiate between instance and local variable
	 * 2.this can help to invoke any method
	 * 3.this can help to invoke any constructor
	 */
	public void start()
	{
		System.out.println("Start application");
		//this.run();
		run();
	}
	
	public void run()
	{
		System.out.println("Run application");
		this.stop();
	}
	public void stop()
	{
		System.out.println("Stop application");
	}
	
	public static void main(String[] args) 
	{
		
		ThisKeywordDemo2 t1=new ThisKeywordDemo2();
		t1.start();



	}

}
