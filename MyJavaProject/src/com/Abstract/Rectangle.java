package com.Abstract;

class Rectangle extends Shape
{
int lenght;
int breadth;
Rectangle(){}
Rectangle(int lenght, int breadth)
{
	this.lenght=lenght;
	this.breadth=breadth;	
}

double area()
{
	return(lenght*breadth);
	
}
}
