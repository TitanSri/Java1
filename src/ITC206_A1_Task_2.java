/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//import scanner and input mismatch exception
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * Toby Sriratanakoul 11485513
 */
public class ITC206_A1_Task_2 {
    public static void main(String args[]) {
        // Book purchase's
        Scanner input = new Scanner(System.in);
        // Input the books puchased
        char sentinel = 'y';
        long total = 0;
        //Print error message and stop the program
        try {
            //Loop while until user enters 'n'   
            do {

                System.out.print("Enter the number of large print hardback books purchased: ");
                long largePrint = input.nextInt();
                System.out.print("Enter the number of small print hardback books purchased: ");
                long smallPrint = input.nextInt();
                System.out.print("Enter the number of softcover books purchased: ");
                long softCover = input.nextInt();


                // Calucate the total
                long largePrintTotal = getLargeBookTotal(largePrint);
                long smallPrintTotal = getSmallBookTotal(smallPrint);
                long softCoverTotal = getSoftCoverTotal(softCover);

                System.out.println("Large Books total: $" + largePrintTotal);
                System.out.println("Small Books total: $" + smallPrintTotal);
                System.out.println("Soft cover books total: $" + softCoverTotal);
                System.out.println("The total is: $" + (largePrintTotal + smallPrintTotal + softCoverTotal));

                total = total + largePrintTotal + smallPrintTotal + softCoverTotal;

                System.out.println("Would you like to calculate another bill (y/n)? ");
                char answer = input.next().charAt(0);
                if (answer == 'n'){
                    sentinel ='n';
                }        
            } while (sentinel == 'y');

        }catch (InputMismatchException e){
        System.out.println("Please run the program again and enter a whole number.");

        }
    System.out.println("Total sales in this session: $" + total);
    }
    // Return the large books total
    public static long getLargeBookTotal(long number){
        long discount = (number / 2) * 30;
        long extra = (number % 2) * 20;
        long answer = discount + extra;
        return answer;
    }
    // Return the samll books total
    public static long getSmallBookTotal(long number){
        long discount = (number / 3) * 20;
        long extra = (number % 3) * 10;
        long answer = discount + extra;
        return answer;
    }
    // Return the soft cover books total
    public static long getSoftCoverTotal(long number){
        long discount = (number / 4) * 15;
        long extra = (number % 4) * 5;
        long answer = discount + extra;
        return answer;
    }
}
