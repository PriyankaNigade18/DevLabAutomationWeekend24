package com.CoreJava.Array_String;

import java.util.Scanner;

public class AvarageNumberOfElementsOfArray {

	public static void main(String[] args) 
	{

		int arr[]={10,20,30};
		int total=0;
		for(int i:arr)
		{
			total=total+i;
		}
		System.out.println("Total of elements is: "+total);
		int avg=total/arr.length;
		System.out.println("Average of elements is: "+avg);
		
		System.out.println("******************");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lenght of array");
		int length=sc.nextInt();
		int id[]=new int[length];
		
//		System.out.println("Enter the value:" );
//		int num=sc.nextInt();
		
		for(int i=0;i<id.length;i++)
		{
			System.out.println("Enter the value:" );
			id[i]=sc.nextInt();
			//id[i]=num;
		}
		
		System.out.println("Final array is");
		for(int i:id)
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
