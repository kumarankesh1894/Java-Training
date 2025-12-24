package Operators_Assignment;

public class Problem3 {

	public static void main(String[] args) {
		int performanceRating = 5;
		double salary = 100000;
		int yearsExperience = 6;
		boolean disciplinaryAction = false;
		boolean isEligible = !disciplinaryAction && (performanceRating<4 ||yearsExperience<5) ? false:true;
		salary = isEligible? salary+=30000 : salary;
		System.out.println("Is Employee Eligible: "+isEligible+"\nSalary after incement: "+salary);
	}

}
