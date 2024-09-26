package library;
import java.util.ArrayList;
import java.util.Scanner;

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
            System.out.println("8. Display details of a book");
			System.out.println("9. Exit");
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
					
					scanner.nextLine();
					System.out.println("Enter book author: ");
                    String bookAuthor = scanner.nextLine();
				
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
					int countadd  = 0;
					for(Library libb :  library ){
						if (libb.getCode() == id){
						countadd++;
						libb.addBook(book);
						break;}
						 
					}
					if(countadd ==0)
						System.out.println("There is no library with this id");
                    
				
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
					int counter1=0;
					for(Library lib3 :  library ){
						if (lib3.getCode() == id3){
							
							
							lib3.displayAvailableBooks();
							counter1++;
							
						
						break;
						}
					
					}
					if(counter1==0)
						System.out.println("There is no library with this code");
                    break;
					
                case 5:
					System.out.println("Enter the library id that you want to display borrowed books in it : ");
                    int id4 = scanner.nextInt();
					int counter2=0;
					for(Library lib4 :  library ){
						if (lib4.getCode() == id4){
							
							counter2++;
							lib4.displayBorrowedBooks();
							
						
						
						}
						}
						if(counter2==0)
						System.out.println("There is no library with this code");
							
                    break;
					
				case 6:
					System.out.println("Enter the library id that you want to borrow the book from  : ");
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
					scanner.nextLine();
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
					System.out.println("Enter the library id that includes the book you want to know its details  : ");
                    int iddetails = scanner.nextInt();
					scanner.nextLine();
					int countdis = 0 ;
					for(Library libr :  library ){
						if (libr.getCode() == iddetails){
							countdis ++;
							System.out.println("Enter the book id that you want to return : ");
							int bookr = scanner.nextInt();
							if (libr.findBook(bookr)!=null ){
								libr.displayBookDetails(bookr);
							}
							else
								System.out.println("There is no book with this id in this library ");
								
							
						
						
						}
						}
						if(countdis==0)
								System.out.println("There is no library with that id ");
						
                    break;	
				
				case 9:
                    quit = true;
                    System.out.println("Exiting application...");
                    break;
                default:
                    System.out.println("Wrong choice , Please enter a number from the choices");
            }
        }
    }
					
}				
