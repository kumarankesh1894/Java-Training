package loopStatements;
import java.util.Scanner;
public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = sc.nextInt();
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				System.out.print(j+1+" ");
			}
			System.out.println();
		}
	}

}
