package DynamicControlStatements;
import java.util.Scanner;
public class PercentGradeofStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the marks of 5 Subjects: ");
		double marks1 = sc.nextDouble();
		double marks2 = sc.nextDouble();
		double marks3 = sc.nextDouble();
		double marks4 = sc.nextDouble();
		double marks5 = sc.nextDouble();
		double percentage = (marks1+marks2+marks3+marks4+marks5)/500*100;
		System.out.println("Percentage: "+percentage);
		if(percentage>=0 && percentage<=20) System.out.println("Grade is F");
		else if(percentage>=60 && percentage<80) System.out.println("Grade is A");
		else if(percentage>=20 && percentage<40) System.out.println("Grade is C");
		else if(percentage>=40 && percentage<60) System.out.println("Grade is B");
		else if(percentage>=80 && percentage<=100) System.out.println("Grade is O");
		else System.out.println("Fail");
		sc.close();
	}

}
