package Encapsulation;

public class AtmPin {
		private int pin;
		AtmPin(int pin){
			this.pin = pin;
		}
		public void setPin(int pin,int newPin) {
			if(pin==this.pin)
			this.pin = newPin;
		}
		public void getPin() {
			System.out.println("Your New Pin is "+pin);
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			AtmPin atm = new AtmPin(1894);
			atm.setPin(1894, 1895);
			atm.getPin();
	}

}
