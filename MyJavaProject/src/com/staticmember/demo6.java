package com.staticmember;

public class demo6 {
	static int i;
	public static void main(String[]args)
	{
		int i=10;
		System.out.println(i);
		System.out.println(demo6.i);
		m1();
		System.out.println(demo6.i);
	}
	public static void m1()
	{
		System.out.println(i);
		i=20;
	}
}
