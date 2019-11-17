package com.tohashCode;



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

public boolean equals(Object ob)
{
	TestEngnr ob1=(TestEngnr)ob;
	return super.equals(ob) && this.tool.equals(ob1.tool);
	
}
public int hashCode() {
  int hs=super.hashCode()+tool.hashCode();
return hs;
}
}
