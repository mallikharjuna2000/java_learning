package com.codegnan.oop;

public class Employee_01Test {

	public static void main(String[] args) {
		Employee_01 emp = new Employee_01(111, "mahi", 35000);
		System.out.println("id : "+emp.getId());
		System.out.println("Name : "+emp.getName());
		System.out.println("Salary : "+emp.getSalary());
		emp.setId(100);
		emp.setName("mani");
		emp.setSalary(60000);
		System.out.println("id : "+emp.getId());
		System.out.println("Name : "+emp.getName());
		System.out.println("Salary : "+emp.getSalary());
	}

}
