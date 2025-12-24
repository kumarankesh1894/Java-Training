package Operators_Assignment;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalPurchaseAmount = 30000;
		boolean isPremium = true;
		boolean isFirsttimeCustomer = false;
		boolean isDiscountEligible = (totalPurchaseAmount<20000 && !isPremium ) || (!isFirsttimeCustomer)? false:true;
		double finalBill = isDiscountEligible ? totalPurchaseAmount-(totalPurchaseAmount*0.3) : totalPurchaseAmount;
		System.out.println("Is Discount Eligible: "+isDiscountEligible+"\nFinal Bill: "+finalBill);
	}

}
