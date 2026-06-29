package com.codegnan.collectionframework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListMethodsDemo {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<>();

		Employee e1 = new Employee(111, "Malli", 60000, "Hyderabad");
		Employee e2 = new Employee(222, "Arjun", 50000, "Vijayawada");
		Employee e3 = new Employee(333, "Sarkar", 40000, "Bangalore");
		Employee e4 = new Employee(444, "Rahul", 70000, "Chennai");
		Employee e5 = new Employee(555, "Ravi", 45000, "Pune");

		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);

		System.out.println("Original List");
		System.out.println(employeeList);

		// ==================================================
		// add(index, object)
		// ==================================================

		System.out.println("\n---------- add(index,Object) ----------");

		employeeList.add(1, e4);

		System.out.println(employeeList);

		// ==================================================
		// addAll(index, Collection)
		// ==================================================

		System.out.println("\n---------- addAll(index,Collection) ----------");

		List<Employee> newEmployees = new ArrayList<>();
		newEmployees.add(e5);

		employeeList.addAll(2, newEmployees);

		System.out.println(employeeList);

		// ==================================================
		// get(index)
		// ==================================================

		System.out.println("\n---------- get(index) ----------");

		System.out.println(employeeList.get(3));

		// ==================================================
		// set(index,Object)
		// ==================================================

		System.out.println("\n---------- set(index,Object) ----------");

		Employee newEmp = new Employee(666, "Kiran", 90000, "Mumbai");

		employeeList.set(2, newEmp);

		System.out.println(employeeList);

		// ==================================================
		// remove(index)
		// ==================================================

		System.out.println("\n---------- remove(index) ----------");

		employeeList.remove(1);

		System.out.println(employeeList);

		// ==================================================
		// indexOf(Object)
		// ==================================================

		System.out.println("\n---------- indexOf(Object) ----------");

		System.out.println(employeeList.indexOf(e3));

		// ==================================================
		// lastIndexOf(Object)
		// ==================================================

		System.out.println("\n---------- lastIndexOf(Object) ----------");

		employeeList.add(e3);
		employeeList.add(e3);

		System.out.println(employeeList);

		System.out.println(employeeList.lastIndexOf(e3));

		// ==================================================
		// ListIterator
		// ==================================================

		System.out.println("\n---------- ListIterator Forward ----------");

		ListIterator<Employee> listIterator = employeeList.listIterator();

		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

		System.out.println("\n---------- ListIterator Backward ----------");

		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

	}
}