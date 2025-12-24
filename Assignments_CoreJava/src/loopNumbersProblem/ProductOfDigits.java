package loopNumbersProblem;

import java.util.Scanner;

public class ProductOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int backUp = number;
		int product=1;int remainder=0;
		while(number>0) {
			remainder = number%10;
			 product *= remainder;
			number = number/10;
		}
		System.out.println("Sum of "+backUp+" is "+product);
		sc.close();
	}

}
