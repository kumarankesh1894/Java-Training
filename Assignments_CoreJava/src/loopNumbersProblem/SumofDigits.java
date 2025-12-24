package loopNumbersProblem;
import java.util.Scanner;
public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int backUp = number;
		int sum=0;int remainder=0;
		while(number>0) {
			remainder = number%10;
			 sum += remainder;
			number = number/10;
		}
		System.out.println("Sum of "+backUp+" is "+sum);
		sc.close();
	}

}
