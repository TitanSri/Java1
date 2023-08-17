/*********************************************************************************
* (Sum the areas of geometric objects) Write a method that sums the areas of all *
* the geometric objects in an array. The method signature is:                    *
*                                                                                *
* public static double sumArea(GeometricObject[] a)                              *
*                                                                                *
* Write a test program that creates an array of four objects (two circles and    *
* two rectangles) and computes their total area using the sumArea method.        *
*********************************************************************************/

/**
 *
 * @author jsquared21
 */
public class Chapter13_12_Sum_Of_The_Areas_Geometric_Objects {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Create fouor objects
        GeometricObject_V2[] array = {new Circle(5), new Circle(80),
                        new Rectangle(3,4), new Rectangle(4,2)};
        
        //Display the results
        System.out.println("Total area of the elements in array: " + sumArea(array));
    }
    
    // Return the sum of all the objects in the array's area
    public static double sumArea(GeometricObject_V2[] a){
        double sum = 0;
        for (int i = 0; i < a.length; i++){
            sum += a[i].getArea();
        }
        return sum;
    }
}
