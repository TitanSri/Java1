/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 * 
 * @author Toby Sriratanakoul
 */
public class Chapter5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //Testing the incremental printing a and i 
        int i = 1;
        while (i < 10){
            System.out.println("This is the first number: " + i); 
            //check the condition for i then increments 
            if ((i++) % 2 == 0)
            System.out.println("This is the second number: " + i); 
        }        
        //Testing the incremental before printing a and i 
        i = 1;
        while (i < 10){
            int a = ++i;
            System.out.println("This is a: " + a); 
            if ((i) % 2 == 0)
            System.out.println("This is i: " + i); 
        }
        //Test do while (performs the loop first even if the condition is invalid)
        Scanner input = new Scanner(System.in);

        int number, max;
        number = 0;//The do-loop will perform the loop at least once...  
        max = number;

        do {
          System.out.println("Enter a number, to quit enter 0: ");
          number = input.nextInt();
          if (number > max)
            max = number;
        } while (number != 0);//zero will end the loop

        System.out.println("max is " + max);
        System.out.println("number " + number);
        
        //Sum loop
        for (int a=1, sum=0; sum < 10; i++){ 
        sum = sum + a;
        System.out.println("sum is " + sum);
        }
        
        //Nested loop test
        int h = 5;
        while (h >= 1) {
            int num = 1;
            for (int j = 1; j <= h; j++) {
                System.out.print(num + "xxx");
                num *= 2;
            }

        System.out.println();
        h--;
        }
        //Greatest Common Divisor 
        System.out.print("Enter first Greatest Common Divisor Integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second Greatest Common Divisor Interger: ");
        int n2 = input.nextInt();
        int gcd =1;
        
        for (int k = 2; k <= n1 && k <= n2; k++){
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
        }
        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
        
        //Break test
        int balance = 11;
        System.out.println("The balance is: " + balance);
        while (true) {
          if (balance < 9)//If this condition is not true then it will continue to the expression 
            break;
          balance = balance - 9;
        }

        System.out.println("Balance is " 
          + balance);
        
        //Continue test with for statement
        int sum = 0; 
        for (int e = 0; e < 4; e++) {
          if (e % 3 == 0) 
              continue;
          sum += e;          
        }
        System.out.println("The sum is: " + sum );
        
        //Continue test with while statement 
        int f = 0, sum1 = 0; 
        while (f < 5) {
          if (f % 3 == 0){
              f++;//Prevents a loop 
              continue; //In a while loop the action-after-each-iteration is skipped
          }
          sum1 += f;  
          f++; //Action-after-each-iteration
        }
        System.out.println("The sum is: " + sum1 );
        
        //Display the ASCII code from ! to ~, 124 characters
        int count = 0 ; //Count the number of characters
                
        //Loop for each charater less then 10
        for (int t = 33; t <= 126; t++){
        count++;
            //Print each charcter 10 per line
            if (count % 10 == 0)
                System.out.println((char)t);
            else
                System.out.print((char)t + " ");
    }
        //Prime Numbers, eight prime numbers per line
        final int NUMBER_OF_PRIMES_PER_LINE = 8; // Display 8 per line
        int count1 = 0; // Count the number of prime numbers

        System.out.println(
                "The prime numbers between 2 and 1,000, inclusive are \n");

        // Repeatedly find prime numbers
        for (int number1 = 2; number1 <= 1000; number1++) {
                // Assume the number is prime
                boolean isPrime = true;	// Is the current number prime?

                // Test whether number is prime
                for (int divisor = 2; divisor <= number1 / 2; divisor++) {
                        if (number1 % divisor == 0)	{ // If true, number is not prime
                                isPrime = false;	// Set isPrime to false
                                break;	// Exit the for loop
                        }
                }

                // Display the prime number and increase the count
                if (isPrime) {
                        count1++;	// Increase the count

                        if (count1 % NUMBER_OF_PRIMES_PER_LINE == 0) {
                                // Display the number and advance to the new line
                                System.out.println(number1);
                        }
                        else
                                System.out.print(number1 + " ");
                }
        }
	
        //ISBN-13 checksum, 10 - each digit and the remainderis the 13 digit added
        //Enter the 12 digits
        String isbn;
        int checksum = 0;
        
        do {
            System.out.println("Enter the first 12 digit ISBN 13: ");
            isbn = input.nextLine();
        
        //Check is it is 12 digits
        }while (isbn.length() !=12);
        
        //Scan every character
        for (int ii = 0; ii <isbn.length(); ii++){
            checksum += ii % 2 == 0 ? 3 * Integer.parseInt(isbn.charAt(ii) + "")
            : Integer.parseInt(isbn.charAt(ii) + ""); //every second digit multiple by 3 else leave it
            }
        //Calculate the remainder
        System.out.println("The total is : " + checksum);
        checksum = 10 - checksum % 10;
        System.out.println("10 - checksum, the remainder is : " + checksum);
        //Pirnt the results
        System.out.println("The ISBN-13 number is " + isbn + (checksum == 10 ? 0 : checksum));
    }
   
}
