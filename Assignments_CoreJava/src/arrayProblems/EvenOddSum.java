package arrayProblems;

import java.util.Scanner;

public class EvenOddSum {

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
		int evenSum=0;
		int oddSum=0;
		for(int i=0;i<size;i++) {
			if(arr[i]%2==0) {
			 evenSum+=arr[i];	
			}else {
				oddSum+=arr[i];
			}
		}
		int res = evenSum>oddSum? evenSum-oddSum:oddSum-evenSum; 
		System.out.print("difference of even and odd sum of elements: "+res);
		sc.close();
	}

}
