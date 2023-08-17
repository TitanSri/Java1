/*********************************************
 *      ProcessMarks                         *
 * ------------------------------------------*
 * <<constructor>>ProcessMarks()            *
 * -__sortedArray[int]__                     *
 * +max(int[]): int                          *
 * +min(int[]): int                          *
 * +range(int[]): int                        *
 * +mean(int[]): int                         *
 * +median(int[]): int                       *
 * +mode(int[]): int                         *
 * +grades(int[]): char[]                    *
 * +gradeDistn(int[]): int[]                 *
 * *******************************************
 */
import java.util.*;
/**
 *
 * @author Toby Sriratanakoul
 */
public class ProcessMarks {
    
    //Create a default no-arg constructor
    ProcessMarks(){
    }
    // Create a new array which will be sorted
    private static int sortedArray [];
    
    // ***Accessors***
    // Max method
    public static int max(int[] inputArray){
        // Declare the first index of the input array as the max value
        int maxValue = inputArray[0];
        // Loop thorugh the array
        for(int i = 1; i < inputArray.length; i++){
            // If the value in the index is more than the max value
            if(inputArray[i] > maxValue){
                // Change the max value to the value in the index
                maxValue = inputArray[i];
            }
        }
        // Return the max value
        return maxValue;        
    }
    
    // Min method, same as above
    public static int min(int[] inputArray){
        int minValue = inputArray[0];
        for(int i = 1; i < inputArray.length; i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;        
    }
    
    // Range method, same as above however returns the value of max minus the min
    public static int range(int[] inputArray){
        int minValue = inputArray[0];
        for(int i = 1; i < inputArray.length; i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        int maxValue = inputArray[0];
        for(int i = 1; i < inputArray.length; i++){
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
        }
        return (maxValue - minValue);        
    }
    
    // Mean method
    public static int mean(int[] inputArray){
        // Declare the sum as zero
        int sum = 0;
        // Loop through the array
        for(int i = 0; i < inputArray.length; i++){
            // Add each number to the sum
            sum += inputArray[i];
        }
        // Return the sum divided by the length of the array
        return (sum / inputArray.length);        
    }
    
    // Median method
    public static int median(int[] inputArray){
        // Declare i with the middle index number
        int i = inputArray.length / 2;   
        // Keep the orignal inputarray as it is, use copyOf to copy to the sortArray
        sortedArray = Arrays.copyOf(inputArray, inputArray.length);
        // Sort the temp array
        Arrays.sort(sortedArray);
        /* Display median array for testing
        // Loop the arrary index from 0 to the length
        for (int n = 0; n < sortedArray.length; n++) {
            System.out.print(sortedArray[n] + " ");
            // Print a new line if the index + 1 divided by 30 equals zero
            if ((n+1) % 30 == 0)
                System.out.println();
            }
        */
        // If the array length is even
        if (inputArray.length % 2 == 0){
            // Add the two middle index value and divide by two
            int median = (sortedArray[i] + sortedArray[i + 1]) / 2;
            // return the median
            return median;
        }  
        // Return the middle index value
        return sortedArray[i + 1];        
    }
    
    // Mode method
    public static int mode(){
        // Declare the max index value count to zero
        int maxIndex = 0;
        // Create a temp array for 0 to 100
        int tempArray [] = new int[101];
        // Loop the private sorted array
        for(int i = 0; i < sortedArray.length; i++){
            // Decalre the number to the index value
            int num = sortedArray[i];
            // Insert number into the temp array[number] and increment the value
            tempArray[num]++;
        }
        /* Display the tempArray for testing 
        System.out.println(Arrays.toString(tempArray));
        */
        /*Display number of times results for testing
        for (int i = 0; i < tempArray.length; i++) {
            if (tempArray[i] > 0)
                System.out.println((i) + " occurs " + tempArray[i] +
                        " time" + (tempArray[i] > 1 ? "s" : ""));
        }
        */
        
        // Declare the max count value
        int maxCount = 0; 
        // Loop through the temp array
        for (int i = 0; i < tempArray.length; i++){     
            // If the number in the temp array is more than the max count
            if (tempArray[i] > maxCount){
                // Change the max count number to the value in the index
                maxCount = tempArray[i];
                // Change the max index to the index number or the temp array
                maxIndex = i;                
            }
        }
        // Return the max index which is the mode(most counted number)
        return maxIndex;
    }
    
    // Grades method
    public static char [] grades(int[] inputArray){
        // Create an array for the grade values
        int gradeArray [] = {85, 75, 65, 55, 50};
        // Create a temp array the same size as the input array
        char tempArray [] = new char[inputArray.length];
        // Create a char arrray for grades A, B, C, D, E and F
        char charArray [] = {'A','B','C','D','E','F'};
        // Loop through the input array
        for(int i = 0; i < inputArray.length; i++){
            // If the value is more or equal to 85
            if (inputArray[i] >= gradeArray[0]){
                // Insert A to the temp array
                tempArray[i] = charArray[0];
            }
            // Else if the value is more or equal to 75
            else if (inputArray[i] >= gradeArray[1]){
                // Insert B to the temp array
                tempArray[i] = charArray[1];
            }
            // Else if the value is more or equal to 65
            else if (inputArray[i] >= gradeArray[2]){
                // Insert C to the temp array
                tempArray[i] = charArray[2];
            }
            // Else if the value is more or equal to 55
            else if (inputArray[i] >= gradeArray[3]){
                // Insert D to the temp array
                tempArray[i] = charArray[3];
            }
            // Else if the value is more or equal to 50
            else if (inputArray[i] >= gradeArray[4]){
                // Insert E to the temp array
                tempArray[i] = charArray[4];
            }
            // Else change the value to F to the temp array
            else tempArray[i] = charArray[5];
        }
        // Return the temp array which is characters
        return tempArray;
        
    }
    
    // Grade Distance method
    public static int [] gradeDistn(char[] inputArray){
        // Create a temp array
        int tempArray [] = new int[6];
        // Declaration 
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countE = 0;
        int countF = 0;
        // Loop through the input array
        for(int i = 0; i < inputArray.length; i++){     
            // Use switch
            switch(inputArray[i]){
                // If the value in the array equals A then increment the countA
                case 'A': countA++; continue;
   
                // If the value in the array equals B then increment the countB
                case 'B': countB++; continue;
            
                // If the value in the array equals C then increment the countC
                case 'C': countC++; continue;
            
                // If the value in the array equals D then increment the countD
                case 'D': countD++; continue;
            
                // If the value in the array equals E then increment the countE
                case 'E': countE++; continue;
            
                // If the value in the array equals F then increment the countF
                case 'F': countF++; continue;
            }
        }
        // Insert the count into the temp array
        tempArray[0] = countA;
        tempArray[1] = countB;
        tempArray[2] = countC;
        tempArray[3] = countD;
        tempArray[4] = countE;
        tempArray[5] = countF;
        // Return the values
        return tempArray;
        
    }
}


