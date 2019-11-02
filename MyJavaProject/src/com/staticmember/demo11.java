package com.staticmember;

 class Demo11 
{
	static int j;
	static
	{
		System.out.println("from sib of demo11");
	}
	public static void main(String[]args) 
	{
		System.out.println("from main of demo11");
		System.out.println(Demo10.i);
		
	}
  
}
