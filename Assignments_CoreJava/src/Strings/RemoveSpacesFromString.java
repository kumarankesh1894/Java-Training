package Strings;

import java.util.Scanner;

public class RemoveSpacesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the First String: ");
		String string = sc.nextLine();
		System.out.println("After Removing all the spaces: "+string.replaceAll("\\s+",""));
		sc.close();
	}

}
