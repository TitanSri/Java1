/*
• A IssueBook method that will take book and student class object as parameter and then reset
the issuebook method of Book and Student class.
• A ReturnBook method that will take book and student class object as parameter and then reset
the ReturnBook method of Book and Student class.
 */

/**
 *
 * @author admin
 */
public class IssueReturn {
    //check the student and book status after issue book
    public void IssueBook(Book book, Student_Book student){
        book.issueBook();
        student.issueBook(book.getBookID());
    }
    
    //check the student and book status after return book
    public void ReturnBook(Book book, Student_Book student){
        book.returnBook();
        student.returnBook(book.getBookID());
    }
}