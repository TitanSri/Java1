/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jsquared 
 */
public class Chapter13_5_Enable_GeometricObject_Comparable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		// Create two Circle objects
		Circle circle1 = new Circle(15, "red", true);
		Circle circle2 = new Circle(10, "blue", false);

		// Display circle1
		System.out.println("\nCircle 1: ");
		print(circle1);

		// Display circle2
		System.out.println("\nCircle 2: ");
		print(circle2);

		// Display larger circle
		print("\nThe larger of the two circles was ");
		print(Circle.max_V2(circle1, circle2));

		// Create two Rectangle objects
		Rectangle rectangle1 = new Rectangle(4, 5, "green", true);
		Rectangle rectangle2 = new Rectangle(4.2, 5, "orange", true);

		// Display circle1
		System.out.println("\nRectangle 1: ");
		print(rectangle1);

		// Display circle2
		System.out.println("\nRectangle 2: ");
		print(rectangle2);

		// Display larger circle
		print("\nThe larger of the two rectangles was ");
		print(Rectangle.max_V2(rectangle1, rectangle2));
	}

	// Displays a string
	public static void print(String s) {
		System.out.println(s);
	}

	// Displays a GeometricObject
	public static void print(GeometricObject_V2 o) {
		System.out.println(o);
	}
}