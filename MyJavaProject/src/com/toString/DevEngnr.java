package com.toString;

class DevEngnr extends Employee
{
String language;

DevEngnr()
{}

public DevEngnr(int id,String name,double salary,String language) {
	super(id,name,salary);
	this.language = language;
}

public String toString()
{
	return super.toString()+"  "+language;
	
}

}
