package com.CoreJava.Day2;

public class OperatorDemo {

	public static void main(String[] args)
	{
			System.out.println("Arithematic Operators + - * / %");
			int a=20,b=10;
			System.out.println("Addition is:"+(a+b));
			System.out.println("Subtraction is: "+(a-b));
			System.out.println("Division is: "+(a/b));
			System.out.println("Multiplication is: "+(a*b));
			System.out.println("Modulus is: "+(a%b));

			/*
			 * Unary Operators
			 * ===================
			 * ++ Increment 
			 * -- decrement
			 * 
			 * int a=10;   a++ (post increment)  ++a (pre increment)
			 *
			 *a=a+1
			 * 
			 * int a=10;   a-- (post decrement)  --a (pre decrement)
			 *
			 *a=a-1
			 * 
			 */
			//post increment
			int x=100;
			System.out.println(x);//100
			System.out.println(x++);//100
			System.out.println(x);//101
			
			//pre increment
			int y=200;
			System.out.println(y);//200
			System.out.println(++y);//201
			
			int u=67;
			int v=u++;
			
			System.out.println(u);//68
			System.out.println(v);//67
			
			int i=90;
			int j=++i;
			System.out.println(i);//91
			System.out.println(j);//91
			
			
			int c=678;
			int d=c++;
			System.out.println(c);//679
			System.out.println(d);//678
			
			
			int p=89;
			System.out.println(p);//89
			System.out.println(p--);//89
			System.out.println(p);//88
			
			int q=37;
			System.out.println(q);//37
			System.out.println(--q);//36
			
			System.out.println("Relational Operators");
			
			//q=36  i=j=91 u=68 v=67 y=201
			
			System.out.println("< less than: "+(q<i));//true
			System.out.println(v<q);//false
			System.out.println("<= lessthan equal to: "+(i<=j));//true
			System.out.println("> greater than : "+(y>i));//true
			System.out.println(i>j);//false
			System.out.println(i>=j);//true
			System.out.println(i==j);//true
			System.out.println(q!=i);//true
			System.out.println(y==v);//false
			
			System.out.println("Logical Operator");
			/*
			 * c1   c2    and(&&)     or(||)     !(not) !(c1)
			 * ---------------------------------------------
			 * T	T		T			T			F
			 * T 	F		F			T			F
			 * F	T		F			T			T
			 * F	F		F			F	        T
			 * 
			 *  
			 */
			
			System.out.println(q<i && i==j);//true
			System.out.println(y==v && v<u);//false
			System.out.println(q!=y && y==v);//false
			System.out.println(i!=j && q>y);//false
			
			
			System.out.println(q<i || i==j);//true
			System.out.println(y==v || v<u);//true
			System.out.println(q!=y || y==v);//true
			System.out.println(i!=j || q>y);//false
			
			//not operator applicable to boolean
			System.out.println(i==j);//true
			System.out.println(!(i==j));//false
			System.out.println(!true);//false
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			 
	}

}
