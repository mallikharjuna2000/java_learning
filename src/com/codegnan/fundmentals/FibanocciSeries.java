package com.codegnan.fundmentals;

import java.util.Scanner;

public class FibanocciSeries {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Number of terms in fibanoci series : ");
		int numberOfTerms = scanner.nextInt();// 10
		int firstTerm = 0, secondTerm = 1;
		System.out.println("Fibanocci Series : ");
		System.out.print(firstTerm + " " + secondTerm + " ");// 0 1
		for (int i = 2; i < numberOfTerms; i++) {
			int nextTerm = firstTerm + secondTerm;// 1+1-->2
			System.out.print(nextTerm + " ");
			firstTerm = secondTerm;// 1
			secondTerm = nextTerm;// 2 
		}
		scanner.close();

	}

}
