package Strings;

import java.util.Scanner;

public class ReplaceCharacterInString {
		
	public static String replaceCharacter(String string,char oldchar,char newchar) {
		char ch[] = string.toCharArray();
		boolean isMark = false;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==oldchar) {
				ch[i]=newchar;
				isMark = true;
			}
		}
		if(isMark) return new String(ch);
		return "Can't replace the character";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		char oldchar = sc.next().charAt(0);
		char newchar = sc.next().charAt(0);
		System.out.println("String after replacing the Character: "+replaceCharacter(string, oldchar, newchar));
		sc.close();
	}

}
