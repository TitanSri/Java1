/*
 * Evaluate the sum of each row in a 4 by 4 matrix 
 * And the total of the elements
 */
import java.util.*;
/**
 * @mano itc206
 */
public class TestSumRow {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("\nEnter a 3 by 4 matrix row by row: ");
        //new array with 3 rows and 4 columns
        double [][] m = new double[4][4];
        //print how many rows
        System.out.println(m.length);
        //print how many index in row 0
        System.out.println(m[0].length);
        
        //fill the array up
        //loop througth the array length, number of rows which is 3
        for (int i = 0; i < m.length; i++)
            //loop through the each 4 index in the row, length of row
            for (int j = 0; j < m[i].length; j++)
                //insert the number into the array
                m[i][j] = input.nextDouble();
        
        //loop through each row
        for (int j = 0; j < m.length; j++){
            //print the sum of each row
            System.out.println("Sum of the elements at row " + j + " is " +
                    sumRow(m, j));
        }
        
        // Display the total of elements
        System.out.println("The total of elements is :" + sumElements(m));
    }
    
    //Method sum of each row
    public static double sumRow(double[][] m, int rowIndex){
        //declare the total
        double total = 0;
        
        //loop through the index in the arugment (row number)
        for (int i = 0; i < m[rowIndex].length; i++)
            //add the number in the index to the total
            total += m[rowIndex][i];
        
        //return the total
        return total;
    }
    
    // Method sum of elements 
    public static double sumElements(double[][] m){
        double sum = 0;
        // Loop the row length
        for (int i = 0; i < m.length; i ++){
            // Loop the index length
            for (int j = 0; j < m[i].length; j++){
                sum += m[i][j];
            }
        }
        return sum;
    }
}
