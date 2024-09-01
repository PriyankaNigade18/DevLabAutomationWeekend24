package com.CoreJava.Encapsulation;


class Book
{
	
	private int pageno;
	
	public void setPageNo(int pageno)
	{

		if(pageno>0)
		{
			this.pageno=pageno;
		}else
		{
			System.out.println("Invalid pagenumber");
		}
		
	}
	
	public int getPageNo()
	{
		System.out.println("This returns page number:");
		return pageno;
	}
	
}





public class EncapsulationDemo {

	public static void main(String[] args)
	{

		Book b1=new Book();
		b1.setPageNo(-20);
		System.out.println(b1.getPageNo());
		
		
//		b1.pageno=14;
//		System.out.println(b1.pageno);
		

	}

}
