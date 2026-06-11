package com.codegnan.oop;

public class FitCalories {
	int id;
	String type;

	public FitCalories(int id) {
		super();
		this.id = id;
	}

	public FitCalories(int id, String type) {
		super();
		this.id = id;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public int calculateCalories(int hours) {
		int calories = hours * 100;
		return Math.min(calories, 1000);
	}

	public int calculateCalories(int hours, String type) {
		int calories = 0;
		if (type.equalsIgnoreCase("cardio")) {
			calories = hours * 120;
		} else {
			if (type.equalsIgnoreCase("strength")) {
				calories = hours * 80;
			}
		}
		return Math.min(calories, 1000);
	}

	public int calculateCalories(int hours, int fixedCalories) {
		int calories = hours * 100 + fixedCalories;
		return Math.min(calories, 1000);
	}
}
