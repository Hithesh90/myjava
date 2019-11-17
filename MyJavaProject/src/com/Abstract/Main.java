package com.Abstract;

class Main
{
 public static void main(String[] args) 
 {
	Shape a;
	a=new Circle(2);
	
	System.out.println("radius is"+((Circle)a).radius); //2
	System.out.println("area is " +a.area()); //12.56
	
	a=new Rectangle(10,25);
	
	System.out.println("lenght is"+((Rectangle)a).lenght); //10
	System.out.println("breadth is"+((Rectangle)a).breadth); //25
	System.out.println("area is " +a.area()); //250
	
	
	a=new RAT(10,25);
	System.out.println("area is " +a.area()); //125
	
	
	
	
}
}
