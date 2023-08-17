/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 * 
 * @author Toby Sriratanakoul
 */
public class Chapter7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Ex 7.3 Count how many times the number was entered
        int[] counts = new int[100]; // counts the occurences of the number
        
        //Prompt the user to enter integers between 1 and 100
        System.out.println("Enter the intergers between 1 and 100, press 0 to exit: ");
        
        //Count the occurence of numbers
        count(counts);
         
        //Display results
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0)
                System.out.println((i + 1) + " occurs " + counts[i] +
                        " time" + (counts[i] > 1 ? "s" : ""));
        } 
        
        System.out.println(Arrays.toString(counts));
        
        
        
    }
    
    
    //**METHODS**
    
    //Method count read intergers between 1 and 100 
    //and counts the occurrences of each
    public static void count(int[] counts){
        Scanner input = new Scanner(System.in);
        int num; // holds user input
        do{
            num = input.nextInt();
            if (num >= 1 && num <= 100)
                counts[num -1]++;
        }while (num != 0);
        
    }
       
    
    
    
    
}
