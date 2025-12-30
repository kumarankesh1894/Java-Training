package loopNumbersProblem;
import java.util.Scanner;
public class SpyNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int sum=0,remainder=0,product=1;
		while(number>0) {
			remainder = number%10;
			sum+=remainder;
			product*=remainder;
			number/=10;
		}
		boolean isSpyNumber = (sum==product);
		System.out.println("Is Spy Number: "+isSpyNumber);
		sc.close();
	}

}
