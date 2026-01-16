package Strings;

import java.util.Scanner;

public class LongestWordInSentence {
		public static String longestWordInSentence(String string) {
			String [] str = string.split("\\s+");
			int maxLen = Integer.MIN_VALUE;
			String stri = " ";
			for(int i=0;i<str.length;i++) {
				if(maxLen<(str[i].length())){
					maxLen = str[i].length();
					stri = str[i];
				}
			}
			return stri;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			System.out.println("The Longest Word is '"+longestWordInSentence(str)+"'");
			sc.close();
	}

}
