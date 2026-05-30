package com.codegnan.fundmentals;

import java.util.Scanner;

public class TaxiFare {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Distance traveed in(kilometers) : ");
		double distance=scanner.nextDouble();
		double fare=(distance<=2)?50:
			           (distance<=10)?(50+(distance-2)*15):
			        	   (50+(8*15)+(distance-10)*10);
		fare=(distance>20)?fare*0.95:fare;
		System.out.println("Total Fare : "+fare);
		scanner.close();

	}

}
