package com.codegnan.oop;

public class Box {
	double width;// instance
	double height;
	double depth;

	public Box() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Box(double width, double height, double depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	public Box(Box anotherBox) {
		height = anotherBox.height;
		width = anotherBox.width;
		depth = anotherBox.depth;
	}

	// instance method
	public void volume() {
		System.out.println("Box Height : " + this.height);
		System.out.println("Box Width : " + this.width);
		System.out.println("Box Depth : " + this.depth);
		double volume = this.width * this.depth * this.height;
		System.out.println("Box Volume is : " + volume);
	}

	public static void main(String[] args) {
		Box mybox1 = new Box();
		mybox1.volume();
		Box mybox2 = new Box(10.0, 5.0, 2.0);
		mybox2.volume();
		Box mybox3 = new Box(mybox2);
		mybox3.volume();
	}
}
