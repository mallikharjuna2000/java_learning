package com.codegnan.oop;

public class BrewCafeDiscount {
	public static int calculateDiscount(int totalOrders) {
		if (totalOrders < 0) {
			return 0;
		}
		int discount = (int) (totalOrders * 0.10);
		if (discount > 100) {
			discount = 100;
		}
		return discount;
	}

	public int calculateOrderDiscount(int orderAmount) {
		if (orderAmount < 0) {
			return 0;
		}
		int discount;
		if (orderAmount < 50) {
			discount = (int) (0.05 * orderAmount);
		} else {
			discount = (int) (0.15 * orderAmount);
		}
		if (discount > 100) {
			discount = 100;
		}
		return discount;
	}
}
