package hasRelationship;

public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book();
		for(int i=0;i<b.pages.length;i++) {
			System.out.println("Page No: "+b.pages[i].getPageNo());
		}
	}

}
