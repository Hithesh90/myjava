package com.downcasting;

 class MainClass2 
 {
 static void display(A obj)
{
	System.out.println(obj.i);
	
	if(obj instanceof B)
	{
		B obj2=(B)obj;
		System.out.println(obj2.j);
	}
	
	if(obj instanceof C)
	{
		C obj3=(C)obj;
		//System.out.println((C)obj.k);
		System.out.println(obj3.k);
		System.out.println("============");
		
	}
	
}
public static void main(String[] args) 
{
	A ob1=new A(10);
	B ob2=new B(100,200);
	C ob3=new C(100,200,300);
	B ob4=new C(1000,2000,3000);
	A ob5=new C(10,20,30);
	display(ob1);
	display(ob2);
	display(ob3);
	display(ob4);
	display(ob5);
	
}
}
