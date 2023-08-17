/*
• Data fields: book ID, book name, author name, publisher name, published year, edition, price
and current stock in the library.
• A constructor that create book information using book ID, book name, author name, price and
current stock.
• A get method to return the book ID
• An issuebook method to reset the current stock and print the current stock status with book
name and author name.
• A returnbook method to reset the current stock and print the current stock status with book
name and author name.
 */

/**
 *
 * @author mano itc206
 */
public class Book{
    private int bookID;
    private String bookName;
    private String authorName;
    private String publisher;
    private int publishedYear;
    private String edition;
    private double price;
    private int currentStock;
    
    //use the constructor to set the data fields book ID, book name, author name,
    //price and current stock
    public Book(int bookID, String bookName, String authorName, double price, int
    currentStock){
        this.bookID=bookID;
        this.bookName=bookName;
        this.authorName=authorName;
        this.price=price;
        this.currentStock=currentStock;
    }
    
    //return book Id
    public int getBookID(){
        return bookID;
    }
    
    //reset the stock after issue book
    public void issueBook(){
        currentStock=currentStock-1;
        System.out.println("Issue Book: Name- " + bookName + " Author- " +
                authorName +" Current stock- " +currentStock);
    }
    
    //reset the stock after return book
    public void returnBook(){
        currentStock=currentStock+1;
        System.out.println("Return Book: Name- " + bookName + " Author- " +
        authorName +" Current stock- " +currentStock);
    }
}