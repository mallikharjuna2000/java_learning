package com.codegnan.oop;

public class Box {
	double width;// instance
	double height;
	double depth;

// instance method
	public void volume() {
		System.out.println("Box Height : " + height);
		System.out.println("Box Width : " + width);
		System.out.println("Box Depth : " + depth);
		double volume = width * depth * height;
		System.out.println("Box Volume is : " + volume);
	}

	public static void main(String[] args) {
		Box mybox1 = new Box();
		mybox1.volume();
		Box mybox2 = new Box();
		mybox2.height = 10.0;
		mybox2.width = 12.0;
		mybox2.depth = 2.0;
		mybox2.volume();
	}
}
