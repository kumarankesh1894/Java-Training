package objectClass;

public class PhoneApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Phone phone = new Phone("Samsung");
			phone.setPhoneDetails(new InternalPartsOfPhone(4, 64));
			System.out.println(phone);
			phone.setPhoneBrand("Nokia");
			phone.setPhoneDetails(new InternalPartsOfPhone(6, 128));
			System.out.println(phone);
	}

}
