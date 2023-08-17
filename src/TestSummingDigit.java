/*
 * Returns the multiplication of the digits of a number
 */

/**
 * @mano itc206
 */
public class TestSummingDigit {
    public static void main(String args[]) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter a number: ");
        int value = input.nextInt();
        
        System.out.println("The multiplication of digits for " + value +
                " is " + mulDigits(value));
    }
    
    //Method multiple the digits
    public static int mulDigits(long n){
        //convert the number to a positive if negative
        int temp = (int)Math.abs(n);
        System.out.println("Temp: " + temp);
        //decalre the total of the digits being multipled
        int mul = 1;
        
        //loop through each digit from the last digit
        while (temp !=0){
            //divide the number by 10 
            int remainder = temp % 10;
            System.out.println("Remainder: " + remainder);
            //assign the last digit to multiplication 
            mul *= remainder;
            System.out.println("Mul: " + mul);
            //remove the last digt
            temp = temp/10;
            System.out.println("Temp: " + temp);
        }
        
        return mul;
    }
}
