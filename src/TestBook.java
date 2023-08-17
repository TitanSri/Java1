/*
 Write a TestBook class that prompts the user to enter the following information using three objects of
Book, Student and IssueReturn Class:
 */

/**
 *
 * @author admin
 */
public class TestBook {
    public static void main(String[] args) {
        //create object for the Book class
        Book book1 = new Book(100, "Java Programming", "Danial Liang", 100, 10);
        Book book2 = new Book(101, "Oracle", "Bert Scalzo", 50, 5);
        Book book3 = new Book(102, "Operating System", "Michael and Scott", 80, 15);
        Book book4 = new Book(103, "Computer Architecture", "Daniel", 60, 8);

        //create object for the Student class
        Student_Book student=new Student_Book(100, "Robert", "Computing", "nasim@csu.edu.au");
        //create object for the IssueReturn class
        IssueReturn issueReturn1 = new IssueReturn();
        //issue first book for the student
        if (student.howManyBooks()<3){
            issueReturn1.IssueBook(book1, student);
        }
        //issue second book for the student
        if (student.howManyBooks()<3){
            issueReturn1.IssueBook(book2, student);
        }
        //issue third book for the student
        if (student.howManyBooks()<3){
            issueReturn1.IssueBook(book3, student);
        }
        //issue fourth book for the student but this code does not execute
        //because student has limit only three books.
        if (student.howManyBooks()<3){
            issueReturn1.IssueBook(book4, student);
        }
        //return third book by the student
        issueReturn1.ReturnBook(book3, student);
        //issue fourth book for the student. it will execute
        //because the student return the third book
        if (student.howManyBooks()<3){
            issueReturn1.IssueBook(book4, student);
        }
    }
}