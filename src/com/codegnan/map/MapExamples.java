package com.codegnan.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples {

	public static void main(String[] args) {
		HashMap<Person, Integer> h = new HashMap<>();
		h.put(new Person(1, "malli", "arjun@gmail.com"), 666);
		h.put(new Person(7, "arjun", "malli@gmail.com"), 111);
		h.put(new Person(5, "neha", "sneha@gmail.com"), 000);
		h.put(new Person(3, "mounika", "shaa@gmail.com"), 999);
		h.put(new Person(8, "anusha", "anu123@gmail.com"), 777);
		h.put(new Person(6, "ravi", "ravi789@gmail.com"), 222);
		h.put(new Person(9, "divya", "divya007@gmail.com"), 333);
		h.put(new Person(2, "vikram", "vikram@gmail.com"), 555);
		h.put(new Person(10, "rajesh", "raju321@gmail.com"), 444);
		h.put(new Person(4, "priya", "priya555@gmail.com"), 888);
		System.out.println(h);
		System.out.println("Printing HashMap entities One By One");
		for(Map.Entry<Person, Integer>entry:h.entrySet()) {
			System.out.println(entry.getKey()+"---->"+entry.getValue());
		}
		LinkedHashMap<Person,Integer>h1=new LinkedHashMap<>();
		h1.put(new Person(1, "malli", "arjun@gmail.com"), 666);
		h1.put(new Person(7, "arjun", "malli@gmail.com"), 111);
		h1.put(new Person(5, "neha", "sneha@gmail.com"), 000);
		h1.put(new Person(3, "mounika", "shaa@gmail.com"), 999);
		h1.put(new Person(8, "anusha", "anu123@gmail.com"), 777);
		h1.put(new Person(6, "ravi", "ravi789@gmail.com"), 222);
		h1.put(new Person(9, "divya", "divya007@gmail.com"), 333);
		h1.put(new Person(2, "vikram", "vikram@gmail.com"), 555);
		h1.put(new Person(10, "rajesh", "raju321@gmail.com"), 444);
		h1.put(new Person(4, "priya", "priya555@gmail.com"), 888);
		System.out.println(h1);
		System.out.println("Printing LinkedHashMap entities One By One");
		for(Map.Entry<Person, Integer>entry:h1.entrySet()) {
			System.out.println(entry.getKey()+"---->"+entry.getValue());
		}
		TreeMap<Person, Integer> h2 = new TreeMap<>(new MyComparator());
		h2.put(new Person(1, "malli", "arjun@gmail.com"), 666);
		h2.put(new Person(7, "arjun", "malli@gmail.com"), 111);
		h2.put(new Person(5, "neha", "sneha@gmail.com"), 000);
		h2.put(new Person(3, "mounika", "shaa@gmail.com"), 999);
		System.out.println(h2);
		System.out.println("Printing TreeMap entities One By One");
		for(Map.Entry<Person, Integer>entry:h2.entrySet()) {
			System.out.println(entry.getKey()+"---->"+entry.getValue());
		}
	}

}
