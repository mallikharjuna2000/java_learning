package com.codegnan.fundmentals;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number of Rows : ");
		int rows = scanner.nextInt();//2
		int[][] a = new int[rows][];
		for (int i = 0; i < rows; i++) {//0<2
			System.out.print("Enter number of columns for row " + i + " : ");//3
			int cols = scanner.nextInt();//3
			a[i] = new int[cols];

			
			for (int j = 0; j < cols; j++) {//0<3
				System.out.println("Enter " + i + " row "+j+" element");
				a[i][j] = scanner.nextInt();
			}
		}
		System.out.println("print the 2 array using for loop");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Print elements using eenhanced for loop");
		for (int[] x : a) {
			for (int y : x) {
				System.out.print(y);
			}
			System.out.println();
		}
		scanner.close();

		// int[][][] a={{{10,20,30},{40,50}},{{60},{70,80},{90,100,110}}};
		/*
		 * for(int i=0;i<a.length;i++) { for(int j=0;j<a[i].length;j++) { for(int
		 * k=0;k<a[i][j].length;k++) { System.out.print(a[i][j][k]+" "); }
		 * System.out.println(); } System.out.println(); }
		 */
		/*
		 * for(int [][]x:a) { for(int[] y:x) { for(int z:y) { System.out.print(z); }
		 * System.out.println(); } System.out.println(); }
		 */
	}
}
