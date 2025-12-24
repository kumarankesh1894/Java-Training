package loopNumbersProblem;
import java.util.Scanner;
public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int power = number*number;
		
		int sum=0;int remainder=0;
		while(power>0) {
			remainder = power%10;
			 sum += remainder;
			power = power/10;
		}
		System.out.println("Is Neon Number: "+(sum==number));
		sc.close();
	}

}
