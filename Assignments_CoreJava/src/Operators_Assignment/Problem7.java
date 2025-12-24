package Operators_Assignment;

public class Problem7 {

	public static void main(String[] args) {
		int stock = 12;
		boolean fast_moving = true;
		boolean discontinued = false;
		
		boolean isReorder = stock<10 ||(fast_moving && discontinued) ? false:true;
		int stockReorder = isReorder ? stock+=100 : stock; 
		System.out.println("DO We Need to Reorder: "+isReorder+"\n Stock Quantity after Reorder: "+stockReorder);
	}

}
