package com.codegnan.collectionframework;

import java.util.TreeSet;

public class MultiLevelSortingExample {

	public static void main(String[] args) {
		TreeSet<Employee> treeSet=new TreeSet<>(new SalaryNameComparator());
		treeSet.add(new Employee(999, "malli", 17000, "hyd"));
		treeSet.add(new Employee(666, "arjun", 1000, "bng"));
		treeSet.add(new Employee(111, "neha", 22000, "vjy"));
		treeSet.add(new Employee(333, "sneha", 55000, "mumbai"));
		treeSet.add(new Employee(777, "raji", 22000, "kolkatta"));
		for(Employee e:treeSet) {
			System.out.println(e);
		}
	}

}
