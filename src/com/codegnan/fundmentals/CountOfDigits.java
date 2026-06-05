package com.codegnan.fundmentals;

import java.util.Scanner;

public class CountOfDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int number = scanner.nextInt();//123
		int originalNumber=number;
		int count = 0;
		while (number != 0) {// 12!=0
			number = number / 10;// number=12/10-->0
			count++;// 3
		}
		System.out.println
		("the count of digits in a given number : " + originalNumber + " is " + count);
		scanner.close();
	}
}
