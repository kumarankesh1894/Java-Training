package Operators_Assignment;

public class Problem5 {

	public static void main(String[] args) {
		int examDurationInMinutes = 90;
		boolean isPhysicallyChallenged = false;
		int attendancePercentage = 60;
		boolean isAdminApproved = true;
		boolean isExtraTime = (!isPhysicallyChallenged || attendancePercentage>60) ||(!isAdminApproved) ? false:true;
		int extraTime = isExtraTime ? 10 : 0;
		int totaltime = extraTime+examDurationInMinutes;
		System.out.println("Is ELigible for Extra Time: "+isExtraTime+"\n Extra Time given: "+extraTime+"\nTotal Time: "+totaltime);
		
	}

}
