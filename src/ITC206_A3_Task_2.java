/*
 * ITC206 Assessement 3
 */

/**
 *
 * @author Toby Sriratanakoul
 */
public class ITC206_A3_Task_2 {
    public static void main(String args[]) throws CloneNotSupportedException, InterruptedException {
        // Create the objects
        Octagon octagon1 = new Octagon(5);
        Octagon octagon2 = new Octagon(8);
        
        // Pause for 2 seconds before creating a clone
        java.util.concurrent.TimeUnit.SECONDS.sleep(2);
        // Create a clone from the object octagon 1
        Octagon octagon3 = (Octagon)octagon1.clone();
        
        //Print all the octagaon attributes 
        System.out.println("\nOctagon 1 area: " + octagon1.getArea());
        System.out.println("Octagon 1 color: " + octagon1.getColor());
        System.out.println("Octagon 1 color: " + octagon1.isFilled());
        System.out.println("Octagon 1 perimeter: " + octagon1.getPerimeter());
        System.out.println("Octagon 1 built on: " + octagon1.getWhenBuilt());
        System.out.println("\nOctagon 2 area: " + octagon2.getArea());
        System.out.println("Octagon 2 perimeter: " + octagon2.getPerimeter());
        System.out.println("Octagon 2 built on: " + octagon2.getWhenBuilt());
        System.out.println("\nOctagon 3 area: " + octagon3.getArea());
        System.out.println("Octagon 3 perimeter: " + octagon3.getPerimeter());
        System.out.println("Octagon 3 deep clone built on: " + octagon3.getWhenBuilt());
        System.out.println("Octagon 3 shallow clone date created: " + octagon3.getDateCreated());
               
        // Compare octagon 1 with octagon 2 and return the to string method        
        Object largest = (Octagon.largest(octagon1, octagon2));
        System.out.println(largest);
    }
  
}

