package encapsulation;

public class Product {
	// this is called Java Bin class.
	
	
	//data hiding, secure data
	private int price;
	
	//setter
	//it should be public
	public void setPrice(int price) {
		//validation
		if(price>0) {
		this.price = price;
		}
	}
	
	//getter method
	public int getPrice() {
		return price;
	}
}
