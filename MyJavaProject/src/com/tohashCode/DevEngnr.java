package com.tohashCode;

class DevEngnr extends Employee {

	String lang;
	
	DevEngnr()
	{}
	
	DevEngnr(int id,String name,double salary,String lang)
	{
		super(id,name,salary);
		this.lang=lang;
		
	}
	public String toString()
	{
		return super.toString() +"  "+lang;
		
	}
	
	public boolean equals(Object ob)
	{
		DevEngnr ob1 =(DevEngnr)ob;
		
		return super.equals(ob) && this.lang.contentEquals(ob1.lang);
		
	}
	
	public int hashCode()
	{
		int hs=super.hashCode()+lang.hashCode();
		return hs;
		
	}
}
