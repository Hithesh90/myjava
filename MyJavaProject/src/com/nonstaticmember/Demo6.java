package com.nonstaticmember;

public class Demo6 
{
	void m1()
	{
		System.out.println("from m1");
		System.out.println(this);
	}
	public static void main(String[]args)
	{
		Demo6 x=new Demo6();
		System.out.println(x);
		x.m1();
		
		
	}

}
