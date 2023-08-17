/********************************
 *      GeometricObject_V2      *
 * -----------------------------*
 * -color: String               *
 * -filled: boolean             *
 * -dateCreated: java.util.Date()*
 * -----------------------------*
 * +GeometricObject()           *
 * +GeometricObject(color: String, filled: boolean)*
 * +getColor(): String          *
 * +setColor(color: String): void*
 * +getisFilled(): boolean      *
 * +setFilled(filled: boolean): void*
 * +getDateCreate(): java.util.Date*
 * +toString(): String          *
 * ******************************
 */

/**
 *
 * @author Daniel Liang
 */
public abstract class GeometricObject_V2 
        implements Comparable<GeometricObject_V2>{
    
      private String color = "white";
      private boolean filled;
      private java.util.Date dateCreated;

      /** Construct a default geometric object */
      protected GeometricObject_V2() {
        dateCreated = new java.util.Date();
      }

      /** Construct a geometric object with color and filled value */
      protected GeometricObject_V2(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
      }

      /** Return color */
      public String getColor() {
        return color;
      }

      /** Set a new color */
      public void setColor(String color) {
        this.color = color;
      }

      /** Return filled. Since filled is boolean,
       *  the get method is named isFilled */
      public boolean isFilled() {
        return filled;
      }

      /** Set a new filled */
      public void setFilled(boolean filled) {
        this.filled = filled;
      }

      /** Get dateCreated */
      public java.util.Date getDateCreated() {
        return dateCreated;
      }
      
      // To string override interface Comparable
      @Override 
      public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
          " and filled: " + filled;
      }
      
      // Implement the compareTo method defined in Comparable to override
      @Override 
        public int compareTo(GeometricObject_V2 o) {
                if (this.getArea() > o.getArea())
                        return 1;
                else if (this.getArea() < o.getArea())
                        return -1;
                else
                        return 0;
        }

        /** Abstract method getMax */
        public static GeometricObject_V2 max_V2(GeometricObject_V2 o1, GeometricObject_V2 o2) {
                return o1.compareTo(o2) == 1 ? o1 : o2;
        }

        /** Abstract method getArea */
        public abstract double getArea();

        /** Abstract method getPerimeter */
        public abstract double getPerimeter();
}