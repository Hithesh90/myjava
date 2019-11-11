package com.polymorphism;

class MainClass2 
{
public static void main(String[] args) 
{
	Bank bank;
	bank=new Bank();
	System.out.println(bank.rateOfInterest());
	
	bank=new CanaraBank();
	System.out.println(bank.rateOfInterest());
	
	bank=new ICICI();
	System.out.println(bank.rateOfInterest());
	
	bank=new SBI();
	System.out.println(bank.rateOfInterest());
	
	bank=new SBIInTouch();
	System.out.println(bank.rateOfInterest());
	
	
	
}
}
