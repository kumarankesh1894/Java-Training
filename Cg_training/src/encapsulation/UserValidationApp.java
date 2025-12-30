package encapsulation;

public class UserValidationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			UserValidation user = new UserValidation("Ankesh","hello123");
			user.setPassword("hello123", "qwerty123");
//			System.out.println(user.getPassword());
			System.out.println(user.getUser());
			
	}

}
