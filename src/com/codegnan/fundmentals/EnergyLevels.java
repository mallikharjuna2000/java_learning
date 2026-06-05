package com.codegnan.fundmentals;

import java.util.Scanner;

public class EnergyLevels {

	public static void main(String[] args) {
		// Create Scanner object to read input
		Scanner scanner = new Scanner(System.in);

		// Read starting item ID
		int s = scanner.nextInt();

		// Read number of non-defective items to process
		int n = scanner.nextInt();

		// Read divisor used to identify defective items
		int k = scanner.nextInt();

		// Read safety limit
		int m = scanner.nextInt();

		// Variable to store the total sum
		int sum = 0;

		// Variable to count valid (non-defective) items processed
		int count = 0;

		// Start checking item IDs from s onwards
		for (int i = s; count < n; i++) {

			// Skip the item if it is defective
			// An item is defective if it is divisible by k
			if (i % k == 0) {
				continue;
			}

			// Add the valid item ID to the sum
			sum += i;

			// Increase the count of processed valid items
			count++;

			// Stop processing if the sum reaches or exceeds the safety limit
			if (sum >= m) {
				break;
			}
		}

		// Display the final sum
		System.out.println(sum);

		// Close the Scanner object
		scanner.close();

	}

}
