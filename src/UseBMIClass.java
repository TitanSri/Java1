/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class UseBMIClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        BMI bmi1 = new BMI("John Doe", 18, 145, 70);
        System.out.println("The BMI for " + bmi1.getName() + " is "
            + bmi1.getBMI() + " " + bmi1.getStatus());
        
        BMI bmi2 = new BMI("Susan King", 215, 70);
        System.out.println("The BMI for " + bmi2.getName() + " is "
            + bmi2.getBMI() + " " + bmi2.getStatus());
        
        BMI bmi3 = new BMI("Tom Jones", 44, 85, 5, 10);
        System.out.println("The BMI for " + bmi3.getName() + " is "
            + bmi3.getBMI() + " " + bmi3.getStatus());
    }
}
