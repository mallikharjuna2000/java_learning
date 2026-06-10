package com.codegnan.oop;

public class Car {
	private String modeel;
	private String year;
	private String color;

	public Car() {
		this("","");
		System.out.println("0 para");
		// TODO Auto-generated constructor stub
	}

	public Car(String modeel, String year, String color) {
		System.out.println("3 para");
		this.modeel = modeel;
		this.year = year;
		this.color = color;
	}

	public Car(String year, String color) {
		this("","","");
		System.out.println("2 para");
		this.year = year;
		this.color = color;
	}

	public void dispolayCarDetails() {
		System.out.println("Model : " + modeel);
		System.out.println("Year : " + year);
		System.out.println("Color : " + color);
	}

	public static void main(String[] args) {
		Car c1 = new Car("seira","2019","red");
		c1.dispolayCarDetails();

	}

}
