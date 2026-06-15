package com.codegnan.oopprogramming;

public class FindAreas {

	public static void main(String[] args) {
		Figure f = new Figure(10, 10); // Create a Figure object
		Rectangle r = new Rectangle(9, 5); // Create a Rectangle object
		Triangle t = new Triangle(10, 8); // Create a Triangle object
		Figure figref; // Reference variable of type Figure
		// figref refers to Rectangle object
		figref = r;
		// Calls Rectangle's overridden area() at runtime (dynamic method dispatch)
		System.out.println("Area is " + figref.area());
		// figref refers to Triangle object
		figref = t;
		// Calls Triangle's overridden area() at runtime
		System.out.println("Area is " + figref.area());
		// figref refers to Figure object
		figref = f;
		// Calls Figure's own area() method
		System.out.println("Area is " + figref.area());

	}

}
