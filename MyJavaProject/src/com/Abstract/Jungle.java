package com.Abstract;

class Jungle
{
public static void main(String[] args)
{
	Dog a=new Dog(3.2,45);
	System.out.println(a.height + "is height");
	System.out.println(a.weight + "is weight");
	a.talk();
	System.out.println("-------------");
	Lion b= new Lion(4.5,50);
	System.out.println(b.height + "is height");
	System.out.println(b.weight + "is weight");
	b.talk();
	
	System.out.println("-------------");
	
	//polmorphism//
	
	Animal d=new Dog(2.5,5);
	System.out.println(d.height + "is height");
	System.out.println(d.weight + "is weight");
	d.talk();
}
}
