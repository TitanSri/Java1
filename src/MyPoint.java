/************************************
 *          MyPoint                 *
 * -------------------------        *
 * -x: double                       *
 * -y: double                       *
 * -------------------------        *
 * +MyPoint()                       *
 * +MyPoint(x: double, y: double)   *
 * +getX(): double                  *
 * +getY(): double                  *
 * +distance(myPoint:   MyPoint)    *
 * +distance(x: double, y: double   *
 * **********************************
 */

/**
 *
 * @jsquared21
 * edited by Toby Sriratanakoul
 */
public class MyPoint {
    //Data fields
    private double x;
    private double y;
    
    // No-arg constructor that created (0,0)
    MyPoint(){
        this(0, 0);
    }
    
    // Constructs a point with specified coordinates
    MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    // Return x
    public double getX(){
        return x;
    }
    
    // Return y
    public double getY(){
        return y;
    }
    
    // Return the distance from this point to a specific point
    // of the MyPoint type
    public double distance(MyPoint myPoint){
        return Math.sqrt(Math.pow(myPoint.getX() - x, 2) +
                Math.pow(myPoint.getY() - y, 2));
    }
    
    //Return this distance from this point to another point with
    // specific x- and y- cordinates
    public double distance(double x, double y){
        return distance(new MyPoint(x, y));
    }
}
