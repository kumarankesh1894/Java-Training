package DynamicControlStatements;
import java.util.Scanner;
public class Divisibility5and11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number%5==0 && number%11==0) {
			System.out.println(number+" is divisible by 5 and 11 both.");
		}else {
			System.out.println(number+" is not divisible by 5 and 11 both");
		}
		sc.close();
	}

}
