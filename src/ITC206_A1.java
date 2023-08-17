/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import all the packages
import java.util.*;
/**
 *
 * Toby Sriratanakoul 11485513
 */
public class ITC206_A1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Population prediction
        Scanner input = new Scanner(System.in);
        // Input the births(x seconds), death(y seconds) and immigrants(z seconds) for the year
        int sentinel = 1;
            
        //Print error message and stop the program
        try {
            //Loop till the user enters 0   
            do {

                System.out.println("Enter the births per seconds: ");
                double x = input.nextInt();
                System.out.println("Enter the deaths per seconds: ");
                double y = input.nextInt();
                System.out.println("Enter the immigrants per seconds: ");
                double z = input.nextInt();
                System.out.println("Enter the amount of years: ");
                double years = input.nextInt();
                System.out.println("Enter the current population: ");
                double currentPopulation = input.nextLong();

                // Calucate the seconds for the year 
                double sec = 1;
                double min = sec * 60;
                double hr = 60 * min;
                double day = hr * 24;
                double year = day * 365;
                System.out.println("Seconds in a year is: " + (int)year);
                double births = year / x;
                System.out.println("Births per year: " + (int)births);
                double deaths = year / y;
                System.out.println("Deaths per year: " + (int)deaths);
                double immigrants = year / z;
                System.out.println("Immigrants per year: " + (int)immigrants);
                
                //Calculate per year
                double yearPopulation = births - deaths + immigrants;
                System.out.println("Population per year: " + yearPopulation);
                double predictedPopulation = yearPopulation * years + currentPopulation;

                // Display the results in a table with x, y, z, years, current popluation, predicted population
                String format = "%-10s%-10s%-10s%-10s%-30s%s%n";
                System.out.printf(format, "X seconds", "Y seconds", "Z seconds", "Years", "Current Population", "Predicted Population");
                System.out.printf(format, x, y, z, years, currentPopulation, predictedPopulation); 
                System.out.println("The population in " + (int)years + " years: " + (Math.round(predictedPopulation)));

                System.out.println("Press 1 for more or 0 to end: ");
                int answer = input.nextInt();
                if (answer == 0){
                    sentinel =0;
                }        
            } while (sentinel != 0);
        
        }catch (InputMismatchException e){
        System.out.println("Please run the program again and enter a whole number.");
        
        }
        
    }
}
