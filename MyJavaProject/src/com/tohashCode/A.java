package com.tohashCode;

public class A {
	int i;
	double d;
	A()
	{}
	A(int i,double d)
	{
		this.i=i;
		this.d=d;
	}
	
	
	
	/*//public String toString()
	{
		return i+"  " +d;
	}*/
	
	
	
	public boolean equals(Object ob)
	{
		A temp=(A)ob;
		return this.i==temp.i && this.d==temp.d;
	}
	public int hashCode()
	{
		int a;
		
		return a=i+(int)d;
	}
}


