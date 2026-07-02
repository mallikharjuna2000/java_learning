package com.codegnan.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethodsDemo {

	public static void main(String[] args) {
		Map<String, Integer> studentMarks = new HashMap<>();
		studentMarks.put("Arjun", 88);
		studentMarks.put("Ravi", 92);
		studentMarks.put("Sita", 79);
		studentMarks.put("Priya", 85);
		studentMarks.put("Rahul", 91);
		Map<String, Integer> newStudents = new HashMap<>();
		newStudents.put("Ananya", 95);
		newStudents.put("Vikram", 82);
		newStudents.put("Meera", 87);
		studentMarks.putAll(newStudents);
		System.out.println(studentMarks);
		System.out.println("Marks of Arjun : " + studentMarks.get("Arjun"));
		System.out.println("Removed Priya Marks : " + studentMarks.remove("Priya"));
		System.out.println("Is Sita Present ? : " + studentMarks.containsKey("Sita"));
		System.out.println("Any Student Scored 100? : " + studentMarks.containsValue(100));
		System.out.println("Is Map is Empty ? " + studentMarks.isEmpty());
	     System.out.println("Total Students : "+studentMarks.size());
	     Set<String> studentNames=studentMarks.keySet();
	     System.out.println("Student Names : "+studentNames);
	     Collection<Integer>marks=studentMarks.values();
	     System.out.println("Marks : "+marks);
	     Set<Map.Entry<String, Integer>>entries=studentMarks.entrySet();
	     System.out.println("All Entries");
	     for(Map.Entry<String, Integer>entry:entries) {
	    	 System.out.println(entry.getKey()+"---->"+entry.getValue());
	     }
	     studentMarks.clear();
	     System.out.println("Map is Empty : "+studentMarks.isEmpty());
	
	}

}
