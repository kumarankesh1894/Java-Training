package arrayProblems;
import java.util.Scanner;
public class PalindromeElement {

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
			if(isPalindrome(arr[i])) {
				System.out.print(+arr[i]+" ");
			}
		}
		sc.close();

	}
	private static boolean isPalindrome(int number) {
		int org = number;
		int remainder = 0,sum=0;
		while(number>0) {
			remainder = number%10;
			sum = sum*10+remainder;
			number/=10;
		}
		boolean res = sum==org ? true:false;
		return res;
	}

}
