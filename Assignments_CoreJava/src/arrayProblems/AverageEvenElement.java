package arrayProblems;

import java.util.Scanner;

public class AverageEvenElement {

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
		
		double sum=0,count=0;
		for(int i=0;i<size;i++) {
			if(arr[i]%2==0) {
			 sum+=arr[i];	
			 count++;
			}
		}
		System.out.print("The Average of Even Elements are: "+sum/count);
		sc.close();
	}

}
