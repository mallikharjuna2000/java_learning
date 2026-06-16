package com.codegnan.oopprogramming;

public class Student extends java.lang.Object {

	static final String name;
	static{
		name="babu";
	}
	final int age = 28;

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.name + "----" + s1.age);
	}

}
