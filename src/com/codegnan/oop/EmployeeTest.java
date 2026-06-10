package com.codegnan.oop;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setDetails("malli", 50000);
		double grossSalary = emp.grossSalary();
		System.out.println("Employee Name : " + emp.name);
		System.out.println("Employee Basic Salary : " + emp.basicSalary);
		System.out.println("HRA Allowwancee : " + emp.calculateHRA());
		System.out.println("DA Allowennce : " + emp.calculateDA());
		System.out.println("Gross salary : " + grossSalary);
	}

}
