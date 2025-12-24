package DynamicRead;
import java.util.Scanner;
public class StudentData {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Student Name: ");
		String name = sc.nextLine();
		System.out.println("Student Rollno: ");
		int rollno = sc.nextInt();
		System.out.println("Student Marks: ");
		double marks = sc.nextDouble();
		System.out.println("Student Grade: ");
		String grade = sc.next();
		System.out.println("Student Result: ");
		boolean isPass = sc.nextBoolean();
		System.out.println("Name: "+name);
		System.out.println("Roll no: "+rollno);
		System.out.println("Marks: "+marks);
		System.out.println("Grade: "+grade);
		System.out.println("Is Student Pass or Fail: "+isPass);
		
		sc.close();
	}

}
