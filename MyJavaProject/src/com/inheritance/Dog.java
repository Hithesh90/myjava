package com.inheritance;

 class Dog extends Animal
 {
String colour;
Dog()
{
	
}
Dog(int height, int weight ,String colour)
{
	super( height, weight);
	this.colour=colour;
	
}
public static void main(String[] args) 
{
	Dog d1=new Dog(20,60,"black");
	
	System.out.println(d1.height);
	System.out.println(d1.weight);
	System.out.println(d1.colour);
	
}
}
