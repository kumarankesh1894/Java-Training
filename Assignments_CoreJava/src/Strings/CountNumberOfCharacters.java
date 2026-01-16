package Strings;
import java.util.*;
public class CountNumberOfCharacters {
	public static int countCharacters(String string) {
		char[]ch = string.toCharArray();
		int countChar=0;
		for(int i=0;i<ch.length;i++) {
			countChar++;
		}
		return countChar;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your String: ");
		String str = sc.nextLine();
		System.out.println("Count of Character: "+countCharacters(str));
		sc.close();
	}

}
