package hasRelationship;

public class StudentAddress {
	private String city,state;
	private int pinCode;
	
	StudentAddress(String city,String state, int pincode){
		this.city = city;
		this.state = state;
		this.pinCode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
}
