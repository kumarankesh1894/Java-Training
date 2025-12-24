package loopNumbersProblem;
import java.util.Scanner;
public class CountofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int backUp=number;
		int count=0;
		while(number>0) {
			int split = number%10;
			number = number/10;
			count++;
		}
		System.out.println(count);
		sc.close();
	}

}
