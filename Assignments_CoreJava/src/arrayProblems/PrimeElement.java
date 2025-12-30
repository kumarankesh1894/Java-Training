package arrayProblems;

import java.util.Scanner;

public class PrimeElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of the Array: ");
		int size = sc.nextInt();
		int []arr = new int[size];
		System.out.println("Enter the Elements: ");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			if(isPrime(arr[i])) {
				System.out.print(arr[i]+" ");
			}
		}
		sc.close();
	}
	private static boolean isPrime(int number) {
		
		for (int i=2;i<number;i++) {
			if(number%i==0) {
				return false;
			}
			i++;
		}
		return true;
	}

}
