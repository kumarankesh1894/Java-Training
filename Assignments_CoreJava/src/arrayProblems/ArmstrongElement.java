package arrayProblems;

import java.util.Scanner;

public class ArmstrongElement {

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
			if(isArmstrong(arr[i])) {
				System.out.print(arr[i]+" ");
			}
		}
		sc.close();
	}
	public static boolean isArmstrong(int number) {
		int org = number;
		int backUp = number;
		int remainder=0,count=0,power=0;
		while(number>0) {
			remainder = number%10;
			count++;
			number/=10;
		}
		while(backUp>0) {
			remainder = backUp%10;
			power += (int)Math.pow(remainder, count);
			backUp/=10;
		}
	boolean res = (power==org)? true:false;
	return res;
	}

}
