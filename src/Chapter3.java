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
public class Chapter3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        boolean b = true;
        System.out.println("Is b equal to false: " + (b == false));
        System.out.println("The value of b is: " + b);
        int a = 9;
        boolean even = a % 2 == 0;
        System.out.println(a + " is even: " + even);
        //Looping randon number creation with a "while" loop
        int i = 1;
        while (i < 11){
            double z = Math.random() * 2;
            System.out.println("z is " + z + "int z is " + (int)(z));
            System.out.println("The " + i + " random number is " + (int)(Math.random() * 50));
            i++;
        }
        //Testing loop with the for statement
        for (int h = 0; h < 5; h++){ 
            System.out.println("For loop: " + h);
        }

        //Check for a leap year
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = input.nextInt();
        //Calculate the leap year
        boolean isLeapYear = 
                (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        //Display the result
        if (isLeapYear == true)
            System.out.println(year + " is a leap year ");
        else 
            System.out.println(year + " is a not leap year ");
        int remainder = year % 12;
        switch (remainder) { 
          case 0: System.out.println("year of the monkey"); break;
          case 1: System.out.println("year of the rooster"); break;
          case 2: System.out.println("year of the dog"); break;
          case 3: System.out.println("year of the pig"); break;
          case 4: System.out.println("year of the rat"); break;
          case 5: System.out.println("year of the ox"); break;
          case 6: System.out.println("year of the tiger"); break;
          case 7: System.out.println("year of the rabbit"); break;
          case 8: System.out.println("year of the dragon"); break;
          case 9: System.out.println("year of the snake"); break;
          case 10: System.out.println("year of the horse"); break;
          case 11: System.out.println("year of the sheep"); break;
        }
        //Switch with no break
        int x = 3; int y = 3;
        switch (x + 3) {  
        case 6:  y = 1;
        default: y += 1;
        System.out.println("y =1 then y += 1 = " + y);
        
        // Sort three number program
        System.out.println("Please enter 3 numbers: ");
        // Enter three nunbers
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        
        // Make number1 the smallest number 
        int temp;
        
        // If number1 > number2 then temp = number1 and number1 = number2 then number2 = temp
        if (number1 > number2){
            temp = number1;
            number1 = number2;
            number2 = temp;
        }
        // If number1 > number3 then temp = number1 and number1 = number3 then number3 = temp
        if (number1 > number3){
            temp = number1;
            number1 = number3;
            number3 = temp;
        }
        // Make number2 the second smallest 
        // If number2 > number3 then number2 = temp and number3 = number2 then temp = number3
        if (number2 > number3){
            temp = number2;
            number2 = number3;
            number3 = temp;
        }
        // Display smallest to largest
        System.out.println(number1 + " " + number2 + " " + number3);
        
        // Prompt the user to enter a three-digit integer
        System.out.print("Enter a three-digit integer: ");
        int number = input.nextInt();

        // Test for palindrome
        int digit1 = (int)(number / 100);
        int remaining = number % 100;
        int digit3 = (int)(remaining % 10);

        // Display result
        System.out.println(digit1 + " The ramiaing is: " + remaining + "Third digit: " + digit3);
        System.out.println(number + ((digit1 == digit3) ? " is a " : " is not a ") + "palindrome");
        
        
        }
    }
}
