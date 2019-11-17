package com.encapsulation;

public class EmployeePortal {
public static void main(String[] args) 
{
	Employee emp=new Employee(50,"alex",10000);
	System.out.println("employee name is "+emp.getName());
	System.out.println("employee ID is "+emp.getId());
	
	
	System.out.println("salary was " +emp.getSalary());
	emp.setSalary(1000000);
	System.out.println("salary is" +emp.getSalary());
	
	
	
	
	
	
	
	
	
	
	
}
}
