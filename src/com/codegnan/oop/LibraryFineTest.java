package com.codegnan.oop;

import java.util.Scanner;

public class LibraryFineTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int daysOverdue = scanner.nextInt();
		int days = scanner.nextInt();
		String bookType = scanner.next();
		int staticFine = LibraryFineCalculator.calculateTotalFine(daysOverdue);
		LibraryFineCalculator calculator = new LibraryFineCalculator();
		int instanceFine = calculator.calculateBookFine(days, bookType);
		System.out.println(staticFine + " " + instanceFine);
		scanner.close();
	}
}
