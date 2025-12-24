package starPattern;
import java.util.Scanner;
public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//n ki value kuchh bhi ho right side me hamesha n-1, n+1 or n*3-1 use krenge.
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<n*2;i++) {
			for(int j=1;j<n*2;j++) {
				if(i+j>=n+1 && j-i<=n-1 && i-j<=n-1 && i+j<=n*3-1) {                             
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
	

}
