            //UML Class Diagram                     
/**************************************************
*               Rectangle                         *  
* ------------------------------------------------*  
* width: double                                   *
* height: double                                  * 
* Rectangle()                                     *  
* Rectangle(newWidth: double, newHeight: double)  *
* getArea(): double                               *
* getPerimeter(): double                          *
***************************************************/

/**
 * 
 * @author jsquared21
 * edited by Toby Sriratanakoul
 */

//Define the class
public class Rectangle 
        extends GeometricObject_V2{
    double width; // Declare Width of rectangle
    double height; // Declare Height of rectangle
    
    // A no-arg constructor that creates a default Rectangle
    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;        
    }
    
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
               
    }
    
    public Rectangle(
		double width, double height, String color, boolean filled) {
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(filled);
	}
    
    /** Return width */
    public double getWidth() {
            return width;
    }

    /** Set a new width */
    public void setWidth(double width) {
            this. width = width;
    }

    /** Return height */
    public double getheight() {
            return height;
    }

    /** Set a new height */
    public void setheight(double height) {
            this.height = height;
    }
    
    // Return the area of this rectangle
    public double getArea(){
        return this.width * this.height;
    }
    
    // Return the perimter of this rectangle 
    public double getPerimeter(){
        return 2 * (this.width + this.height);
    }
}
