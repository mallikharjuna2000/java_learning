package com.codegnan.fundmentals;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int number = scanner.nextInt();//1234
		int originalNumber = number;//1234
		int digitsum = 0;
		while (number > 0) {// 1-->1>0
			int lastDigit = number % 10;//12%10--1
			digitsum += lastDigit;//10
			number /= 10;//1/10-->0.1
		}
		System.out.println
		("sum of digits in a given number : " + originalNumber + " is : " + digitsum);
		scanner.close();
	}

}
