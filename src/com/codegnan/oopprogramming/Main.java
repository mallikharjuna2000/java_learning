package com.codegnan.oopprogramming;

public class Main {

	public static void main(String[] args) {
		Employee1 emp1 = new FullTimeEmployee("malli", 50000);
		Employee1 emp2 = new PartTimeEmployee("arjun", 2500, 75);
		Employee1 emp3 = new ContractEmployee("mani", 300000);
		emp1.display();
		System.out.println("Salary : " + emp1.calculateSalary());
		emp2.display();
		System.out.println("Salary : " + emp2.calculateSalary());
		emp3.display();
		System.out.println("Salary : " + emp3.calculateSalary());
	}

}
