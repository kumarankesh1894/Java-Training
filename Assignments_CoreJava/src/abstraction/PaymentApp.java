package abstraction;

public class PaymentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment payment;
		//object creation of credit card payment
		payment = new CreditCardPayment();
		payment.processPayment(5000);
		payment.printReceipt();
		
		//object creation of UPI payment
		
		payment = new UPIPayment();
		payment.processPayment(8000);
		payment.printReceipt();
		
		//object creation of NetBanking Payment
		
		payment = new NetBankingPayment();
		payment.processPayment(1890000);
		payment.printReceipt();
		
	}

}
