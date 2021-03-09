package com.ss.week1.day1;

import java.util.Random;
import java.util.Scanner;

/**
 * Checks user guesses with random number generated between 1-100
 * @author manojpandey
 *
 */

public class RandomGuess {
	
	/**
	 * Method which takes users input and checks to see if its correct with the random number generated
	 * Uses Do While loop to executing the for loop 
	 */
	
	public  void guessingNumber() {
		
		
		Scanner input= new Scanner(System.in);
		Random rand= new Random();
		int correctAnswer= rand.nextInt(100)+1;
		int tries= 5;
		int guess;
		int i;
		
			for(i=0; i<tries;i++) {			//For loop to iterate 5 time if the user guess is wrong
				System.out.println("Your Guess: ");
				guess= input.nextInt();
				
				if(Math.abs(guess-correctAnswer)<=10) {				//If the guess is within 10 then it will stop and show results
					System.out.println("You were within range of 10 of correct answer. The correct number is "+correctAnswer);
					break;
				}	
				else if(correctAnswer==guess) {			//If the guess is same then it program will print it and stop
				System.out.println("Spot on! Your guess of "+guess+" is correct"+correctAnswer);
				break;
				}
				else {			//In other cases user will be asked to input another guess
				System.out.println("Your guess of "+guess+" is out of range. Try Again");
				}	
			}
				if (i==tries) {			
				System.out.println("\nSorry! Your ran out of all your tries. The correct Number is: "+correctAnswer);	
			}
}
	
	/*
	 * Main Method for executing guessing number method
	 */
	
	public static void main(String[] args) {
		System.out.println("Guess a number Between 1-100");
		RandomGuess rg= new RandomGuess();
		rg.guessingNumber();

}
}
