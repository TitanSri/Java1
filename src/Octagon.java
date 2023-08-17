/******************************************************************************
 *                          Octagon Class                                     *
 * ---------------------------------------------------------------------------*
 * -side: double
 * -whenBuilt: java.util.Date
 * ----------------------------------------------------------------------------*
 * +Octagon(double: side)
 * +getWhenBuilt(): java.util.Date
 * +getArea(): double                                                              
 * +getPerimeter(): double                                                           
 * +compareTo(Octagon: o): int
 * +largest(Octagon: o1, Octagon: o2): Octagon
 * +toString(): String
 * +clone(): Octagon 
 * *****************************************************************************
 */
import java.io.*;
import java.util.*;
/**
 *
 * @author Toby Sriratananakoul
 */
public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable{
    // Declaration 
    private double side;
    private java.util.Date whenBuilt;
    
    // Constructors
    public Octagon(double side){
        this.side = side;
        whenBuilt = new java.util.Date();
        }
    
    // Method get when built
    public java.util.Date getWhenBuilt(){
        return whenBuilt;
    }
    
    // Method to get the area
    @Override
    public double getArea() {         
        // Formula for area of an octagon
        return (float)((2 + 4 / (Math.sqrt(2))) * side * side);
    }
 
    // Method to get the perimeter
    @Override
    public double getPerimeter(){
        // Formula for a perimeter of an octagon
        return 8 * side;
    }
    
    // Override the compareTo method 
    // defined in Comparable and compare the current object to the arg
    @Override 
    public int compareTo(Octagon o) {
        // Test: print the objects
        // System.out.println(this.getArea() + " " + o.getArea());
        // Condition to return 1 if arg is bigger or -1 if smaller
        if (this.getArea() > o.getArea())
            return 1;
        else if (this.getArea() < o.getArea())
            return -1;
        else
            return 0;
    }
    
    // Method compare two objects
    public static Octagon largest(Octagon o1, Octagon o2) {
        // Return object 1 if object 1 is larger than object 2 
        // or else return object 2
        return o1.compareTo(o2) == 1 ? o1 : o2;
    }
    
    // Override the currect default string for Geometric Object 
    @Override
    public String toString(){
        return "\nThe largest area is: " + getArea() + 
                "\nSide length: "+ side + "\nBuilt: " + whenBuilt;
    }
    
    // Override the clone for clonable 
    @Override
    public Object clone() throws CloneNotSupportedException{
        // Create a clone from the super clonable current object
        Octagon octagonClone = (Octagon)super.clone();
        // Add a new date by usind deep cloning 
        octagonClone.whenBuilt = new java.util.Date();
        // Return the clone
        return octagonClone;     
    }

}
