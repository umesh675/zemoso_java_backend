package assignment.assignment6;

public class Book {

    private String bookName;
    private String authorName;
    private int pageNo;

    public Book(String bookName, String authorName){
        this.bookName  = bookName;
        this.authorName = authorName;
    }

    public Book(String bookName, String authorName, int pageNo){
        this(bookName,authorName);//must be first statement
        this.pageNo = pageNo;
        //this(bookName,authorName);
    }
}
