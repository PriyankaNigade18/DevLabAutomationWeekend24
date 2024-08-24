package com.CoreJava.Day2;

public class CompileTimeParameterPassing 
{

	
		public void add()//0 parameter method
		{
			int a=100,b=20;//local
			System.out.println("Addition is: "+(a+b));
			
		}
		
		public void sub(int a,int b)//2 parameters a,b are local a=500 b=100
		{
			System.out.println("Subtraction is: "+(a-b));
		}
	/*
	 * Return keyword 
	 * ====================
	 * 1.change return type of method
	 * 2.at a time you can return only one value
	 * 3.return statement should be last statement of method
	 * 4. return keyword return the result/value to calling method
	 * 
	 */
		public String info(String msg)
		{
			//System.out.println(msg);
			return msg;
		}
		
		public double data(double marks)
		{
			return marks;
		}
		
		public int mul(int a,int b)
		{
			//System.out.println(a*b);
			return a*b;
		}
	public static void main(String[] args)
	{
		CompileTimeParameterPassing c1=new CompileTimeParameterPassing();
		
		c1.add();
		c1.sub(500,100);
		
		String res=c1.info("Welcome to learn core concepts of Java");
		System.out.println(res);
		
		double val=c1.data(78.88);
		System.out.println(val);
		
		int r=c1.mul(10,10);
		System.out.println(r);
		
		/*'
		 * 
		 * Argument: passing original data/value
		 * Parameter: passing variable that is parameter
		 * when we pass arguments while calling that method
		 *  is called compile time parameter passing!
		 */
		
		
		

		

	}

}
