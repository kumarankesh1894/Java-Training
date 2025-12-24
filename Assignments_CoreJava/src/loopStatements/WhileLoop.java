package loopStatements;
import java.util.Scanner;
public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 0 or 1:");
		int s = sc.nextInt();
		System.out.print("Enter the Number: ");
		int n=sc.nextInt();
		int i=0;
		if(s==0) {
		while(i<n) {
			System.out.println("*");
			i++;
		}
		}
		else {
			i=1;
			while(i<=n) {
				System.out.println(i);
				i++;
			}
		}
		sc.close();
	}

}
