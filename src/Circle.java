/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jsquared21
 */
public class Circle 
        extends GeometricObject_V2 {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
            this.radius = radius;
    }

    public Circle(double radius, 
            String color, boolean filled) {
            this.radius = radius;
            setColor(color);
            setFilled(filled);
    }

    /** Return radius */
    public double getRadius() {
            return radius;
    }

    /** Set a new radius */
    public void setRadius(double radius) {
            this.radius = radius;
    }

    @Override /** Return area */
    public double getArea() {
            return radius * radius * Math.PI;
    }

    /** Return diameter */
    public double getDiameter() {
            return 2 * radius;
    }

    @Override /** Return perimeter */
    public double getPerimeter() {
            return 2 * radius * Math.PI;
    }

    @Override /** Return String description of Circle object */
    public String toString() {
            return super.toString() + "\nRadius: " + radius + "\nArea: " + getArea() +
                    "\nDiameter: " + getDiameter() + "\nPerimeter: " + getPerimeter();
    }

}