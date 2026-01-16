package hasRelationship;

public class Library {
			
	LibraryBook [] book = new LibraryBook[4];
	int i=0;
	public void addBook(LibraryBook books) {
		this.book[i] = books;
		i++;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib = new Library();
		lib.addBook(new LibraryBook(121, "The Hidden Man", "Pablo"));
		lib.addBook(new LibraryBook(122, "IKIGAI", "Shang Huan"));
		lib.addBook(new LibraryBook(123, "The Hidden Hindu", "Akshat Gupta"));
		lib.addBook(new LibraryBook(124, "Madigudi", "Premchand"));
		
		System.out.println("Book Details........................\n");
		for(int i=0;i<lib.book.length;i++) {
			
			System.out.println("Book ID: "+lib.book[i].getBookId());
			System.out.println("Book Name: "+lib.book[i].getTitle());
			System.out.println("Book Author: "+lib.book[i].getAuthor());
			System.out.println();
		}
	}

}
