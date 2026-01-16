package Encapsulation;

public class BankAccount {
		private String accountNumber;
		private long bankBalance;
		BankAccount(String accountNumber,long bankBalance){
			this.accountNumber = accountNumber;
			this.bankBalance = bankBalance;
		}
		public void deposit(long amount) {
			if(amount>0) {
				bankBalance+=amount;
			}else {
				System.out.println("Enter Valid Amount.");
			}
		}
		
		public void withdraw(long amount) {
			if(amount>bankBalance) {
				System.out.print("Please enter valid amount");
			}else {
				bankBalance-=amount;
			}
		}
		public void getBalance() {
			System.out.println("Balance in your account: "+bankBalance);
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount acc = new BankAccount("196700010342", 15000);
		
		acc.deposit(500);
		acc.getBalance();
		acc.withdraw(500);
		acc.getBalance();
	}

}
