package Encapsulation;

public class PasswordValidation {
		private String password;
		PasswordValidation(String password){
			this.password = password;
		}
		public void setpassword(String password,String newpassword) {
			if(password==this.password)
			this.password = newpassword;
		}
		public void getpassword() {
			System.out.println("Your New password is "+password);
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			PasswordValidation atm = new PasswordValidation("ankesh1894");
			atm.setpassword("ankesh1894", "ankesh");
			atm.getpassword();
	}

}
