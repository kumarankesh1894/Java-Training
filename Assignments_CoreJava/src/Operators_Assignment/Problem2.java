package Operators_Assignment;

public class Problem2 {

	public static void main(String[] args) {
		double accountBalance = 0;
		boolean isActive = true;
		double withdrawlAmount = 5000;
		boolean canWithdraw = accountBalance>0 && isActive ? true: false;
		double remaining_balance = canWithdraw ?  accountBalance-withdrawlAmount:0;
		System.out.println("Is Account active and Have balance: "+canWithdraw+"\nRemaining Balance: "+remaining_balance);
	}

}
