package Encapsulation;

public class LibraryBook {
		private double price;
		 LibraryBook(double price) {
			if(price<0) {
				this.price = 0;
			}
			this.price = price;
			
		}
		public void updatePrice(double updatedPrice) {
			if(updatedPrice>0) {
				price+=updatedPrice;
				System.out.println("Book Price is Updated");
			}
		}
		public void display() {
			System.out.println("Book price is "+price);
		}
		
	public static void main(String[] args) {
		
			LibraryBook book = new LibraryBook(30);
			book.updatePrice(50);
			book.display();
	}

}
