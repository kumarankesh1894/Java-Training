package Strings;

import java.util.Scanner;

public class CompareStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the First String: ");
		String string1 = sc.nextLine();
		System.out.print("Enter the First String: ");
		String string2 = sc.nextLine();
		// return false because it checks the reference of both string object.
		System.out.println("String1 == String2: "+(string1==string2)); 
		//return true because it checks by value of both String object.
		System.out.println("String1.equals(String2): "+(string1.equals(string2))); 
		sc.close();
	}

}
