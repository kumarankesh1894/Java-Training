package loopNumbersProblem;

import java.util.Scanner;

public class FactorialofEachDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int number = sc.nextInt();
		
		while(number>0) {
			int split = number%10;
			System.out.print(split+" - ");
			factorialOfEachDigit(split);
			number = number/10;
			System.out.println();
			sc.close();
		}
	}
	public static void factorialOfEachDigit(int number) {
		long fact=1;
		for(int i=1;i<=number;i++) {
			fact*=i;
		}
		System.out.println(fact);
	}

}
