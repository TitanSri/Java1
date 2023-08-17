/*
 * Area of a polygon
 */

/**
 *@author mano itc 206
 */
import java.util.*;

public class AreaOfPolygon {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        //Enter the number of sides
        System.out.println("Enter the number of sides" );
        int numberOfSides = input.nextInt();
        
        System.out.println("Enter the side length: ");
        double side = input.nextDouble();
        
        System.out.println("The area of the polygon with " + numberOfSides + 
                " sides and length " + side + " is: " + 
                area(numberOfSides, side));
    }
    
    //Method area
    public static double area(int n, double side){
        return n * side * side / (Math.tan(Math.PI / n) * 4);
    }
}
