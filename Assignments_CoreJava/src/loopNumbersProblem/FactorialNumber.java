package loopNumbersProblem;
import java.util.Scanner;
public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		long number = sc.nextInt();
		long fact=1;
		for(int i=1;i<=number;i++) {
			fact*=i;
		}
		System.out.println(fact);
		sc.close();
		
	}

}
