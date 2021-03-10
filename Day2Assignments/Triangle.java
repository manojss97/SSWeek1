package com.ss.week1.day2;

/**
 * Triangle class which implements Shape interface and ovverrides calculateArea
 * and display method and Also contains a constructor to overload values of height
 * and base at the main method in ShameImpl.java
 * 
 * @author manojpandey
 *
 */

public class Triangle implements Shape {
	int height;
	int base;

	// Constructor with height and base parameter
	public Triangle(int height, int base) {
		this.height = height;
		this.base = base;
	}

	@Override
	public double calculateArea() {
		return (height * base) / 2;
	}

	@Override
	public void display() {
		System.out
				.println("The Area of triangle with height " + height + " and base " + base + " is " + calculateArea());

	}

}
