/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Toby Sriratanakoul
 */
public class Chapter4 {
    public static void main(String args[]){
        System.out.println("(int) '1' is " + (int)'1');
        System.out.println("(int) 'A' is " + (int)'A');
        System.out.println("(int) 'B' is " + (int)'B');
        System.out.println("(int) 'a' is " + (int)'a');
        System.out.println("(int) 'b' is " + (int)'b');
        
        System.out.println("(char)40 is " + (char)40);
        System.out.println("(char)59 is " + (char)59);
        
        System.out.println("(char)0x40 is " +(char)0x40);
        System.out.println("(char)0x5a is " +(char)0x5A);
        
        System.out.println("'\\\"'+\"\\\\\" is " + '\"'+"\\" );
        
        String s1 = "Welcome to Java";
        String s2 =  "Programming is fun";
        String s3 =  "Welcome to Java";
        System.out.println("s1.substring(5) is " + s1.substring(5)); //from index 5
        int i = 51;
        double j = 56.345;
        System.out.println("(i + \"\").length() is " + (i + "").length());
        System.out.println("(j + \"\").length() is " + (j + "").length());
        
        System.out.println("1" + 1); //String
        System.out.println('1' + 1); //Number
        System.out.println("1" + 1 + 1); //String
        System.out.println("1" + (1 + 1)); //String + (sum)
        System.out.println('1' + 1 + 1); //Number
    }
}
