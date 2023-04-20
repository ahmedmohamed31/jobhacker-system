package library;
import java.util.ArrayList;
import java.util.Scanner;

class Library {
	
	private String libName ; 
	private int libCode ; 
	private ArrayList<Book> books; 
	public Library(String name, int code) {
        this.libName = name;
        this.libCode = code;
        books = new ArrayList<>();
    }
	public void addBook(Book book) {
        books.add(book); // this method is a method for arraylist to add book objects
        System.out.println("The " + book.getTitle() + " book is successfully added to the library.");
    }
	public void removeBook(Book book) {
        if (books.remove(book))// this method is a method for arraylist to remove book objects and return true if exists
        System.out.println("The " + book.getTitle() + " book is successfully  removed from the library.");
		else 
		System.out.println("The " + book.getTitle() + " book is not found in the library.");
	}
	
	public int getCode() {
        return libCode;
    }
	
	public void displayAvailableBooks() {
		int counter = 1;
		int c1 =0;
		System.out.println("The available books in the library are :");
        for(Book book : books) // this method is a method for arraylist to add book objects
			{
			
			
			if (book.isAvailable()){ // if available variable is true then the book isn't borrowed
				System.out.println(counter + " - "+ book.getTitle() + " . ");
				counter++;}
			}
			if(c1==0)
						System.out.println("There is no available books in this library");
	
		}

	public void displayBorrowedBooks() {
		int counter = 1;
		int c =0;
        for(Book book : books){ // this method is a method for arraylist to add book objects
			System.out.println("The borrowed books in the library are :");
			
			if (!book.isAvailable()){ // if available variable is false then the book is borrowed
				System.out.println(counter + " - "+ book.getTitle() + " . ");
				counter++;
				c++;}
			}
			if(c==0)
						System.out.println("There is no borrowed books in this library");
	
		}
		
	public void displayBookDetails(int id) {
				
        for(Book book : books){ // this method is a method for arraylist to add book objects
			
			if (book.getBookId() == id){ // if available variable is false then the book is borrowed
				System.out.println(book.bookDetails());
				break;
				}
			}
		//System.out.println(" Sorry no book exists with this id " + id );
	
		}
		
		public Book findBook(int id) { // returning book by using id to use in other methods
			for (Book book : books) {
              if (book.getBookId() == (id)) {
                return book;
            }
        }
        return null;
    }
	
		public Book findBookByName(String bookname) { // returning book by using id to use in other methods
			for (Book book : books) {
              if (book.getTitle().equals( bookname)) {
                return book;
            }
        }
        return null;
    }
}
