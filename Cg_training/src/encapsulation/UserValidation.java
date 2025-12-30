package encapsulation;

public class UserValidation {
	//access modification of the variable
	private String userName;
	private String password;
	
	UserValidation(String userName, String password) {
		// TODO Auto-generated constructor stub
		this.userName = userName;
		this.password = password;
	}
	
	//setter method to set the user
	public void setUser(String userName,String password) {
		if(userName.length()>0 && this.password.equals(password)) {
		this.userName = userName;
		}
	}
	//get the user
	public String getUser() {
		
		return userName;
	}
	//setting the password
	public void setPassword(String oldPassword,String newPassword) {
		if(this.password.equals(oldPassword) && newPassword.length()>6) {
			this.password = newPassword;
		}
		else {
			System.out.println("Please Provide correct oldPassword");
		}
	}
public String getPassword() {
		
		return password;
	}
}
