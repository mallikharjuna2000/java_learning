package com.codegnan.fundmentals;

import java.util.Scanner;

public class SimpleIntrestCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Principle Amount : ");
		double principal = scanner.nextDouble();
		System.out.println("Enter rate of intreset (in%) ");
		double rate = scanner.nextDouble();
		System.out.println("Enter Time in(Years ) : ");
		double time = scanner.nextDouble();
		double si = (principal * time * rate) / 100;
		double totalAmount = si + principal;
		System.out.println("Simple Intrest : " + si);
		System.out.println("Total Amount : " + totalAmount);
		scanner.close();
	}

}
