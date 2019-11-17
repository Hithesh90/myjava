package com.tohashCode;

public class Main2 {

	public static void main(String[] args) {
		A ob1=new A(10,12.0);
		A ob2=new A(10,12.0);
		
		B ob3 =new B(10,12.0,'a',"hello");
		B ob4= new B(10,12.0,'a',"hello");
		
		System.out.println(ob1.equals(ob2));
		
		
		//System.out.println(ob2.toString());
		
		System.out.println(ob1.hashCode());
		System.out.println(ob2.hashCode());
		System.out.println(ob3.hashCode());
		System.out.println(ob4.hashCode());
	}
}
