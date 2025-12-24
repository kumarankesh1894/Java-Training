package Operators_Assignment;

public class Problem6 {

	public static void main(String[] args) {
		int speedlimit = 60; int speed = 90;
		int totalpenalty = 0; int fine = 500;
		boolean isEmergencyProvider = false;
		
		boolean isFine = !isEmergencyProvider && speed>speedlimit ? true:false;
		totalpenalty = isFine ? totalpenalty+=fine :0;
		System.out.println("Is Fine Applied: "+isFine+"\n The Total Penalty: "+totalpenalty);
	}

}
