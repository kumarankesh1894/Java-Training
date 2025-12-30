package loopNumbersProblem;
import java.util.*;
public class FactorsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int i=1;
		
		while(i<=number) {
			if(number%i==0) {
				System.out.println(i);
				};
			i++;
		}
		sc.close();
	}

}
