package com.toString;

class TestEngnr extends Employee
{
String tool;
TestEngnr(){}



 TestEngnr(int id,String name,double salary,String tool) {
	super(id,name,salary);
	this.tool = tool;
}

public String toString()
{
	return super.toString()+"  "+tool;
	
}
}
