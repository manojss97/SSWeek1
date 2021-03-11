/**
 * 
 */
package com.ss.week1.day3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Simple Program that asks user for a character, reads the file and gives the
 * count of how many times it shows up
 * 
 * @author manojpandey
 *
 */
public class CountChar {
	

	public void countGivenCharacter(char charValue) throws IOException {
		File file = new File("/Users/manojpandey/Desktop/NormalFile.txt");
		FileReader fileReader;
		BufferedReader bufferedReader;
		int count=0;
		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			String words = null;
			while ((words = bufferedReader.readLine()) != null) {
				for (int i = 0; i < words.length(); i++) {
					if (words.charAt(i) == charValue) {
						count++;
					}
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Fle Cannot Be found! Please try again");

		}System.out.println("The character '"+charValue+"' Shows up "+count+" times in the file");

	}

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		boolean valid = true;
		char charValue = ' ';
		do {
			try {
				System.out.println("Please Enter a Character you want to check the count of");
				charValue = input.next(".").charAt(0);
				break;
			} catch (InputMismatchException e) {
				valid = false;
				System.out.println("You didnt enter char Value Enter again");
				input.next();
			}
		} while (!valid);

		CountChar cc = new CountChar();
		cc.countGivenCharacter(charValue);

	}

}
