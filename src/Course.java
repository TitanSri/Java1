/*********************************************************************************
*       Course                                   *
* -courseName: String
* -students[]: String
* -numberOfStudents: int
* ---------------------------
* +addStudent(): String
* +getStudents(): String
* +getNumberOfStudents(): int
* +getCourseName(): String
* +dropStudent(): String
* +dropStudent(): int
* +findStudent(): String
* +clear():
*********************************************************************************/

/**
 *
 * @author jsquared21
 * edited by Toby Sriratanakoul
 */
public class Course {
    
    private String courseName;
    private String[] students = new String[0];
    private int numberOfStudents;

    public Course(String courseName) {
      this.courseName = courseName;
    }

    
    public void addStudent(String student) {
        // Automatically increase the array size by 1
        if (numberOfStudents == students.length){
            String[] a = new String[students.length +1]; // Creates a new array a
            for (int i = 0; i < numberOfStudents; i++){
                a[i] = students[i]; // Copies student index to array a index
            }
            students = a; // Replace student array with array a
        }
      students[numberOfStudents] = student; // New student is added
      numberOfStudents++;
    }

    public String[] getStudents() {
      return students;
    }

    public int getNumberOfStudents() {
      return numberOfStudents;
    }  

    public String getCourseName() {
      return courseName;
    }  
    
    // Remove a student from a course
    public void dropStudent(String student) {
      int index = findStudent(student);
      if (index >= 0){
          dropStudent(index);
      }
      else{
          System.out.println(student + " is not in the course: " + courseName);
      }
    }
    
    // Delete a Student from the array using PRIVATE dropStudent 
    // with the index number from above
    private void dropStudent(int index){
        String[] s = new String[students.length -1];  // Create array s
        for (int i = 0, j = 0; i < s.length; i++, j++){
            if (i == index){
                j++; // Skips the student that is found in the index
            }
            s[i] = students[j]; // Adds the student from index to array s
        }
        this.students = s; // Replace students with array s
        numberOfStudents--; // Decrease the number of students
    }
    
    // Returns the index if students is found. Otherwise returns -1 
    private int findStudent(String student){
        for (int i = 0; i < numberOfStudents; i++){
            if (students[i].equals(student)){
                return i;
            }
        }
        return -1;
    }
    
    // Removes all students from the course 
    public void clear() {
        students = new String[0];
        numberOfStudents = 0;
    }
}

