package com.instancOf;

public class MainClass
{
public static void main(String[] args) 
{
A ob1=new B();
System.out.println(ob1 instanceof A); //true
System.out.println(ob1 instanceof B); //true

//System.out.println(ob1 instanceof D); // CTE---->ob1(A) has mo is-a relatnshp with D

B ob2=new B();
System.out.println(ob2 instanceof B); //true
System.out.println(ob2 instanceof A); //true

//System.out.println(ob2 instanceof D); //CTE---->ob2(B) has mo is-a relatnshp with D

A ob3=new A();
System.out.println(ob3 instanceof A); //true
System.out.println(ob3 instanceof B); //false




}
}
