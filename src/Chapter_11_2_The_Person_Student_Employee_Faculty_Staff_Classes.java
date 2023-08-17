/*********************************************************************************
* (The Person, Student, Employee, Faculty, and Staff classes) Design a           *
* class named Person and its two subclasses named Student and Employee.          *
* Make Faculty and Staff subclasses of Employee. A person has a name,            *
* address, phone number, and email address. A student has a class status         *
* (freshman, sophomore, junior, or senior). Define the status as a constant. An  *
* employee has an office, salary, and date hired. Use the MyDate class defined   *
* in Programming Exercise 10.14 to create an object for date hired. A faculty    *
* member has office hours and a rank. A staff member has a title. Override the   *
* toString method in each class to display the class name and the person’s name. *
* Draw the UML diagram for the classes and implement them. Write a test program  *
* that creates a Person, Student, Employee, Faculty, and Staff, and invokes      *
* their toString() methods.                                                      *
*********************************************************************************/

/**
 *
 * @author jsquared21
 * edited by Toby Sriratanakoul
 */
public class Chapter_11_2_The_Person_Student_Employee_Faculty_Staff_Classes {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Create a Perso, Student, Employee, Faculty, and Staff objects
        Person person = new Person("John", "12 Bell street", "3179", "john@aol.com");
        Student student = new Student("Mary", "100 Town Ave", "3001", "mary@aol.com", Student.FRESHMAN);
        Employee employee = new Employee("Mike", "34 West street", "2001", "mike@aol.com", 910, 60000);
        Faculty faculty = new Faculty("Sue", "28 Well street", "2156", "sue@aol.com", 101, 50000, "4pm to 6pm", "Professor");
        Staff staff = new Staff("Tom", "90 Country road", "4001", "tom@aol.com", 12, 65000, "Executive Assistance");
                
        // Invoke to string of Person, Student, Employee, Faculty, Staff
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
        
        Employee employee2 = new Employee("Fred");
        System.out.println(employee2.toString());
        
        Employee employee3 = new Employee("Sue", 55000);
        System.out.println(employee3.toString());
    }
}
