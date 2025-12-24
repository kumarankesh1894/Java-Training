package array;
import java.util.Scanner;
public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the size of the Array: ");
		int n = sc.nextInt();
		int []arr = new int[n];
		System.out.println("Enter the Values: ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			if(i>=n) System.out.println("Array Index out of Bound.");
			else System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}
