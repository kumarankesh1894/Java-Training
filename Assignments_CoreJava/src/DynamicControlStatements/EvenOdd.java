package DynamicControlStatements;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Your Number: ");
	int number = sc.nextInt();
	if((number & 1) ==0) {
		System.out.println(number+" is Even.");
	}else {
		System.out.println(number+" is Odd.");
	}
	sc.close();
}
}
