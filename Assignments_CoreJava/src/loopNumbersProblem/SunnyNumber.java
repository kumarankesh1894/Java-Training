package loopNumbersProblem;

import java.util.Scanner;

public class SunnyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int number = sc.nextInt();
		int backUp=number;
		int sum=0;
		while(number>0) {
			int split = number%10;
			sum+=factorialOfEachDigit(split);
			number = number/10;
			
	}
		System.out.println("Is Sunny Number: "+ (sum==backUp));
		sc.close();
	}
	public static long factorialOfEachDigit(int number) {
		long fact=1;
		for(int i=1;i<=number;i++) {
			fact*=i;
		}
		return (fact);
	}
	
}
