package com.tohashCode;

class EmplPortal {
public static void main(String[] args) {
	
	Employee ob=new Employee(1,"hith",1200);
	System.out.println(ob.hashCode());
	
	
	TestEngnr ob1=new TestEngnr(2,"rith",52000,"selen");
	System.out.println(ob1.hashCode());
	
	
	DevEngnr ob2=new DevEngnr(2,"rith",52000,"selen");
	System.out.println(ob1.hashCode());
	
	
	
}
}
