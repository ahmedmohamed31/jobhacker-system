package library;
import java.util.ArrayList;
import java.util.Scanner;

	
class User{
	
	private String userName ; 
	private int userID;
	protected ArrayList<Book> borrowedBooks;	
	public User ( String userName , int userId  )
		{
			this.userName = userName ;
			this.userID = userId ;
			borrowedBooks = new ArrayList <>();
			
		}

	public int getId() {
        return userID; // return userID if needed
    }
	
	public String getName() {
        return userName; // return userName if needed
    }
	
	public void borrowBook(Book book) {
	  if(book!=null){
        if (book.isAvailable()) { // book isn't borrowed by another user
            book.checkoutBook();
            borrowedBooks.add(book);
            System.out.println("The " + book.getTitle() + " book is successfully borrowed.");
        } 
		else {
            System.out.println("The " + book.getTitle() + " is borrowed by another user ") ;
		}
	  }
	  else
		  System.out.println("Sorry no book with this id ") ;
		  
	

	}
}

