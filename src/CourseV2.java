/************************************
 *          CourseV2                *
 * ---------------------------------*
 * -courseName: String              *
 * -students: ArrayList<String>     *
 * +CourseV2(String: courseName)    *
 * ---------------------------------*
 * +addStudents(String): void       *
 * +getStudents(): String[]         *
 * +getNumberOfStudents(): int      *
 * +getCourseName(): String         *
 * +dropStudent(String): void       *
 * **********************************
 */
import java.util.ArrayList;
/**
 *
 * @author admin
 */
public class CourseV2 {
    private String courseName;
    private ArrayList<String> students;
    
    // Constructor
    public CourseV2(String courseName){
        this.courseName = courseName;
        students = new ArrayList<String>();
    }
    
    //Methods
    // Add students
    public void addStudent(String student){
        students.add(student);
    }
    
    // Return students in an array
    public String [] getStudents(){
        String[] a = new String[students.size()];
        return students.toArray(a);
    }
    
    // Return number of students
    public int getNumberOfStudents(){
        return students.size();
    }
    
    // Return course name
    public String getCourseName(){
        return courseName;
    }
    
    // Drop a student
    public void dropStudent(String student){
        students.remove(student);
    }
}
