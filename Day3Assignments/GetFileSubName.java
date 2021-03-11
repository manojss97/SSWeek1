/**
 * 
 */
package com.ss.week1.day3;

import java.io.File;

import java.nio.file.InvalidPathException;
import java.util.Scanner;

/**
 * @author manojpandey
 *
 */

public class GetFileSubName {
	
	/**
	 * uses .list() function to return all the filename and subdirectory name in an array and uses ForEach loop to print it
	 * 
	 * @param directory
	 */
	public void fileAndSub(File directory) {
		try {
		String [] fileAndDirectory = directory.list();
		for(String filename:fileAndDirectory) {
			System.out.println(filename);
		}
		
		}catch(NullPointerException e) {
			System.out.println("You have entered wrong path. Please enter again");
		}
		
	}
	
	/**
	 * Main method which gives the directory name and calls upon the method to get file and subdirectory name in given directory
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter correct file path of the directory you want the filename and subdirectory for: ");
		File directory= new File(input.nextLine());
		
		GetFileSubName gfs= new GetFileSubName();
		gfs.fileAndSub(directory);
		
	}

}
