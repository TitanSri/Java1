/*********************************************************************************
* (The Rectangle class) Following the example of the Circle class in Section 9.2,*
* design a class named Rectangle to represent a rectangle. The class contains:   *
*                                                                                *
* ■ Two double data fields named width and height that specify the width and     *
* height of the rectangle. The default values are 1 for both width and height.   *
* ■ A no-arg constructor that creates a default rectangle.                       *
* ■ A constructor that creates a rectangle with the specified width and height.  *
* ■ A method named getArea() that returns the area of this rectangle.            *
* ■ A method named getPerimeter() that returns the perimeter.                    *
*                                                                                *
* Draw the UML diagram for the class and then implement the class. Write a test  *
* program that creates two Rectangle objects—one with width 4 and height 40      *
* and the other with width 3.5 and height 35.9. Display the width, height, area, *
* and perimeter of each rectangle in this order.                                 *
*********************************************************************************/

/* Rectangle.java
    Create a triangle class. Rectangle.java
    Two data fields named witdth and height, both = 1.
    A no argument constructor that created a default rectangle.
    A method named getArea() that returns the area of this rectangle.
    A method named getPerimeter() that returns the perimeter. 
*/

/**
 * 
 * @author Toby Sriratanakoul
 */
public class Chapter9_1_The_Rectangle_Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        //Create constructor rectangles array with 2 objects
        Rectangle [] rectangles= new Rectangle[2];
        
        //Create a Rectangle with width 4 and height 40
        rectangles[0] = new Rectangle(4,40);
        
        //Create a Rectangle with width 3.5 and height 35.9
        rectangles[1] = new Rectangle(3.5,35.9);
        
        //Display the width, height, area, and perimeter of rectangles object 0 from array
        System.out.println("\n Rectangle 1");
        System.out.println("-------------");
        System.out.println("Width:      " + rectangles[0].width);
        System.out.println("Height:     " + rectangles[0].height);
        System.out.println("Area:       " + rectangles[0].getArea());
        System.out.println("Perimeter:  " + rectangles[0].getPerimeter());
        
        //Display the width, height, area, and perimeter of rectangles object 1 from array
        System.out.println("\n Rectangle 1");
        System.out.println("-------------");
        System.out.println("Width:      " + rectangles[1].width);
        System.out.println("Height:     " + rectangles[1].height);
        System.out.println("Area:       " + rectangles[1].getArea());
        System.out.println("Perimeter:  " + rectangles[1].getPerimeter());
    }
}
