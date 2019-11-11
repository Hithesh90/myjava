package com.miscellaneous;

public class mainclass
{
	static void display(A objects)
	{
		System.out.println(objects.i);
		System.out.println(objects.j);
	}

	public static void main(String[] args)
	{
		A ob1=new A(10,250.2);
		A ob2=new A(20,550.2);
		A ob3=new A(30,5580.2);
		A ob4=new A(40,50.2);
		A ob5=new A(50,550.2);
		display(ob1);
		display(ob2);
		display(ob3);
		display(ob4);
		display(ob5);
		
		
	}
}
