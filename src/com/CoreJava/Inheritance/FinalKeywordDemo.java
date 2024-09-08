package com.CoreJava.Inheritance;
//class A{
//	
//}

//final class Demo 
class Demo
{
	final int number=100;
	
	public final void search(String pname)
	{
		System.out.println("Search a product using product name: "+pname);
	}
}



public class FinalKeywordDemo extends Demo
{
//	@Override
//	public void search(String pname)
//	{
//		int price=2000;
//		System.out.println("Search a product using product name: "+pname+"price"+price);
//	}

	public static void main(String[] args) 
	{
		FinalKeywordDemo f1=new FinalKeywordDemo();
		//f1.number=300;//The final field Demo.number cannot be assigned
		System.out.println("Number from f1: "+f1.number);//100
		f1.search("watch");
		
		Demo d1=new Demo();
		//d1.number=200;
		System.out.println("Number from d1: "+d1.number);//100
		d1.search("mobile");
		
		Demo d2=new FinalKeywordDemo();
		d2.search("bag");
		

	}

}
