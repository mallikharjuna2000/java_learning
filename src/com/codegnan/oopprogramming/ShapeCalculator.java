package com.codegnan.oopprogramming;

public class ShapeCalculator {
	public static void main(String[] args) {
		Shape shape = new Shape();
		Cube cubeInstance = new Cube();
		Cuboid cuboidInstance = new Cuboid();
		shape.calculateVolume();
		cubeInstance.calculateVolume();
		cuboidInstance.calculateVolume();
	}
}
