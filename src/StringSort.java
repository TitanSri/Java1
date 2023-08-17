/*
 * Sorting a string
 */

/**
 *
 * @author mano itc211
 */
import java.util.Scanner;
public class StringSort {
    public static String sort(String s){

        //Construct a StringBuilder object since Strings are immutable
        StringBuilder s1 = new StringBuilder(s);

        //Do a selection sort of the StringBuilder object.
        //Simply put, go over entire string and find smallest character. Put it
        //at the "front" of the substring you're working on
        //Refer to Slide 17 in Lecture Slide 8 for a more thorough explanation
        for(int i = 0; i < s1.length(); i++){
            // declare the minimum character and index
            char currentMin = s1.charAt(i);
            int currentMinIndex = i;
            
            // compare the minimum will all the other numbers above
            // make any numbers less than the minimum, the new minimum
            for(int j = i + 1; j < s1.length(); j++){
                if(currentMin > s1.charAt(j)){
                    currentMin = s1.charAt(j);
                    currentMinIndex = j;
                }
            }
            
            // Set the new minimum into postion i
            if(currentMinIndex != i){
                //move the value at i to the minimun index
                s1.setCharAt(currentMinIndex, s1.charAt(i));
                //place the currentMin into i
                s1.setCharAt(i, currentMin);
            }
        }
    
    //Convert the StringBuilder back into a string and return it
    return s1.toString();
    }
    
    public static void main(String[] args) {
        //Retrieve password
        Scanner input = new Scanner(System.in);
        System.out.print("String to sort: ");
        String s = input.nextLine();
        System.out.print("The sorted string is: " + sort(s));
    }
}