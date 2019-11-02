package com.nonstaticmember;

class mainClass2 
{
	public static void main(String[]args) 
	{
		
	
	A ob1	= new A(); //refernc variable of classA
	B ob2 =  new B (); //refernc variable of classB
	System.out.println(ob1); //A@15db9742
	System.out.println(ob2); //.B@6d06d69c 
	System.out.println(ob1.d); //0.0
	System.out.println(ob2.d); //0
}
}