package Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class CountOccurenceOfSubstring {
		public static void occurenceCount(String string) {
			String []str = string.split("\\s+");
			LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
			for(String st: str) {
				map.put(st, map.getOrDefault(st, 0)+1);
			}
			for(HashMap.Entry<String,Integer> ent:map.entrySet()) {
				System.out.println(ent.getKey()+": "+ent.getValue());
			}
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		occurenceCount(string);
		sc.close();
	}

}
