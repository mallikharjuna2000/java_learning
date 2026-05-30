package com.codegnan.fundmentals;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Student Mraks");
		int marks=scanner.nextInt();
		char grade=(marks>=90)?'A':
			(marks>=80)&&(marks<90)?'B':
				(marks>=70)?'C':
					(marks>=60)?'D':
						(marks>50)?'E':'F';
		System.out.println("Student Grade is : "+grade);
		scanner.close();

	}

}
