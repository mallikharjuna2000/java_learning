package com.codegnan.fundmentals;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Student RollNumber : ");
		int rollNumber=scanner.nextInt();
		System.out.println("Enter Student Name : ");
		String name=scanner.next();
		System.out.println("Enter Student age : ");
		int age=scanner.nextInt();
		System.out.println("Enter Student Grade : ");
		char grade=scanner.next().charAt(0);
		System.out.println("Student Details");
		System.out.println("---------------------------------");
		System.out.println("Student Roll Number : "+rollNumber);
		System.out.println("Student Name : "+name);
		System.out.println("Student age : "+age);
		System.out.println("Student Grade : "+grade);
		scanner.close();

	}

}
