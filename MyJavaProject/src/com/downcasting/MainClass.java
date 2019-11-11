package com.downcasting;

class MainClass
{
public static void main(String[] args)
{
	B ob1=new B(100,200);
	display(ob1);
	
	A ob2=new A(100);
	display(ob2);
}
static void display(A obj)
{
	System.out.println(obj.i);
	
	if(obj instanceof B)
	{
		//B obj1=(B)obj;
		//System.out.println(obj1.j);
		System.out.println( ((B) obj).j);
		
		System.out.println("-------");
		
		
	}
}
}
