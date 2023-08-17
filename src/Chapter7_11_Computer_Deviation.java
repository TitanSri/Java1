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
public class Chapter7_11_Computer_Deviation {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Compute the mean and deviation for 10 numbers
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10]; //Create a new array of 10
        
        //Prompt the user to enter 10 numbers
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextDouble();
            
        //Displays the mean and standard deviation
        System.out.println("The mean is " + mean(numbers));
        System.out.println("The standard deviationis " + deviation(numbers));
        
        }
    
    //Compute the deviation of the double values
    public static double deviation(double[] x){
        double deviation = 0;
        double mean = mean(x);
        for (double e: x){
            deviation += Math.pow(e - mean, 2);
        }
        return Math.sqrt(deviation / (x.length -1));
    }
    
    //Compute the mean of the arrary for double values
    public static double mean(double[] x){
        double mean = 0;
        for (double e: x){
            mean += e;
        }
        return mean / x.length;
        }
    }
    
