package com.codegnan.collectionframework;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateRemover {
	public static void main(String[] args) {
		// Create a Scanner object to take user input
		Scanner scanner = new Scanner(System.in);
		// Create an ArrayList to store all entered integers
		ArrayList<Integer> numbers = new ArrayList<>();
		// Keep reading integers from the input until no more are available
		while (scanner.hasNextInt()) {
			// Add each entered integer to the numbers list
			numbers.add(scanner.nextInt());
		}
		// Print all the entered numbers (including duplicates)
		for (Integer a : numbers) {
			System.out.print(a + " ");
		}
		// Print a newline to separate the original list from the unique list
		System.out.print("\n");
		// Create a new ArrayList to store unique integers (duplicates will be removed)
		ArrayList<Integer> uniqueList = new ArrayList<>();
		// Iterate through the numbers list to remove duplicates
		for (Integer i : numbers) {
			// Add the number to uniqueList only if it's not already present
			if (!uniqueList.contains(i)) {
				uniqueList.add(i);
			}
		}
		// Print the unique numbers (no duplicates)
		for (Integer j : uniqueList) {
			System.out.print(j + " ");
		}
		// Close the scanner to free resources
		scanner.close();
	}

}
