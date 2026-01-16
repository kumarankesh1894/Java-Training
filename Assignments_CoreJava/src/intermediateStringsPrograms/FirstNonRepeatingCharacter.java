package intermediateStringsPrograms;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
		public static char firstNonRepeatingCharacter(String string) {
			char[]ch = string.toCharArray();
			HashMap<Character,Integer> map = new HashMap<>();
			for(char c:ch) {
				map.put(c, map.getOrDefault(c, 0)+1);
			}
			for(char c:ch) {
				if(map.get(c)==1) {
					return c;
				}
			}
			return ' ';
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		System.out.println(firstNonRepeatingCharacter(string));
		sc.close();
	}

}
