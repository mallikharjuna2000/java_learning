package com.codegnan.fundmentals;

import java.util.Scanner;

public class RectangleStarPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number of rows ");
		int rows = scanner.nextInt();
		System.out.println("Enter Number of Columns : ");
		int cols = scanner.nextInt();
		// outer for loop always talks about rows
		for (int i = 1; i <= rows; i++) {
			// inner for loop always talks about columns
			for (int j = 1; j <=cols; j++) {
				//System.out.print("*"+" ");
				//System.out.print(i+" ");
				//System.out.print((rows-i)+" ");
				//System.out.print(j+" ");
				//System.out.print((cols-j)+" ");
				//System.out.print((char)(96+i)+" ");
				//System.out.print((char)(102-i)+" ");
				//System.out.print((char)(96+j)+" ");
				//System.out.print((char)(102-j)+" ");
				//System.out.print((char)(97+j)+ " ");
				//System.out.print("*"+" ");
				
			}
			System.out.println();
		}
		scanner.close();
	}
}
