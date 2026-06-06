package com.codegnan.fundmentals;

public class DiamondPattern {
    public static void main(String[] args) {
        int rows = 5; // This 'rows' variable defines the height of HALF the diamond (the widest point)


        // --- PART 1: Upper part of the diamond (Full Pyramid) ---
        for (int i = 1; i <= rows; i++) { // Outer loop for rows (1 to 'rows')
            // Inner loop 1: Prints leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Inner loop 2: Prints stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println(); // New line after each row
        }


        // --- PART 2: Lower part of the diamond (Inverted Full Pyramid) ---
        // Notice 'i' starts from 'rows - 1' to avoid duplicating the widest row
        for (int i = rows - 1; i >= 1; i--) { // Outer loop for rows (from 'rows-1' down to 1)
            // Inner loop 1: Prints leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Inner loop 2: Prints stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println(); // New line after each row
        }
    }
}
