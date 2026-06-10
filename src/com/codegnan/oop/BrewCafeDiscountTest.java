package com.codegnan.oop;

import java.util.Scanner;

public class BrewCafeDiscountTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int totalOrders = scanner.nextInt();
		int orderAmount = scanner.nextInt();
		int staticDiscount = BrewCafeDiscount.calculateDiscount(totalOrders);
		BrewCafeDiscount bcf = new BrewCafeDiscount();
		int instanceDiscount = bcf.calculateOrderDiscount(orderAmount);
		System.out.println(staticDiscount + " " + instanceDiscount);
		scanner.close();
	}

}
