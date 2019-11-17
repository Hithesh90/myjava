package com.encapsulation;

public class Voter {
	private int age;
	Voter(){}
	public Voter(int age) {
		
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>18 && age>this.age)
		{
				this.age = age;
	     }
		else 
			System.out.println("not eligible");
	}
	
	
}
