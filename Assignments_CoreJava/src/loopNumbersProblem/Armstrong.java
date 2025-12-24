package loopNumbersProblem;
import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int number = sc.nextInt();
		int backUp = number;
		int remainder=0,sum=0;
		int power=0;
		while(number>0) {
			remainder = number%10;
			power = (int)Math.pow(remainder, 3);
			sum+=power;
			number/=10;
		}
		System.out.println("Is Armstrong: "+(sum==backUp));
		sc.close();
	}

}
