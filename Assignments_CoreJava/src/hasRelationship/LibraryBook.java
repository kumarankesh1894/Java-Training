package hasRelationship;

public class LibraryBook {
		private String title, author;
		private int bookId;
		public LibraryBook(int bookId,String title,String author) {
			this.bookId = bookId;
			this.title = title;
			this.author = author;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public int getBookId() {
			return bookId;
		}
		public void setBookId(int bookId) {
			this.bookId = bookId;
		}
		
		
}
