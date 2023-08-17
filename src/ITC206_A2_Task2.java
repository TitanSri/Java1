/****************************************
 *      ITC206_A2_Task_2                *
 * -------------------------------------*
 * +event1()                            *
 * +event2()                            *
 * +event3()                            *
 * **************************************
 */

/**
 *
 * @author Toby Sriratanakoul
 */
public class ITC206_A2_Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
              
        // Create objects for the events
        // Using default constructor with no arguments
        Event event1 = new Event();
        // Using constructor for title and status
        Event event2 = new Event("UFC 300",Event.ON);
        // Using contructor overload for all arguments
        Event event3 = new Event("Essendon vs Collingwood","Football",Event.DONE,Event.HIGH);
        
        // Setting attributes for event1
        event1.setTitle("Melbourne F1");
        event1.setCategory("Racing");
        event1.setStatus(Event.PENDING);
        event1.setPopularity(Event.LOW);
        
        // Setting attributes for event2
        event2.setCategory("MMA");
        event2.setPopularity(Event.MEDIUM);
        
        // Display the events details
        System.out.println(event1.toString());
        System.out.println(event2.toString());
        System.out.println(event3.toString());
    }
}
