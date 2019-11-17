package com.encapsulation;

public class Votingportal 
{
public static void main(String[] args) {
	Voter voter=new Voter(19);
	System.out.println(voter.getAge());
	voter.setAge(45);
	System.out.println(voter.getAge());
}
}
