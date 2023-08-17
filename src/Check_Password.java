/*
 Checking password: Some websites impose certain rules for passwords. 
 Write a method that checks whether a string is a valid password. 
 Suppose the password rules are as follows:
 A password must have at least eight characters.
 A password consists of only letters and digits.
 A password must contain at least two digits.
 Write a program that prompts the user to enter a password 
 and displays Valid Password if the rules are followed 
 or Invalid Password otherwise.
 */
import java.util.*;

/**
 *
 * @author Toby Sriratanakoul
 */
public class Check_Password {

    /**
     * @param args the command line arguments
     */
    // Declare the pawword length as final = 8
    public static final int PASSWORD_LENGTH = 8;
    
    public static void main(String args[]) {
        // Enter the password
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password with the following: \n" +
                            "Atleast 8 characters\n" +
                            "A letter and atleast 2 digits");  
        String password = input.nextLine();
        
        if(is_Valid_Password(password)){
            System.out.println("Password is valid: " + password);
        } else {
            System.out.println("Password is not valid: " + password);
        }
    }    
    // Method checkPassword 
    public static boolean is_Valid_Password(String password){
        //check for length is atleas 8 characters
        if (password.length() < PASSWORD_LENGTH) 
            return false;
        
        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++){
            char ch = password.charAt(i);
            
            if (is_Numeric(ch)) numCount++;
            else if (is_Letter(ch)) charCount++;
            else return false;
        }
        System.out.println("Number count is: " + numCount);
        System.out.println("Character count is: " + charCount);
        
        //Checks 1 Letters and 2 Digits
        return (charCount >= 1 && numCount >= 2);
    }
    
    // Method check for letters
    public static boolean is_Letter(char ch){
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }
    
    // Method check atleast digits
    public static boolean is_Numeric(char ch){
        return (ch >= '0'  && ch <= '9');
    }
    
    
}
