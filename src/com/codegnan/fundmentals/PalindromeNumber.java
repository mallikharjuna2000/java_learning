package com.codegnan.fundmentals;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int number = scanner.nextInt();// 1234
		int originalNumber = number;// 1234
		int reversedNumber = 0;
		while (number > 0) {// 4-->1>0
			int lastDigit = number % 10;// 1%10--1
			reversedNumber = reversedNumber * 10 + lastDigit;// 430+2-->4320+1-->4321
			number /= 10;// 1/10-->0.1
		}
		if(originalNumber==reversedNumber) {
			System.out.println("The Given Number "+originalNumber+" is Palindrome");
		}else {
			System.out.println("The Given Number "+originalNumber+" is not Palindrome");
		}
		scanner.close();
		
	}
}
