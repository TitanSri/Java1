/*
 * Assessment 3        
 */

import java.io.*;
import java.util.*;

/**
 *
 * @author Toby Sriratanakoul
 */
public class ITC206_A3_Task_1 {
    public static void main(String args[]) {
        
        // Try to read from a file which requires catch exceptions 
        try {
            // Create a new array list
            ArrayList<String> list = new ArrayList<String>();
            
            // Create a new file from the location
            File myObj = new File("data//SubjectsList.txt");
            Scanner myReader = new Scanner(myObj);
            // Loop the lines in the file
            while (myReader.hasNextLine()) {
                // Add each line to the array list
                list.add(myReader.nextLine());
            }
            // Close the scanner
            myReader.close();
            
            // Print the file attributes 
            if (myObj.exists()) {   
                System.out.println("File name: " + myObj.getName());
                System.out.println("Absolute path: " + myObj.getAbsolutePath());
                System.out.println("Writeable: " + myObj.canWrite());
                System.out.println("Readable " + myObj.canRead());
                System.out.println("File size in bytes " + myObj.length());
                }
            else {
                // If no file exist then print the following 
                System.out.println("The file does not exist.");
            }
            
            // Display list
            System.out.println("\nPrint list: \n");
            // Loop through each element in the list
            for (String ele : list){
                // Display the element
                System.out.println(ele);
            }
            
            // While more = Yes
            char more = 'y';
            while (more == 'y'){
                
                
                // Ask the user for the subject details
                Scanner input = new Scanner(System.in);
                System.out.println("\nEnter the subject name: ");
                String subjectName = input.nextLine();
                System.out.println("\nEnter the subject code: ");
                String subjectCode = input.nextLine();
                
                // Create a new object from Subject
                Subject subject1 = new Subject(subjectName, subjectCode);
                
                // While the subject code is not valid or in the list
                while (!subject1.isValidCode() || subject1.codeExists(list)){
                    // Display is the subject code valid
                    System.out.println("\nIs code valid 3 letters then 3 numbers "
                            + "i.e. abc123: " + subject1.isValidCode());
                    // Display id the subject code is already exist in the list
                    System.out.println("\nThe code " + subject1.getSubjectCode() 
                        + " exists in the list: " + subject1.codeExists(list));
                    
                    // Ask to quit
                    System.out.println("\nDo you want to quit y/n? \nIf you quit then you no changes will be made.");
                    char ans = input.next().charAt(0);
                    if (ans == 'y' || ans == 'Y'){
                        System.exit(0);
                    }
                    
                    // Advise the user to enter a new code
                    input = new Scanner(System.in);
                    System.out.println("\nEnter a new subject code: ");
                    subjectCode = input.nextLine();
                    // Set a new code for the subject
                    subject1.setSubjectCode(subjectCode);
                    
                }

                // Get subject name
                System.out.println("\nGet subject name: " + subject1.getSubjectName());

                // Get subject code
                System.out.println("Get subject code: " + subject1.getSubjectCode());
                
                // Get code matches
                System.out.println("Code matches the object: "
                        + subject1.codeMatches(subjectCode));

                // Add the subject1 using the toString method the list 
                list.add(subject1.toString());

                // Print the array list
                System.out.println("\nPrint list: \n");
                for (String x : list){
                    System.out.println(x);
                }
                
                // Ask the user if they want to add more subjects
                System.out.println("\nDo you want to add more (y/n): ");
                Scanner input2 = new Scanner(System.in);
                more = input2.next().charAt(0);
            }
            
            // Try to save to a file which requires a catch exception
            try {
                // Over write the currect file
                FileWriter writer = new FileWriter("data//SubjectsList.txt");
                // Loop each line in the list
                for (String str: list){
                    // Write the line and add a new line
                    writer.write(str + System.lineSeparator());
                }
                // Close the writer
                writer.close();
            }
            // Catch for saving to file
            catch(Exception ex){
                ex.printStackTrace();
            }
            
        } 
        
        // Catch for read file
        catch (FileNotFoundException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
    }
    
    
    
}
