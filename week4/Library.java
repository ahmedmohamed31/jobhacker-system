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
		System.out.println("The available books in the library are :");
        for(Book book : books) // this method is a method for arraylist to add book objects
			{
			
			
			if (book.isAvailable()){ // if available variable is true then the book isn't borrowed
				System.out.println(counter + " - "+ book.getTitle() + " . ");
				counter++;}
			}
	
		}

	public void displayBorrowedBooks() {
		int counter = 1;
		
        for(Book book : books){ // this method is a method for arraylist to add book objects
			System.out.println("The borrowed books in the library are :");
			
			if (!book.isAvailable()){ // if available variable is false then the book is borrowed
				System.out.println(counter + " - "+ book.getTitle() + " . ");
				counter++;}
			}
	
		}
		
	public void displayBookDetails(int id) {
				
        for(Book book : books){ // this method is a method for arraylist to add book objects
			
			if (book.getBookId() == id){ // if available variable is false then the book is borrowed
				System.out.println(book.bookDetails());
				break;
				}
			}
		System.out.println(" Sorry no book exists with this id " + id );
	
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
              if (book.getTitle() == bookname) {
                return book;
            }
        }
        return null;
    }
}
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
        return title + " by " + author + ", ID: " + bookId + ", Version: " + version;
    }
	
	public void checkoutBook() {
        available = false ;
    }
	
	public void returnBook() {
        available = true ; 
    }
	

	
	
}
	
	
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

class Application {
    public static void main(String[] args) {
        ArrayList<Library> library = new ArrayList<>(); 
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        while (!quit) {
            System.out.println("1. Enter new library");
            System.out.println("2. Add a new book");
            System.out.println("3. Remove a book");
            System.out.println("4. Display available books");
			System.out.println("5. Display borrowed books ");
			System.out.println("6. Borrow a book ");
			System.out.println("7. Return a book ");			
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
				case 1:
					System.out.println("Enter library code: ");
                    int code = scanner.nextInt();
					scanner.nextLine();
					if(code <=0)
						{System.out.println("Error you entered non valid library code");
						break;}
                    System.out.println("Enter library name: ");
                    String libraryName = scanner.nextLine();
					
                    
					//Library lib = new Library(libraryName,code);
					library.add (new Library(libraryName,code));
                    
					System.out.println("Library created successfully.");
                    break;
                case 2:
					
					
					System.out.println("Enter book author: ");
                    String bookAuthor = scanner.nextLine();
					scanner.nextLine();
					System.out.println("Enter book title: ");
                    String bookName = scanner.nextLine();
					
					System.out.println("Enter book ID: ");
					
                    int bookid = scanner.nextInt();
					if(bookid <=0)
						{System.out.println("Error you entered non valid book id");
						break;}
					
					
					System.out.print("Enter book version: ");
                    int bookver = scanner.nextInt();
					if(bookver<=0)
					{System.out.println("Error you entered non valid book version");
						break;}
				
					Book book =  new Book(bookName,bookAuthor,bookid,bookver);
		
                    System.out.println("Enter the library id that you want to add the book to : ");
                    int id = scanner.nextInt();
					for(Library libb :  library ){
						if (libb.getCode() == id){
						libb.addBook(book);
						break;}
						 
					}
                    
				
                    break;
                case 3:
                    System.out.println("Enter the library id that you want to remove the book from : ");
                    int id2 = scanner.nextInt();
					for(Library lib2 :  library ){
						if (lib2.getCode() == id2){
							System.out.println("Enter the book id that you want to remove : ");
							int b_id = scanner.nextInt();
							if (lib2.findBook(b_id)!=null )
								lib2.removeBook(lib2.findBook(b_id));
							else
								System.out.println("There is no book with this id");
						
						
						}}
					
					
                    break;
                case 4:
					System.out.println("Enter the library id that you want to display available books in it : ");
                    int id3 = scanner.nextInt();
					for(Library lib3 :  library ){
						if (lib3.getCode() == id3){
							
							
							lib3.displayAvailableBooks();
							
						
						break;
						}
					
					}
                    break;
					
                case 5:
					System.out.println("Enter the library id that you want to display borrowed books in it : ");
                    int id4 = scanner.nextInt();
					for(Library lib4 :  library ){
						if (lib4.getCode() == id4){
							
							
							lib4.displayBorrowedBooks();
							
						
						
						}
						else
							System.out.println("There is no library with this code");
						}	
							
                    break;
					
				case 6:
					System.out.println("Enter the library id that you want to borrow the book from to : ");
                    int id22 = scanner.nextInt();
					scanner.nextLine();
					for(Library libbr :  library ){
						if (libbr.getCode() == id22){
							System.out.println("Enter the book name that you want to borrow : ");
							String bookn = scanner.nextLine();
							if (libbr.findBookByName(bookn)!=null ){
								System.out.println("Enter user code: ");
								int usercode = scanner.nextInt();
								scanner.nextLine();
								System.out.println("Enter user name: ");
								String username = scanner.nextLine();
								User user = new User(username,usercode);
								user.borrowBook(libbr.findBookByName(bookn));
								user.borrowedBooks.add(libbr.findBookByName(bookn));
							    
							}
							
						
						
					}
						}
						
                    break;
					case 7:
					System.out.println("Enter the library id that you want to return the book you borrowed from  : ");
                    int idr = scanner.nextInt();
					for(Library libr :  library ){
						if (libr.getCode() == idr){
							System.out.println("Enter the book name that you want to return : ");
							String bookr = scanner.nextLine();
							if (libr.findBookByName(bookr)!=null ){
								libr.findBookByName(bookr).setAvailable(true);
							}
							
						
						
						}
						}
						
                    break;	
				
				case 8:
                    quit = true;
                    System.out.println("Exiting application...");
                    break;
                default:
                    System.out.println("Wrong choice , Please enter a number from the choices");
            }
        }
    }
					
}				
