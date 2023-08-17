/*
 Sorting characters in a string: 
 Write a method that returns a sorted string using the following header:
 public static String sort(String s)
 For example, sort("acb") returns abc.
 Write a test program that prompts the user to enter a string 
 and displays the sorted string.
*/
import java.util.*;
/**
 *
 * @author Toby Sriratanakoul
 */
public class Sorting_Characters_In_A_String {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Enter a String
        System.out.println("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();   
        
        // Sort the string using the sortString method
        String outputString = sortString(inputString);
        
        // Display the new string
        System.out.println("The orignal string is: " + inputString);
        System.out.println("The sorted string is: " + outputString);
        
    }
    
    //Method sortString
    public static String sortString(String inputString){
        // Convert the string to an Array
        char tempArray[] = inputString.toCharArray();
        
        // Sort the tempArrary
        Arrays.sort(tempArray);
        
        // Return the new sorted string
        return new String(tempArray);
    }
}
