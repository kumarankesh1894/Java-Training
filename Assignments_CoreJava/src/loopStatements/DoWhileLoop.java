package loopStatements;
import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);	
		char ch = 'n';
		do {
			System.out.println("Welcome");
			System.out.println("Do you Want me to print again? ");
			ch = sc.next().charAt(0);
		}while(ch=='Y' || ch=='y');
		sc.close();
	}

}
