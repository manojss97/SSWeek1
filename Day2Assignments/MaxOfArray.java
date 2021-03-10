package com.ss.week1.day2;

/**
 * Simple program to find maximum value in 2D array and its index
 * 
 * @author manojpandey
 *
 */
public class MaxOfArray {

	/**
	 * Method which uses for loop to find out the max elemnt and index of the 2d array 
	 * 
	 * @param arr
	 */

	public void arrayMaxAndIndex(int[][] arr) {
		int maxArray = arr[0][0];
		int row = 0;
		int column = 0;

		// For loop to find the max element and its index
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (maxArray < arr[i][j]) {
					maxArray = arr[i][j];
					row = i;
					column = j;
				}
			}
		}
		System.out.println("Maximum value in the array is: " + maxArray);
		System.out.println("The index of the max value of the array is [" + row + "][" + column + "]");
	}

	public static void main(String[] args) {
		int arr[][] = { { 1, 2 }, { 3, 4 }, { 5, 10 }, { 7, 8 }, { 2, 1 } };

		MaxOfArray mof = new MaxOfArray();
		mof.arrayMaxAndIndex(arr);
	}

}
