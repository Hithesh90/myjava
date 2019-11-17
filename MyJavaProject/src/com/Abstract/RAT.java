package com.Abstract;

class RAT extends Shape
{
int base;
int height;
RAT(){}
RAT(int base,int height)
{
	this.base=base;
	this.height=height;
	
}
double area()
{
	return(0.5*base*height);
}
}
