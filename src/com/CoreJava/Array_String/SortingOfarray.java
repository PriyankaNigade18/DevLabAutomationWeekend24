package com.CoreJava.Array_String;

public class SortingOfarray {

	public static void main(String[] args)
	{

		int arr[]={30,10,40};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])//30>10
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
			System.out.println(arr[i]);
		}

		
		System.out.println("***********************************");
		
		
		String data[]= {"zzz","zebra","bbb","eeee","aaaa"};
		for(int i=0;i<data.length;i++)
		{
			for(int j=i+1;j<data.length;j++)
			{
				if(data[i].compareTo(data[j])>0)
				{
					String temp=data[i];
					data[i]=data[j];
					data[j]=temp;
				}
				
						
			}
			System.out.println(data[i]);
		}
		
		System.out.println("*************************");
		
		
		
		String tech="Java Selenium";
		int ucount=0;
		int lcount=0;
		for(int i=0;i<tech.length();i++)
		{
			 char ch=tech.charAt(i);
			 if(ch>='A' && ch<='Z')
			 {
				 ucount++;
			 }else if(ch>='a' && ch<='z')
			 {
				 lcount++;
			 }
				 

//			 if(Character.isUpperCase(ch))
//			 {
//				 ucount++;
//			 }
//			 else
//			 {
//				 lcount++;
//			 }
		}
		
		System.out.println("Total Upper case characters are: "+ucount);
		
		System.out.println("Total lowercase characters are: "+lcount );
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
