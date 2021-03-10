package com.ss.week1.day2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Simple Program that asks user for total amounts of numbers and the sum of
 * those numbers
 *
 */
public class SumOfCommandLines {

	/**
	 * Method asks user to enter numbers based on total amount of number they
	 * decided
	 * 
	 * @param totalAmounts
	 */

	public void sumOfNumbers(int totalAmounts) {
		Scanner scanner = new Scanner(System.in);
		double a = 0, sum = 0;
		boolean b = true;

		while (b) {
			try {
				for (int i = 1; i <= totalAmounts; i++) {
					System.out.println("Enter Number: ");
					a = scanner.nextDouble();
					sum += a;
				}
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid Number. Enter Valid numbers");
				sum = 0; // Resets the sum
				scanner.next();

			}
		}
		System.out.println("Sum of numbers you inputed is: " + sum);

	}

	/**
	 * Main method First asks user for total amount of numbers calls in sumOfNumbers
	 * method to get the sum of numbers inputed by user
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean valid = true;
		int totalAmounts = 0;
		do {
			try {
				System.out.println("Enter Total amount of number you want summed: ");
				totalAmounts = input.nextInt();
				break;
			} catch (InputMismatchException e) {
				valid = false;
				System.out.println("You have entered wrong value.");
				input.next();
			}
		} while (!valid);

		SumOfCommandLines soc = new SumOfCommandLines();
		soc.sumOfNumbers(totalAmounts);
	}
}
