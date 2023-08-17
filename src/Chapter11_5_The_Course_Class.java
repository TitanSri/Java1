/*********************************************************************************
* (The Course class) Rewrite the Course class in Listing 10.6. Use an ArrayList  *
* to replace an array to store students. Draw the new UML diagram for the class. *
* You should not change the original contract of the Course class (i.e., the     *
* definition of the constructors and methods should not be changed, but the      *
* private members may be changed.)                                               *
*********************************************************************************/
import java.util.*;
/**
 *
 * @author jsquared21
 * edited by Toby Sriratanakoul
 */
public class Chapter11_5_The_Course_Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // create course version 2 objects
        CourseV2 course1 = new CourseV2("Data Structures");
        CourseV2 course2 = new CourseV2("Database Systems");
        
        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");
        
        course2.addStudent("Eric Jones");
        course2.addStudent("Steve Smith");
        
        course1.dropStudent("Peter Jones");
        
        // Print the size of the array list and its members 
        System.out.println("Number of students in course1: " 
                + course1.getNumberOfStudents() + Arrays.toString(course1.getStudents()));
        
        System.out.println("Number of students in course1: "
                + course2.getNumberOfStudents() + Arrays.toString(course2.getStudents()));
        
    }
}
