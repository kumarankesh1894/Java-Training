package Operators_Assignment;

public class Problem8 {

	public static void main(String[] args) {
		String username="Ankesh";
		String password = "Ankesh";
		boolean account_locked = false;
		int loginattempt = 0;
		boolean userLogin = (username=="Ankesh" && password =="Ankesh")|| account_locked?true:false;
		loginattempt++;
		account_locked = loginattempt> 5 ? true:false;
		boolean User = !account_locked && userLogin? true:false;
		System.out.println("User Logged In: "+User+"\n No of attempts: "+loginattempt);
	}

}
