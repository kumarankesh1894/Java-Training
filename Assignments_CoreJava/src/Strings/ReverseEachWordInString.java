package Strings;

import java.util.Scanner;

public class ReverseEachWordInString {
	
	public static String reverseCharacter(String string) {
		char []ch = string.toCharArray();
		int left = 0; int right = ch.length-1;
		while(left<right) {
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;
			left++;
			right--;
		}
		return new String(ch);
	}
	public static String reverseEachWord(String string) {
		String[]str = string.split("\\s+");
		
		for(int i=0;i<str.length;i++) {
			str[i]=reverseCharacter(str[i]);
		}
		return String.join(" ", str); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		System.out.println(reverseEachWord(string));
		sc.close();
	}

}
