/*********************************************************************************
* (The Course class) Revise the Course class as follows:                         *
*                                                                                *
* ■ The array size is fixed in Listing 10.6. Improve it to automatically         *
*   increase the array size by creating a new larger array and copying the       *
*   contents of the current array to it.                                         *
* ■ Implement the dropStudent method.                                            *
* ■ Add a new method named clear() that removes all students from the            *
*   course.                                                                      *
*                                                                                *
* Write a test program that creates a course, adds three students, removes one,  *
* and displays the students in the course.                                       *
*********************************************************************************/
/**
 *
 * @author jsquared21
 * edited by Toby Sriratanakoul
 */
public class TestCourse {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Create a course
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");
        
        // Add three students
        course1.addStudent("Peter Jones");
        course1.addStudent("Brian Smith");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");
        
        // Remove student from course1
        course1.dropStudent("Peter Jones");
        
        // Display the students in the course1
        System.out.println("\nNumber of students in " + course1.getCourseName() 
                + ": " + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
          System.out.print(students[i] + ", ");

        // Display the students in course2
        System.out.println("\nNumber of students in " + course2.getCourseName() 
                + ": " + course2.getNumberOfStudents());
        String[] students2 = course2.getStudents();
        for (int i = 0; i < course2.getNumberOfStudents(); i++)
          System.out.print(students2[i] + ", ");
        
        course2.clear(); // Clear the course
        // Display the students in course2
        System.out.println("\nNumber of students in " + course2.getCourseName() 
                + ": " + course2.getNumberOfStudents());
        String[] students3 = course2.getStudents();
        for (int i = 0; i < course2.getNumberOfStudents(); i++)
          System.out.print(students3[i] + ", ");
    }
}
