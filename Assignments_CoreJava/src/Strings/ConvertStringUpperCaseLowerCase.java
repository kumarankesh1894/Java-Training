package Strings;
import java.util.*;
public class ConvertStringUpperCaseLowerCase {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Original String: ");
		String string = sc.nextLine();
		System.out.println("String Converted to UpperCase: "+string.toUpperCase());
		System.out.println("String Converted to LowerCase: "+string.toLowerCase());
		sc.close();
	}

}
