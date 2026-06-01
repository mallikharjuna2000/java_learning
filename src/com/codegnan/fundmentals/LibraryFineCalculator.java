package com.codegnan.fundmentals;

import java.util.Scanner;

public class LibraryFineCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();// code 1-3
		int y = scanner.nextInt();// days overdue
		if(y<=30) {
			y=y;
		}else {
			System.out.println("enter the day 1-30");
			return;
		}
		switch (x) {
		case 1:
			System.out.println(1 * y);
			break;
		case 2:
			System.out.println(2 * y);
			break;
		case 3:
			System.out.println(5 * y);
			break;
		default:
			System.out.println("Invalid Code ");
			break;
		}

		scanner.close();

	}

}
