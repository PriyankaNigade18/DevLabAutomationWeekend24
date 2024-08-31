package com.CoreJava.Array_String;

public class MultiDArray {

	public static void main(String[] args) 
	{
		//Using new keyword
		int arr[][]=new int[3][2];
		
		arr[0][0]=10;
		arr[0][1]=20;
		
		arr[1][0]=30;
		arr[1][1]=40;
		
		arr[2][0]=50;
		arr[2][1]=60;
				
		System.out.println("Number of rows: "+arr.length);

		System.out.println("Number of columns: "+arr[0].length);
		
		System.out.println("Single value:"+arr[1][1]);//40
		//System.out.println(arr[2][2]);//ArrayIndexOutOfBoundsException
		
		System.out.println("****Ietration using for loop****");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println("****Ietration using for each loop****");
		
		
		for(int i[]:arr)//10,20- row
		{
			for(int j:i)//single data
			{
				System.out.print(j+" ");	
			}
			
			System.out.println();
		}
		
		System.out.println("***************************************");
		
		//literal type array
		
		int id[][]= {{100,200},{300,400},{500,600},{700,800}};
		
		System.out.println("Number of rows: "+id.length);//4
		System.out.println("Number of columns: "+id[1].length);//2
		
		for(int i[]:id)//row-100,200
		{
			for(int j:i)//100
			{
			System.out.print(j+" ");	
			}
			System.out.println();
		}
		
		
		
		
		
		

	}

}
