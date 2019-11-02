package com.primitivetypecasting;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       sum(10,20);
       sum(10,20,30);
       sum (10.0,20);
       }
	public static void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void sum(int a,int b ,int c)
	{
		System.out.println(a+b+c);
	}
	public static double sum(double x,double y)
	{
		return x+y;
	}

}
