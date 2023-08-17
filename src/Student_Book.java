/*
• Data fields: student ID, student name, school, email, books taken by the student (array and its
size is 3) and book issued for the student.
• A constructor that create a student information using student ID, school, email, book taken (set 3
length array and set all are -1), book issued (set as 0).
• A howManyBooks method to return the book issued status.
• An issuebook method to take a book ID as parameter to reset the book taken and book issued
status.
• A returnbook method to take a book ID as parameter to reset the book taken and book issued
status.
 */

/**
 *
 * @author admin
 */
public class Student_Book {
    //data fields for the student class
    private int studentID;
    private String studentName;
    private String school;
    private String email;
    private int [] booksTaken;
    private int booksIssued;
    
    //use constructor to set the data fields of the student
    public Student_Book(int studentId,String studentName,String school,String email){
        this.studentID=studentID;
        this.studentName=studentName;
        this.school=school;

        this.email=email;
        booksTaken=new int [3];
        
        // create an array that is all -1 (empty book id)
        for (int i=0;i<3;i++)
            booksTaken[i]=-1;
        booksIssued=0;
    }
    
    //check the issued book status for the student
    public int howManyBooks(){
        System.out.println("Number of books issued: " + booksIssued +
                "/" + booksTaken.length);
        return booksIssued;
    }
    
    //reset the book array after issued book for the student
    public void issueBook(int bookID){
        int key=-1;
        
        // finds the index with -1 (empty)
        for (int i=0;i<3;i++)
            if(booksTaken[i]==key){
                key=i;
                break;
            }
        
        // changes the value or the empty index(-1) to the book ID
        this.booksTaken[key]=bookID;
        this.booksIssued=booksIssued+1;
    }
    
    //reset the book array after returned book for the student
    public void returnBook(int bookID){
        int key=-1;
        
        // find the index with the value of the book ID
        for (int i=0;i<3;i++)
            if(booksTaken[i]==bookID)
                key=i;
            
            // change the value of the index with the book ID to -1 (empty)
            this.booksTaken[key]=-1;
            this.booksIssued=booksIssued-1;
    }
}