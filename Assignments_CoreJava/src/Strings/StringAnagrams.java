package Strings;

import java.util.*;

public class StringAnagrams {
		public static boolean isAnagram(String string1, String string2) {
			string1 = string1.toLowerCase();
			string2 = string2.toLowerCase();
			char ch1[] = string1.toCharArray(); Arrays.sort(ch1);
			char ch2[] = string2.toCharArray(); Arrays.sort(ch2);
			if(ch1.length!=ch2.length) return false;
			for(int i=0;i<ch1.length;i++) {
				if(ch1[i]!=ch2[i]) return false;
			}
			return true;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String 1: ");
		String string1 = sc.nextLine();
		System.out.print("Enter String 2: ");
		String string2 = sc.nextLine();
		System.out.println("do both strings are anagram: "+isAnagram(string1,string2));
		sc.close();
	}

}
