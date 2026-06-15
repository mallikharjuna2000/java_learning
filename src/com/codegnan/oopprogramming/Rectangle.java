package com.codegnan.oopprogramming;

public class Rectangle extends Figure {
	Rectangle(double a, double b) {
		super(a, b);
	}

	@Override
	public double area() {
		System.out.println("Inside area for rectangle");
		return dim1 * dim2;
	}
}
