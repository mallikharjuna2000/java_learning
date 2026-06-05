package com.codegnan.fundmentals;

public class FrequencyCounter {

	public static void main(String[] args) {

		// Array containing duplicate elements
		int[] array = { 1, 2, 3, 2, 1, 4, 3, 5, 1 };

		// Boolean array to keep track of elements
		// that have already been counted
		boolean[] processed = new boolean[array.length];

		// Traverse each element in the array
		for (int i = 0; i < array.length; i++) {

			// If the current element is already counted,
			// skip it and move to the next element
			if (processed[i]) {
				continue;
			}

			// Initialize frequency count as 1
			// because the current element itself is counted
			int count = 1;

			// Compare the current element with the remaining elements
			for (int j = i + 1; j < array.length; j++) {

				// If a duplicate element is found
				if (array[j] == array[i]) {

					// Increase frequency count
					count++;

					// Mark the duplicate element as processed
					processed[j] = true;
				}
			}

			// Display the frequency of the current element
			System.out.println(array[i] + " occurs " + count + " times");
		}
	}
}