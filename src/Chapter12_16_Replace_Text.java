/*
 * Listing 12.16, ReplaceText.java, gives a program that replaces
 * text in a source file and saves the change into a new file. 
 * Revise the to program to save the changes into the original file. 
 * For example, invoking java Exercise 12_16 file oldString newString
 * replaces oldString in the source file with newString.
 * args[0], args[1], args[2], args[3] are OBJECTS to be used, 
 * in this case ***THE PROGRAM WILL NOT WORK*** since we have no objects.
 */
import java.util.*;
import java.io.*;

/**
 *
 * @author Toby Sriratanakoul
 */
public class Chapter12_16_Replace_Text {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])throws Exception {
        // Check command line parameter usage
        if(args.length !=4){
            System.out.println(
            "Usage: jave ReplaceText sourceFile targetFile oldString newString");
            System.exit(1);
        }
        
        //Check if source file exists
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()){
            System.out.println("Source file " + args[0] + " does not exists");
            System.exit(2);
        }
        
        //Check if target file exists
        File targetFile = new File(args[1]);
        if (targetFile.exists()){
            System.out.println("Target file " + args[1] + " already exists");
            System.exit(3);
        }
        
        //Create Arraylist
        ArrayList<String> list = new ArrayList<>();
        
        try(
            //Create input and output files
            Scanner input = new Scanner(sourceFile);
            PrintWriter output = new PrintWriter(targetFile);
            ){
            while (input.hasNext()){
                String s1 = input.nextLine();
                String s2 = s1.replaceAll(args[2], args[3]);
                output.println(s2);
            }
        }
    }
}
