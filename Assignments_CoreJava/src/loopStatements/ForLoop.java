package loopStatements;
import java.util.Scanner;
public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 0 or 1:");
		int s = sc.nextInt();
		System.out.print("Enter the Number: ");
		int n=sc.nextInt();
		
		if(s==0) {
		for(int i=0;i<n;i++) {
			System.out.println("*");
		}
		}
		else {
			for(int i=1;i<=n;i++) {
				System.out.println(i);
				
			}
		}
		sc.close();
	}

}
