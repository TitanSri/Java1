/****************************************
 *        ITC206_A2_Task_1              *
 * -------------------------------------*
 * mark():                             *
 * testMarks[]: int                    *
 * max: int                            *
 * min: int                            *
 * range: int                          *
 * mean: int                           *
 * median: int                         *
 * mode: int                           *
 * grades[]: char                      *
 * gradeDistn[]: int                   *
 * **************************************
 */

/**
 *
 * @author Toby Sriratanakoul
 */

import java.util.*;


public class ITC206_A2_Task_1 {
	public static void main(String args[]) {
        
        // Create an object for mark
	Marks mark = new Marks(); 
        // Create a new array from marks
        int[] testMarks = mark.getMarks();
            /* Display array for testing
            // Loop the arrary index from 0 to the length
            for (int n = 0; n < testMarks.length; n++) {
                    System.out.print(testMarks[n] + " ");
                    // Print a new line if the index + 1 divided by 30 equals zero
                    if ((n+1) % 30 == 0)
                            System.out.println();
            }
            */
        
        // Declare max and display the maximum mark
        int max = ProcessMarks.max(testMarks);
        System.out.println("\n\nThe max for all marks is: " + max);
        
        // Declare min and display the minimum mark
        int min = ProcessMarks.min(testMarks);
        System.out.println("\nThe min for all marks is: " + min);
        
        // Declare range and display the range from min to max
        int range = ProcessMarks.range(testMarks);
        System.out.println("\nThe range for all marks is: " + range);
        
        // Declare the mean and diplay the mean(average)
        int mean = ProcessMarks.mean(testMarks);
        System.out.println("\nThe mean for all marks is: " + mean);
                  
        // Declare the median and display the median
        int median = ProcessMarks.median(testMarks);
        System.out.println("\nThe median for all marks is: " + median);
        
        // Display the mode
        // The highest count of an indiviual mark from the sorted array within the class)
        System.out.println("\nThe mode for all the marks is: " + ProcessMarks.mode() + "\n");
        
        // Create a grades array
        char grades[] = ProcessMarks.grades(testMarks);
        
        // Display the grades
        // Loop the arrary index from 0 to the length
        for (int n = 0; n < grades.length; n++) {
            System.out.print(grades[n] + " ");
            // Print a new line if the index + 1 divided by 30 equals zero
            if ((n+1) % 30 == 0)
                System.out.println();
            }
        
        
        // Display the number of grades
        int gradeDistn[] = ProcessMarks.gradeDistn(grades);
        System.out.println("\n\nA: " + gradeDistn[0]);
        System.out.println("B: " + gradeDistn[1]);
        System.out.println("C: " + gradeDistn[2]);
        System.out.println("D: " + gradeDistn[3]);
        System.out.println("E: " + gradeDistn[4]);
        System.out.println("\nF: " + gradeDistn[5]);
    
    }
    
}
         