package com.CoreJava.Polymorphism;

public class AmazonSearchTest {

	public static void main(String[] args)
	{
			AmazonSearch a1=new AmazonSearch();
			a1.search("iphone 15");
			a1.search(10000);
			a1.search(50000,"watch");
			a1.search("Bag",20000);
			a1.search("laptop","Hp");
			

	}

}
