/**
 * 
 */
package com.ss.week1.day2;

/**
 * Simple class to implement other classes with main method by creating instance of those object
 * @author manojpandey
 *
 */
public class ShapeImpl {

	
	public static void main(String[] args) {
		
		Rectangle rectangle= new Rectangle(5,10);
		rectangle.display();
		Circle circle= new Circle(4);
		circle.display();
		Triangle triangle= new Triangle(2,3);
		triangle.display();
		
		
	}
}
