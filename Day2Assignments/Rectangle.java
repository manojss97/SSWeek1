/**
 * 
 */
package com.ss.week1.day2;

/**
 * Rectangle implements shapes interface and override calculate area and display
 * method and Also contains a constructor to overload values of length and width at
 * the main method in ShameImpl.java
 * 
 * @author manojpandey
 *
 */
public class Rectangle implements Shape {
	int length;
	int width;

	// Constructor with lenght and width parameter
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double calculateArea() {
		return length * width;

	}

	@Override
	public void display() {
		System.out.println(
				"The Area of Rectangle with length " + length + " and width " + width + " is " + calculateArea());

	}

}
