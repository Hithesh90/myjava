package com.assignment;

public class Book
{

	String name;
	int price;
	int isbn;
	static int x;
	Book()
	{
	++x;
	this.isbn=x;
	}
	
	Book(String name, int price)
	{
	this();
	this.name=name;
	this.price=price;
	}
	
	void genre(String type)
	{
	System.out.println(name + "of "+ type +" genre");
	}
	}




	