/*
 * Computing GCD for an array
 */

/**
 * @author mano itc206
 */
public class ComputingGCD {
    public static void main(String args[]) {
        System.out.println("Enter five integers: ");
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        //create an array
        int[] numbers = new int[5];
        
        //insert the numbers to the array
        for (int i = 0; i < 5; i++)
            numbers [i] = input.nextInt();
        
        //check the numbers for gcd
        System.out.println(gcd(numbers));
    }
    
    //Method 
    //first gcd method
    public static int gcd(int[] numbers){
        int gcd = numbers[0]; // first gcd
        
        //loop for each index from the array from index 1
        for (int i = 1; i < numbers.length; i++)
            //use the second gcd method 
            //and compare the first gcd(index 0) with the index 1
            gcd = gcd(gcd, numbers[i]); //the new gcd will be 
                                        //compared with the next number
        
        return gcd;
    }
    
    //Return the gcd of two integers
    public static int gcd(int n1, int n2){
        int gcd = 1; // Intial gcd is 1
        int k  = 1; // Possible gcd
        
        //while less than both numbers
        while (k<= n1 && k <= n2){
            //if both remainders are zero
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k; // Update gcd
            k++; //move upwards from 1
        }
        // return the lastest hightest number
        return gcd; 
    }
}
