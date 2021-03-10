/**
 * 
 */
package com.ss.week1.day2;

/**
 * Cricle class which implements Shape interface and Ovverrides calculate area
 * and display method and Also contains a constructor to overload values of radius
 * at the main method in ShameImpl.java
 * 
 * @author manojpandey
 *
 */
public class Circle implements Shape {
	int radius;

	// Counstructor with radius parameter
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {

		return Math.PI * radius * radius;
	}

	@Override
	public void display() {
		System.out.println("The Area of Circle with radius " + radius + " is " + calculateArea());

	}

}
