package intermediateStringsPrograms;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateCharacters {
		public static String removeDuplicateCharacters(String string) {
			char[]character = string.toCharArray();
			StringBuffer str=new StringBuffer();
			LinkedHashSet<Character> set = new LinkedHashSet<>();
			for(char ch:character) {
				set.add(ch);
			}
			for(char cha:set) {
				str.append(cha);
			}	
			return str.toString();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(removeDuplicateCharacters(str));
		sc.close();
	}

}
