package starPattern;
import java.util.Scanner;
public class ButterflyPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<n*2;i++) {
			for(int j=1;j<n*2;j++) {
				if((i>=j && i+j<=n*2 )|| (i+j>=n*2 && i<=j)) {
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
