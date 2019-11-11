package com.overriding;

class MainClass
{
public static void main(String[] args) 
{
B ob1=new B();
ob1.test(); //from B test()

A ob2=new A();
ob2.test(); // from A test()

}
}
