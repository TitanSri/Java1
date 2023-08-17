/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.util.Date;
import java.sql.*;
/**
 * 
 * @author Toby Sriratanakoul
 */
public class Chapter2 {
    public static void main(String[]args){
        /*
        //Input test
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        
        //Convert Fahrenheit to Celsius
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " is " + celsius 
                + " in Celsius");
        */
        double a = 6.5;
        a += a + 1;
        System.out.println(a);
        a = 1;
        double b = a++;
        System.out.println("a is " + a);
        System.out.println("b is " + b + " when a++");
        a = 1;
        b = ++a;
        System.out.println("a is " + a);
        System.out.println("b is " + b + " when ++a");
        double d = 1;
        System.out.println("Casing (int) to a double: " + (int)(d + 0.5));
        /*
        //Calculate sales
        Scanner input = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();
        double tax = purchaseAmount * 0.06;
        System.out.println("The tax is: " + tax);
        //Casting (int) to "tax" then times by 100
                (to keep 2 digits for the cents)
        //Then dividing by a float which will turn "tax" back to a 
                double(for the cents)
        System.out.println("Sales tax is $" + (int)(tax * 100) / 100.00 
                + " after the statement");
        */
        /*
        // Number of coins 
        Scanner input = new Scanner(System.in);
        //Receive amount
        System.out.print("Enter an amount in cents, 
                for example 1156 not 11.56: ");
        double amount = input.nextDouble();
        int remainingAmount = (int)(amount * 100);
        //Find the number of one dollars
        int numberOfOneDollars = remainingAmount / 10000;
        remainingAmount = remainingAmount % 10000;
        //Find the number of quaters in the remaining amount
        int numberOfQuaters = remainingAmount / 2500;
        remainingAmount = remainingAmount % 2500;
        //Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 1000;
        remainingAmount = remainingAmount % 1000;
        //Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 500;
        remainingAmount = remainingAmount % 500;
        //Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
        //Display the results
        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + numberOfOneDollars + " dollars");
        System.out.println(" " + numberOfQuaters + " quaters");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");
        */
        // double 10.03 x 100 = 1002.9999999999999
        System.out.println("10.03 x 100: " + 10.03 * 100);
        //Current Time
        //Scanner input = new Scanner(System.in);
        //System.out.print("Enter the UTC Offset for the time: ");
        //byte time = input.nextByte();
        //Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();
        //Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;
        //Compute the current seconds in the minute in the hour
        long currentSecond = totalSeconds % 60;
        //Obtain the total minutes
        long totalMinutes = totalSeconds / 60;
        //Obtain the current minute in the hour
        long currentMinute = totalMinutes % 60;
        //Obtain the total hours
        long totalHours = totalMinutes / 60;
        //Compute the current hour
        long currentHour = totalHours % 24;
        //Display in UTC +11
        currentHour += 11;
        //If the current hour is more than 24 than -24
        //Else leave it as the currentHour
        currentHour = (currentHour > 24) ? -24 : currentHour;
        //Display the results
        System.out.println("Current time is " + ((currentHour > 12) ? currentHour -12 : currentHour) 
                + ":" + currentMinute + ":" + currentSecond + " UTC +11");
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a balance and
        // the annual percentage interest rate
        System.out.print("Enter balance: ");
        double balance = input.nextDouble();
        System.out.print("Enter the interest rate (e.g., 3 for 3%): ");
        double annualInterestRate = input.nextDouble();

        // Calculate the interest
        String interest = String.format("%.2f", 
                (balance * (annualInterestRate / 1200)));

        // Display result
        System.out.println("The interest is $" + interest +
                " for the next month repayment of $" + balance);
        //Display time using date model and getTime function
        Date date= new Date();
        long time = date.getTime();
        System.out.println("Time in Milliseconds: " + time);
        Timestamp ts = new Timestamp(time);
        System.out.println("Current Time Stamp: " + ts);
        
        //Display GrossSalary
        System.out.print("Enter Gross Salary: ");
        double grossSalary = input.nextDouble();
    
        double tax = grossSalary * 0.32;
        System.out.println("Salary tax is " + (int)(tax * 100) / 100.0);
        System.out.println("The Net Salary tax is " + (grossSalary - tax));
        }
}
