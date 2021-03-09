package com.ss.week1.day1;

/**
 * 4 different Pattern Prints 
 * @author manojpandey
 *
 */

public class PatternPrint {
	
	
	/**
	 * Takes number of rows as parameter and prints "*"
	 * 
	 * @param a
	 */
	public static void patternOne(int a) {
		for (int i=0; i<a;i++)				//For loop for rows which increments per row
		{
			for(int j=0; j<=i; j++) {		//For loop for number of columns and printing "*" 
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/**
	 * Takes number of rows as parameter and prints "*"
	 * @param a
	 */
	public static void patternTwo(int a) {
		for (int i=a; i>=1;i--)				//For loop for rows which decrements per row
		{
			for(int j=1; j<=i; j++) {		//For loop for number of columns and printing "*"
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/**
	 * Takes number of rows as parameter and prints "*"
	 * @param a
	 */
	public static void patternThree(int a) {
		for (int i=1; i<=a;i++)		//For loop for rows which increments
		{
			for(int j=i;j<=a;j++) {	//for loop for spaces
				System.out.print(" ");
			}
			for(int j=1; j<=(i*2)-1; j++) {	//For loop for number of columns and printing "*" and increasing * by 2 per row
				System.out.print("*");
			}
			System.out.println();
		}
	}
	/**
	 * Takes number of rows as parameter and prints "*"
	 * @param a
	 */
	public static void patternFour(int a) {
		for (int i=a; i>=1;i--)		//For loop for rows  which decrements per row
		{
			for(int j=a;j>=i;j--) {	//for loop for spaces
				System.out.print(" ");
			}
			for(int j=1; j<=(i*2)-1; j++) {		//For loop for number of columns and printing "*" and decreasing * by 2 per row
				System.out.print("*");
			}
			System.out.println();
		}
	}
		

	
	
	/**
	 * Executes 4 methods for 4 different patterns of stars
	 * @param args
	 */
	public static void main(String[] args) {
		int a=4;
		patternOne(a);
		System.out.println(".........");
		patternTwo(a);
		System.out.println(".........");
		patternThree(a);
		System.out.println(".........");
		patternFour(a);
		
		
	}
	

}
