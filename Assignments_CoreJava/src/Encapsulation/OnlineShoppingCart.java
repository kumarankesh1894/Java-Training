package Encapsulation;

public class OnlineShoppingCart {

	private int totalAmount;
	private int items;
	 OnlineShoppingCart(int items,int totalAmount) {
		// TODO Auto-generated constructor stub
		 if(totalAmount>0 && items>0) {
			 this.totalAmount = totalAmount;
			 this.items = items;
		 }else {
			 this.totalAmount = 0;
			 this.items=0;
		 }
	 
	}
	
	public void addItems(int item,int additemAmount) {
		items+=item;
		totalAmount+=additemAmount;
		System.out.println("Item has been added and total amount is updated.");
	}
	public void removeItems(int item,int removeitemAmount) {
		items-=item;
		totalAmount-=removeitemAmount;
		if(totalAmount<=0 || items<=0) totalAmount=0;
		System.out.println("Item has been removed successfully and total amount is updated.");
	}
	public void getAmount() {
		System.out.println("Total No of items: "+items+" Total Amount: "+totalAmount);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OnlineShoppingCart item = new OnlineShoppingCart(1,100);
		item.addItems(1,425);
		item.removeItems(1,100);
		item.getAmount();

	}

}
