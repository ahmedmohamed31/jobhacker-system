package library;
import java.util.ArrayList;
import java.util.Scanner;


class Book {
	
	private String title;
    private String author;
    private int bookId;
    private int version;
    private boolean available;
    
    public Book(String title, String author, int bookId, int version) {
        this.title = title;
        this.author = author;
        this.bookId = bookId;
        this.version = version;
        this.available = true;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public int getBookId() {
        return bookId;
    }
    
    public int getVersion() {
        return version;
    }
    
    public boolean isAvailable() {
        return available;
    }
    
    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    
    public String bookDetails() {
        return title + " book written by " + author + ", ID: " + bookId + ", Version: " + version;
    }
	
	public void checkoutBook() {
        available = false ;
    }
	
	public void returnBook() {
        available = true ; 
    }
	

	
	
}
	
