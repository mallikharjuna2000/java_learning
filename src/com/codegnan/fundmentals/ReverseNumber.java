package com.codegnan.fundmentals;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int number = scanner.nextInt();// 1234
		int originalNumber = number;// 1234
		int reversedNumber = 0;
		while (number != 0) {// 4-->1>0
			int lastDigit = number % 10;// 1%10--1
			reversedNumber = reversedNumber * 10 + lastDigit;// 430+2-->4320+1-->4321
			number /= 10;// 1/10-->0.1
		}
		System.out.println("Reverse of a  given number : " + originalNumber + " is : " + reversedNumber);
		scanner.close();
	}
}
