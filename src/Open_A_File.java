/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import all the packages
import java.util.*;
import java.io.*;
/**
 * 
 * @author Toby Sriratanakoul
 */
public class Open_A_File {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])throws Exception {
        
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt the user to a file
		System.out.print("Enter a file of scores: ");
		File file = new File("data//Score.txt");

		// Check if file exists
		if (!file.exists()) {
			System.out.println("File " + file + " does not exist");
			System.exit(1);
		}

		int count = 0; 		// Counts scores
		double total = 0;	// Accumulates total

		try (
			// Create input file
			Scanner inputFile = new Scanner(file);
		) {
			while (inputFile.hasNext()) {
				total += inputFile.nextInt();
				count++;
			}
		}

		// Display results
		System.out.println("File " + file.getName());
		System.out.println("Total scores: " + total);
		System.out.println("Average scores: " + (total / count));
	}
}