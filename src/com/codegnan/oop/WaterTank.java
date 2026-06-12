package com.codegnan.oop;

import java.util.Scanner;

public class WaterTank {
	private int currentLevel = 0;
	private int maxLevel = 0;

	public void setCurrentLevel(int currentLevel) {//50 300 500 -999
		if (currentLevel >= 0 && currentLevel <= 500) {
			this.currentLevel = currentLevel;//500

			if (currentLevel > maxLevel) {// update maximum value/500>300
				maxLevel = currentLevel;//500
			}
		}
	}

	public int getCurrentLevel() {
		return currentLevel;
	}

	public int getMaxLevel() {
		return maxLevel;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		WaterTank waterTank = new WaterTank();
		int level;
		while (true) {
			level = scanner.nextInt();//600 700 -999
			if (level == -999) {
				break;
			}
			waterTank.setCurrentLevel(level);

		}
		System.out.println(waterTank.getCurrentLevel());
		System.out.println(waterTank.getMaxLevel());
		scanner.close();
	}
}
