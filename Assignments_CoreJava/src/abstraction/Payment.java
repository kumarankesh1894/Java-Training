package abstraction;

public abstract class Payment {
	public abstract void processPayment(double amount);
	public void printReceipt() {
			System.out.println("The Payment receipt is Generated.");
	}
}

class CreditCardPayment extends Payment{
		public void processPayment(double amount) {
			System.out.println("Processing Credit Card Payment.....\n The debited amount is "+amount);
			
		}
}
class NetBankingPayment extends Payment{
	public void processPayment(double amount) {
		System.out.println("Processing Payment Through NetBanking.....\n The debited amount is "+amount);
		
	}
}
class UPIPayment extends Payment{
	public void processPayment(double amount) {
		System.out.println("Processing UPI Payment.....\n The debited amount is "+amount);
		
	}
}
