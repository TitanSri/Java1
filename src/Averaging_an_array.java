/*
 * Averaging an array
 */

/**
 *
 * @author mano itc206
 */
public class Averaging_an_array {
    public static void main(String args[]) {
        // Create an array
        int [] intList = {1, 2, 3, 4, 5, 6};
        double [] doubleList = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
        
        // Display the average
        System.out.println("The average of the Integer list is " + 
                average(intList));
        System.out.println("The average of the Double list is " + 
                average(doubleList));
         // Display the smallest
        System.out.println("The smallest of the Integer list is " + 
                smallest(intList));
    }
    
    // Method for int
    public static int average(int [] array){
        // Declare sum
        int sum = 0;
        // Loop through the array when less than the length
        for (int i = 0; i < array.length; i++)
            // Sum equals sum plus number
            sum += array[i];
        // Return the average which is the sum divided by the length
        return sum / array.length;
    }
    // Method for double
    public static double average(double [] array){
        // Declare the sum
        double sum = 0;
        // Loop through the array while less than the length
        for (int i = 0; i < array.length; i++)
            // Sum equals sum plus the number
            sum += array[i];
        // Return average which is the Sum divided by the length 
        return sum / array.length;
    }
    
    // Method smallest in the array
    public static int smallest(int [] m){
        int smallest = m[0];       
        for (int i = 1; i < m.length; i++)
            // If smallest is more than the next number
            if (smallest > m[i])
                // new smallest number
                smallest = m[i];
        return smallest;
    }
}
