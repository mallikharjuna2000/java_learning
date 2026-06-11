package com.codegnan.oop;

import java.util.Scanner;

public class BookFineTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int days1 = scanner.nextInt();// days for method 1
		// values for method2
		int days2 = scanner.nextInt();
		String type1 = scanner.next();
		scanner.nextLine();
		// values for method 3
		int days3 = scanner.nextInt();
		int fixedCost = scanner.nextInt();
		// pass values for id constrructor
		int id1 = scanner.nextInt();
		// pass values for constructor2 id,type
		int id2 = scanner.nextInt();
		String type2 = scanner.next();
		Book book1 = new Book(id1);
		Book book2 = new Book(id2, type2);
		System.out.println(book1.calculateFine(days1));
		System.out.println(book1.calculateFine(days2, type1));
		System.out.println(book1.calculateFine(days3, fixedCost));
		System.out.println(book1.getId());
		System.out.println(book2.getId());

		scanner.close();

	}

}
