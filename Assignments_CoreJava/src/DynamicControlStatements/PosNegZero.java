package DynamicControlStatements;
import java.util.Scanner;
public class PosNegZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Number: ");
		int number = sc.nextInt();
		if(number==0) System.out.println(number+" is Zero.");
		else if(number>0) System.out.println(number+" is Positive Number.");
		else System.out.println(number+" is Negative Number.");
		sc.close();
	}

}
