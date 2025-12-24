package loopNumbersProblem;

import java.util.Scanner;

public class FactorsofEachdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		while(number>0) {
			int split = number%10;
			factorsOfDigit(split);
			number = number/10;
			System.out.println();
		}
		sc.close();
	}

	public static void factorsOfDigit(int number) {
		int i=1;
		
		while(i<=number) {
			if(number%i==0) {
				System.out.println(i);
				};
			i++;
		}
		
	}
}
