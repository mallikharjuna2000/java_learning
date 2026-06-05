package com.codegnan.fundmentals;

import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int number = 152;// 
		int originalNumber = number;// 
		int sum = 0;
		while (number != 0) {//1!=0 
			int lastDigit = number % 10;//1%10-->1
			sum+=lastDigit*lastDigit*lastDigit;//3*3*3-->27+125=>152+1-->153
			number /= 10;//1/10-->0.1
		}
		if(originalNumber==sum) {
			System.out.println("The Given Number "+originalNumber+" is an Amstrong");
		}else {
			System.out.println("The Given Number "+originalNumber+" is not ArmStrong");
		}
		scanner.close();
	}
}
