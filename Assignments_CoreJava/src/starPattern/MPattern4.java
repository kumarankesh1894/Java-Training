 package starPattern;

import java.util.Scanner;

public class MPattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<n*2;i++) {
			for(int j=1;j<=n;j++) {
				if(i<=j || i+j>=n*2) {
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
