package loopNumbersProblem;
import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int number = sc.nextInt();
		int original = number;
		int backUp = number;
		int remainder=0,sum=0,count=0;
		int power=0;
		while(number>0) {
			remainder = number%10;
			count++;
			number/=10;
		}
		while(backUp>0) {
			remainder = backUp%10;
			power = (int)Math.pow(remainder, count);
			sum+=power;
			backUp/=10;
		}
		System.out.println("Is Armstrong: "+(sum==original));
		sc.close();
	}

}
