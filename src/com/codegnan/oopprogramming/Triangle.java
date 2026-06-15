package com.codegnan.oopprogramming;

public class Triangle extends Figure {
	Triangle(int a, int b) {
		super(a, b);
	}

	public double area() {
		System.out.println("Inside Area for Traingle");
		return (dim1 * dim2) / 2;
	}
}
