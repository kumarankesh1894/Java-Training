package Strings;

import java.util.Scanner;
	/*
	 \s:  
	 * means any whitespace character
	 * Includes: space " ", tab \t, newline \n, multiple spaces
	 * In Java strings, \ is an escape character, so:
	 * \s → must be written as \\s
	 * + is a quantifier
	 * Means one or more times 
	 * ✅ Combined Meaning: \\s+
	 * One or more whitespace characters*/
public class CountNumberOfWords {
		// TODO Auto-generated method stub
		public static int countWords(String string) {
			String[] str = string.split("\\s+");
			
			int countWords=0;
			for(int i=0;i<str.length;i++) {
				countWords++;
			}
			return countWords;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Your String: ");
			String str = sc.nextLine();
			System.out.println("Count Number of Words: "+countWords(str));
			sc.close();
	}

}
