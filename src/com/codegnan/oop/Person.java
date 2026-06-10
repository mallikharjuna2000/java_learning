package com.codegnan.oop;

import java.util.Scanner;

public class Person {
	int age;
	String name;

	

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public  Person(int age, String name) {
		//super();
		this.age = age;
		this.name = name;
	}

	public void personDetails() {
		System.out.println("Name is : "+name);
		System.out.println("Age is : "+age);
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int age=scanner.nextInt();
		String name=scanner.next();
		Person p1 = new Person(age, name);
		//System.out.println(" My Name is: " + p1.name + " Age is : " + p1.age);
		p1.personDetails();
		Person p2 = new Person(27, "arjun");
		System.out.println(p2);
		//System.out.println(" My Name is: " + p2.name + " Age is : " + p2.age);
		p2.personDetails();
		Person p3 = new Person();
		System.out.println(p3);
		p3.personDetails();
	}
}
