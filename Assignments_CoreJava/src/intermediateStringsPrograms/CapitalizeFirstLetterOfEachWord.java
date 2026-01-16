package intermediateStringsPrograms;

import java.util.Scanner;

public class CapitalizeFirstLetterOfEachWord {
	public static String capitalizeChar(String string) {
		if(string==null || string.isEmpty()) return string;
		char[]ch = string.toCharArray();
		ch[0] = Character.toUpperCase(ch[0]);
		return new String(ch);
	}
	public static String capitalizeFirstLetter(String string) {
		if(string==null || string.isEmpty()) return string;
		String[]str = string.split("\\s+");
		
		for(int i=0;i<str.length;i++) {
			str[i] = capitalizeChar(str[i]);
		}
		return String.join(" ", str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(capitalizeFirstLetter(str));
		sc.close();

	}

}
