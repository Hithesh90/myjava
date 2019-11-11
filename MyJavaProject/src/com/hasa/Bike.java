package com.hasa;

class Bike 
{
double mileage;
String colour;
Engine engine= new Engine(450);
Bike()
{
	
}
Bike(double mileage ,String colour)
{
	this.mileage=mileage;
	this.colour=colour;
	
}
}
