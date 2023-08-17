/************************
 *          Fan         *
 * ---------------------*
 * +Slow:   int         *
 * +MEDIUM: int         *
 * +FAST:   int         *
 *                      *
 * -speed:  int         *
 * -on:     boolean     *
 * -radius: double      *
 * +colour: String      *
 * ---------------------*
 * +Fan()               *
 * +setSpeed(int)       *
 * +setRadius(double)   *
 * +setColour(String)   *
 * +turnOn()            *
 * +turnOff()           *
 * +getSpeed(): String  *
 * +getRadius():double  *
 * +getColour():String  *
 * +isOn():     boolean *
 * +toString(): String  *
 * **********************
 */

/**
 *
 * @author jsquared21
 * edited by Toby Sriratanakoul
 */
public class Fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    private int speed;
    private double radius;
    String colour;
    private boolean on;
    
    // Constructor that creates a default fan
    Fan(){
        speed = SLOW;
        on = false;
        radius = 5;
        colour = "blue";
    }
    
    // ***Mutator***
    // Set speed
    public void setSpeed(int newSpeed){
        speed = newSpeed;
    }
    
    // Set Radius
    public void setRadius(double newRadius){
        radius = newRadius;
    }
    
    // Set Colour
    public void setColour(String newColour){
        colour = newColour;
    }
    
    // Turn On fan
    public void turnOn(){
        on = true;
    }
    
    //Turn Off fan
    public void turnOff(){
        on = false;
    }
    
    // ***Accessor***
    // Return speed
    public String getSpeed(){
        String s = "";
        switch (speed){
            case SLOW: s = "SLOW"; break;
            case MEDIUM: s = "MEDIUM"; break;
            case FAST: s = "FAST"; break;
        }
        return s;
    }
    
    //Return on
    public boolean isOn(){
        return on;
    }
    
    //Return radius
    public double getRadius(){
        return radius;
    }
    
    //Return colour
    public String getColour(){
        return colour;
    }
    
    // Return description of the fan
    public String toString(){
        if (on == true){
            return "\nFan speed: " + getSpeed() + "\nFan colour: " + colour +
                    "\nFan radius: " + radius + "\n";
        }
        else{ 
            return "\nFan colour: " + colour + "\nFan radius: " + radius +
                    "\nFan is 'OFF'\n";
        }
    }
}
