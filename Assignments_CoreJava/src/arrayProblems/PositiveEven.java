package arrayProblems;

import java.util.Scanner;

public class PositiveEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of the Array: ");
		int size = sc.nextInt();
		int []arr = new int[size];
		System.out.println("Enter the Elements: ");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Even Elements: ");
		for(int i=0;i<size;i++) {
			if(arr[i]>0&&arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		sc.close();
	
	}
}
