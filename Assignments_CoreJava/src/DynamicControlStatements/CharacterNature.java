package DynamicControlStatements;
import java.util.Scanner;
public class CharacterNature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Character: ");
		char ch = sc.next().charAt(0);
		if(Character.isUpperCase(ch)) System.out.println("The Letter is in Uppercase");
		else if(Character.isLowerCase(ch)) System.out.println("The Letter is in LowerCase");
		else if(Character.isDigit(ch)) System.out.println("The Letter is Digit");
		else System.out.println("The Character is special character.");
		sc.close();
	}

}
