package com.codegnan.collectionframework;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Person> t = new TreeSet<>(new PersonComparator());
		t.add(new Person(102, "Charlie", "charlie@example.com"));
		t.add(new Person(101, "Alice", "alice@example.com"));
		t.add(new Person(103, "Bob", "bob@example.com"));
		t.add(new Person(104, "David", "david@example.com"));
		t.add(new Person(105, "Eve", "eve@example.com")); // 
		t.add(new Person(106, "Alice", "alice@example.com"));
		System.out.println(t);//
		for(Person p:t) {
			System.out.println(p);
		}
	}
}
