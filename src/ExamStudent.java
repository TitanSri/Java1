
import java.util.Scanner;

/*
 * Create 3 student (1 default then set later, 1 overload, 1 input)
 * Create get and set methods (set avarage must be between 0 and 100
 * Display all in one single line
 */

/**
 *
 * @author admin
 */
public class ExamStudent {
    
    private String studentName;
    private double averageMark;

    public ExamStudent(){
        studentName = "unknown";
        averageMark = 0;
     }

    public ExamStudent(String studentName, double averageMark){
        this.studentName = studentName;
        this.averageMark = averageMark;
    }

    //Method get and set
    public String getStudentName(){
            return studentName;
    }
    public double getAverageMark(){
        return averageMark;
    }
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    public void setAverageMark(double averageMark){
        if (averageMark >= 0 || averageMark <=100)
            this.averageMark = averageMark;
    }

    //to String
    public String toString(){
        return ("The student's name is " + studentName +
                " and their average mark is " + averageMark);
    }

    // Main
    public static void main(String[] args) {
        ExamStudent student1 = new ExamStudent();
        ExamStudent student2 = new ExamStudent("Jamie", 65);

        student1.setStudentName("Jack");
        student1.setAverageMark(57);

        System.out.println("Enter a name: ");
        Scanner input = new Scanner(System.in);
        String student3Name = input.nextLine();
        System.out.println("Enter the average mark: ");
        double student3AverageMark = input.nextDouble();

        ExamStudent student3 = new ExamStudent(student3Name, student3AverageMark);

        System.out.println(student1);   
        System.out.println(student2);   
        System.out.println(student3); 
    }
}