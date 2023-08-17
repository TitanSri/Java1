/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Toby Sriratanakoul
 */
public class RandomCharacter {
        /**Generate a random character between ch1 and ch2**/
    public static void main(String args[]) {
    }
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));    
    }
    //Generate a lower case letter
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }
    //Generate an upper case letter
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'B');
    }
    //Generate a random number
    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }
    //Generate a random character
    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
}

        