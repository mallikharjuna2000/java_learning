package com.codegnan.oop;

import java.util.Scanner;

public class FitCaloriesTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// hours for meethod1
		int hour1 = scanner.nextInt();
		// hours and type for method2
		int hour2 = scanner.nextInt();
		String type1 = scanner.next();
		scanner.nextLine();
		// hours and fixedCalories forr method3
		int hour3 = scanner.nextInt();
		int fixedCalories = scanner.nextInt();
		// id for constructor 1
		int id1 = scanner.nextInt();
		// id and type for cosntructor 2
		int id2 = scanner.nextInt();
		String type2 = scanner.next();
		FitCalories fc1 = new FitCalories(id1);
		FitCalories fc2 = new FitCalories(id2, type2);
		System.out.println(fc1.calculateCalories(hour1));
		System.out.println(fc1.calculateCalories(hour2, type1));
		System.out.println(fc1.calculateCalories(hour3, fixedCalories));
		System.out.println(fc1.getId());
		System.out.println(fc2.getId());

		scanner.close();

	}

}
