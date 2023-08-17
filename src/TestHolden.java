/*
 * Define a class Holden that contains the properties gas as Boolean 
 * with constructor and get methods.
 * Holden class implements the interface Cars 
 * where interface has getGas() and run() methods.
 * Write a test program that print “Run” 
 * if gas is available otherwise print “Stop”.
 */

/**
 *
 * @author mano itc206
 */

public class TestHolden {
    public static void main(String[] args) {
        Holden ob = new Holden(true);
        System.out.println("Is there any gas? " + ob.getGas());
        System.out.println("Car status:  ");
        ob.run();
    }
}
