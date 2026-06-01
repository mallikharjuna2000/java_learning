package com.codegnan.fundmentals;

import java.util.Scanner;

public class ElectricityBillCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number of Units Electricity consumed : ");
		int units = scanner.nextInt();
		System.out.println("Are You Senior Citizen?(true/false) : ");
		boolean isSeniorCitizen = scanner.nextBoolean();

		double billAmount = 0;
		if (units <= 100) {
			billAmount = units * 1.5;
		} else {
			if (units <= 200) {
				billAmount = (100 * 1.5) + ((units - 100) * 2);
			} else {
				if (units <= 300) {
					billAmount = (100 * 1.5) + (100 * 2) + ((units - 200) * 3);
				} else {
					billAmount = (100 * 1.5) + (100 * 2) + (100 * 3) + ((units - 300) * 5);
				}
			}
		}
		double surcharge = 0;
		if (billAmount > 1000) {
			surcharge = billAmount * 0.10;
		}
		double discount = 0;
		if (isSeniorCitizen) {
			discount = (billAmount + surcharge) * 0.05;
		}
		double totalPayable = billAmount + surcharge - discount;
		System.out.println("Electricity Bill");
		System.out.println("-----------------------------------");
		System.out.println("Units consumed : " + units);
		System.out.println("Base Bill : " + billAmount);
		System.out.println("Surchargee : " + surcharge);
		System.out.println("Discount : " + discount);
		System.out.println("Total Payble Amount : " + totalPayable);
		scanner.close();

	}

}
