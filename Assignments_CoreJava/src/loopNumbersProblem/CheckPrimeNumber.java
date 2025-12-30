package loopNumbersProblem;
import java.util.Scanner;
public class CheckPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
		int index=1,count=0;
		while(index<=number) {
			if(number%index==0) {
				count++;
			}
			index++;
		}
		if(count>2) {
			System.out.print("Non Prime");
		}
		else System.out.println("Prime");
		sc.close();
	}

}
