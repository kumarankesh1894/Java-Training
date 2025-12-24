package Operators_Assignment;

public class Problem1 {

	public static void main(String[] args) {
		int marks = 42;
		int attendance_percentage = 80;
		boolean isPass = marks>=40 && attendance_percentage>75 ? true:false;
		marks = isPass && marks<=95 ? marks+=5 : marks; 
		System.out.println("Is Student Pass: "+isPass+"\nMarks: "+marks);

	}

}
