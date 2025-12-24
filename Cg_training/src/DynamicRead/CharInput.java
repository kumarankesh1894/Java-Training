package DynamicRead;
import java.util.Scanner;
public class CharInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(ch=='A' ||ch=='a') {
			System.out.println("Apple");
		}
		else if(ch=='B' ||ch=='b') {
			System.out.println("Ball");
		}
		else if(ch=='C' ||ch=='c') {
			System.out.println("Capgemini");
		}
		else if(ch=='D' ||ch=='d') {
			System.out.println("Dog");
		}
		else if(ch=='E' ||ch=='e') {
			System.out.println("Einstein");
		}
		else if(ch=='F' ||ch=='f') {
			System.out.println("Fuck");
		}
		else if(ch=='G' ||ch=='g') {
			System.out.println("Goat");
		}
		else if(ch=='H' ||ch=='h') {
			System.out.println("Hen");
		}
		else {
			System.out.println("Please Provide Character Value.");
		}
		sc.close();
	}

}
