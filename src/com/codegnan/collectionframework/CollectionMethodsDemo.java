package com.codegnan.collectionframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMethodsDemo {

	public static void main(String[] args) {

		Collection<Employee> employeeList = new ArrayList<>();

		Employee e1 = new Employee(111, "Malli", 60000, "Hyderabad");
		Employee e2 = new Employee(222, "Arjun", 50000, "Vijayawada");
		Employee e3 = new Employee(333, "Sarkar", 40000, "Bangalore");
		Employee e4 = new Employee(444, "Rahul", 70000, "Chennai");
		Employee e5 = new Employee(555, "Ravi", 45000, "Pune");

		// ==================================================
		// add()
		// ==================================================

		System.out.println("------------ add() ----------------");

		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);

		System.out.println(employeeList);

		// ==================================================
		// addAll()
		// ==================================================

		System.out.println("\n------------ addAll() ----------------");

		Collection<Employee> moreEmployees = new ArrayList<>();

		moreEmployees.add(e4);
		moreEmployees.add(e5);

		employeeList.addAll(moreEmployees);

		System.out.println(employeeList);

		// ==================================================
		// contains()
		// ==================================================

		System.out.println("\n------------ contains() ----------------");

		System.out.println(employeeList.contains(e2));

		// ==================================================
		// containsAll()
		// ==================================================

		System.out.println("\n------------ containsAll() ----------------");

		System.out.println(employeeList.containsAll(moreEmployees));

		// ==================================================
		// size()
		// ==================================================

		System.out.println("\n------------ size() ----------------");

		System.out.println(employeeList.size());

		// ==================================================
		// isEmpty()
		// ==================================================

		System.out.println("\n------------ isEmpty() ----------------");

		System.out.println(employeeList.isEmpty());

		// ==================================================
		// iterator()
		// ==================================================

		System.out.println("\n------------ iterator() ----------------");

		Iterator<Employee> itr = employeeList.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// ==================================================
		// toArray()
		// ==================================================

		System.out.println("\n------------ toArray() ----------------");

		Object[] employees = employeeList.toArray();

		for (Object obj : employees) {
			System.out.println(obj);
		}

		// ==================================================
		// remove()
		// ==================================================

		System.out.println("\n------------ remove() ----------------");

		employeeList.remove(e3);

		System.out.println(employeeList);

		// ==================================================
		// removeAll()
		// ==================================================

		System.out.println("\n------------ removeAll() ----------------");

		employeeList.removeAll(moreEmployees);

		System.out.println(employeeList);

		// ==================================================
		// retainAll()
		// ==================================================

		System.out.println("\n------------ retainAll() ----------------");

		Collection<Employee> list1 = new ArrayList<>();

		list1.add(e1);
		list1.add(e2);
		list1.add(e3);

		Collection<Employee> list2 = new ArrayList<>();

		list2.add(e2);
		list2.add(e3);
		list2.add(e4);

		System.out.println("Before retainAll()");
		System.out.println(list1);

		list1.retainAll(list2);

		System.out.println("After retainAll()");
		System.out.println(list1);

		// ==================================================
		// clear()
		// ==================================================

		System.out.println("\n------------ clear() ----------------");

		list1.clear();

		System.out.println(list1);

		// ==================================================
		// isEmpty()
		// ==================================================

		System.out.println("\n------------ isEmpty() After clear ----------------");

		System.out.println(list1.isEmpty());

	}
}