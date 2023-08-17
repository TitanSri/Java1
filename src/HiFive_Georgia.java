
import java.util.Scanner;

/*
 * If number divide by 5, 2 or 3 then print
 */

/**
 *
 * @author admin
 */
public class HiFive_Georgia {
    public static void main(String args[]) {
        char again = 'y';
    
    // Loop the program until answer is not yes
    do{
    // Enter a number
    System.out.println("Enter a number : ");
    java.util.Scanner input = new java.util.Scanner(System.in); 
    double number = input.nextInt();
    
    // number is divisible by 5 
    if (number % 5 == 0)
            // print HiFive
            System.out.print("HiFive ");
    
    // number is divisible by 2 or 3 
    if (number % 2 == 0 || number %3 == 0)
            // print Georgia
            System.out.println("Georgia"); 
    
    // ask to go again
    System.out.println("\nDo you want to go again? y/n");
    Scanner ch = new Scanner(System.in);
    again = ch.next().charAt(0);
    }   while (again == 'y' || again == 'Y');
  }
}