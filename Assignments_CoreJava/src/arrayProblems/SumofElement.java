package arrayProblems;

import java.util.Scanner;

public class SumofElement {

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
		System.out.println("Even Elements: ");
		int sum=0;
		for(int i=0;i<size;i++) {
			 sum+=arr[i];	
		}
		System.out.print(sum);
		sc.close();
	}

}
