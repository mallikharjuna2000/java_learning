package com.codegnan.fundmentals;

import java.util.Scanner;

public class CalculateRemainAmount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter the purchase amount
		System.out.print("Enter the purchase amount in ₹: ");
		double purchaseAmount = scanner.nextDouble();

		// Applying discount based on purchase amount using conditional operators
		double discount = (purchaseAmount >= 100) ? 0.2 : (purchaseAmount >= 50) ? 0.1 : 0.0;

		// Calculating remaining amount after applying discount
		double discountAmount = purchaseAmount * discount;
		double remainingAmount = purchaseAmount - discountAmount;

		// Calculate percentage discount
		double percentDiscount = discount * 100;

		// Output the remaining amount and percentage discount
		System.out.println("Amount after applying " + percentDiscount + "% discount: ₹" + remainingAmount);
		System.out.println("Discount applied: ₹" + discountAmount);

		scanner.close();
	}

}
