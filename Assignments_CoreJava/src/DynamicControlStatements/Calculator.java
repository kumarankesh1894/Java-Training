package DynamicControlStatements;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first Number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter the Symbol: ");
		char  ch = sc.next().charAt(0);
		System.out.print("Enter Second Number: ");
		int num2 = sc.nextInt();
		switch(ch) {
		case '+': System.out.println(num1+num2); break;
		case '-': System.out.println(num1-num2);break;
		case '*': System.out.println(num1*num2);break;
		case '/': System.out.println(num1/num2);break;
		case '%': System.out.println(num1%num2);break;
		
		default: System.out.println("Provide correct Input.");
		}

	}

}
