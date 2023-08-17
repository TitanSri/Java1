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
public class Chapter6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        //6.2: Summing the digits in an integer i.e 123 = 6
        Scanner input = new Scanner(System.in);
        System.out.println("Enter digits(0-9) to be added no space i.e. 987: ");
        long num1 = input.nextLong();
            
        System.out.println(xSum(num1));
        
        //6.25: Converting milliseconds to hours, minutes and seconds
        System.out.println("Enter an amount of milliseconds: ");
        long milliSeconds = input.nextLong();
        System.out.println(xTime(milliSeconds));
        
        //6.31: Credit card number validation
        System.out.println("Enter a card number (14 characters maximum: ");
        long card = input.nextLong();
        System.out.println("The size is : " + getSize(card));
        System.out.println("Is Valid : " + isValid(card));
        System.out.println("Sum of odd place: " + sumOfOddPlace(card));
        System.out.println("Sum of double even place : " + sumOfDoubleEvenPlace(card));
        System.out.println(card + " is " + (isValid(card) ? "valid" : "not valid"));
        }
    
        //method printSum; returns the total
        public static long xSum(long num1){
            long sum = 0;
            while (num1 > 0){
                sum += num1 % 10;
                num1 /= 10;
            }
            return sum;
        }
        //method printTime; returns a string 
        public static String xTime(long milliSeconds){
            //Obtain total seconds
            long tsec, sec, tmin, min, thrs, hrs;
            tsec = milliSeconds/1000;
            sec = tsec % 60;
            tmin = tsec / 60;
            min = tmin % 60;
            thrs = tmin / 60;
            hrs = thrs % 60;
            String answer = "";
            answer = answer + hrs + " hrs : " + min + " mins : " + sec + " seconds"; 
        return answer;   
        }
        
        
        // Return true if the card number is valid 
        public static boolean isValid(long number){
            //Checks for size between 13 and 16; and prefix 4, 5, 37 and 6; adds even and odd place divide by 10 with no remainders 
            boolean valid = 
                    (getSize(number) >= 13 && getSize(number) <= 16) &&
                    (prefixMatched(number, 4) || prefixMatched(number, 5) ||
                    prefixMatched(number, 37) || prefixMatched(number, 6)) &&
                    ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);
            
            return valid;
        }
        /* Get the result from Step 2; descriptionis the same as odd except 2nd last character */
        public static long sumOfDoubleEvenPlace(long number){
            int sum = 0;
            String num = number + "";
            for (int i = getSize(number) - 2; i >= 0; i -=2){
                sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
            }
            return sum;        
        }
        /* Return this number if it is a single digit, otherwise,
        return the sum of the two digits */
        public static int getDigit(int number){
            if (number < 9)
                return number;
            else
                return number / 10 + number % 10;
        }
        
        /* Return sum of odd-place digits in number */
        public static int sumOfOddPlace(long number){
            int sum = 0;
            //Create a string from the number
            String num = number + "";
            //Scan the card size - 1 to get the last digit then minus 2 to get the 3rd last digit
            for (int i = getSize(number) - 1; i >=0; i-=2){
                //Get the string from the number at place i and turn it into a Int; add to the sum
                sum += Integer.parseInt(num.charAt(i) + "");
            }
            //Returns the total of the sum
            return sum;
        }
        /* Return true if the digit d is a prefix for number */
        public static boolean prefixMatched(long number, int d){
            System.out.println("Digit : " + d);
            System.out.println("Getsize of Digit: " + getSize(d));
            System.out.println("Getprefix : " + getPrefix(number, getSize(d)));
            //Gets the first numbers and match with the check number
            return getPrefix(number, getSize(d)) == d;
        }
        
        /* Return the number of digits in d(match digit) which is 1 or 2*/
        public static int getSize(long d){
            String num = d + "";
            System.out.println("Check number is : " + num);
            return num.length();
        }
        
        /* Return the first k number of digits from number. If the
        number of digits in number is less than k, return number. */
        public static long getPrefix(long number, int k){
            if (getSize(number) > k){
                System.out.println("The number of digits to check : " + k);
                String num = number + "";
                System.out.println("Card number : " + num + " the substring is " + num.substring(0, k));
                return Long.parseLong(num.substring(0, k));
            }
            return number;
        }
        

}
        
