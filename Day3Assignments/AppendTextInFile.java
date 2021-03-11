/**
 * 
 */
package com.ss.week1.day3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Simple Program that appends the text in a existing file. User are asked to
 * give the text
 * 
 * @author manojpandey
 *
 */
public class AppendTextInFile {

	/**
	 * Method that provices functionalites to append to a file
	 * 
	 * @param input
	 * @throws IOException 
	 */

	public void append(File filePath, String texts) throws IOException {
		FileWriter fileWriter=null;
		BufferedWriter bufferedWriter=null;
		PrintWriter printWriter = null;
		try {
			fileWriter = new FileWriter(filePath, true);
			bufferedWriter = new BufferedWriter(fileWriter);
			printWriter = new PrintWriter(bufferedWriter);
			printWriter.println(texts);
			System.out.println("Text Has been Appending. You have added '"+texts+"' to your file");
		} catch (FileNotFoundException e) {
			System.out.println("The FIle doesn't exist. Try Again");
			
		} catch (NullPointerException ne) {
			System.out.println("You have entered a wrong file path: please enter again ");
		}
		finally {
			printWriter.close();
			bufferedWriter.close();
			fileWriter.close();
		}

	}

	/**
	 * Main method that asks user what to input in the file and run the append()
	 * method
	 * 
	 * @param args
	 * @throws IOException 
	 */

	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter correct file path for a file you want to append: ");
		File filePath= new File(input.nextLine());
		System.out.println("Enter the Sentences you want appending to the file");
		String texts = input.nextLine();
		AppendTextInFile atf= new AppendTextInFile();
		atf.append(filePath,texts);
		

	}

}
