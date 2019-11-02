package com.staticmember;

class Demo10 
{
	static int i;
	static
	{
  System.out.println("from sib of demo10");
	}
public static void  main(String[]args) 
{
	System.out.println("from main demo10");
	System.out.println(Demo11.j);	
}
}
