package Strings;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String to Reverse: ");
		String str = sc.nextLine();
		char [] ch = str.toCharArray();
		System.out.print("String after reverse: ");
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]+" ");
		}
		sc.close();
	}
}
