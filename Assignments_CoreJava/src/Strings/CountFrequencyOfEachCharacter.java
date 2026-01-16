package Strings;

import java.util.*;
//import java.util.HashMap;
import java.util.Scanner;

public class CountFrequencyOfEachCharacter {

	public static void duplicateCharacters(String string) {
		/* Done using HashMap
		HashMap<Character,Integer> map = new HashMap<>();
		for(char ch:string.toCharArray()) {
			if(ch!=' ') {
				map.put(ch,map.getOrDefault(ch,0)+1);
			}
		}
			System.out.print("The Duplicate Characters are: ");
			for(HashMap.Entry<Character,Integer> en: map.entrySet()) {
				if(en.getValue()>1) {
					System.out.println(en.getKey()+" "+en.getValue()+" ");
				}
			}
			*/
		
		char []ch= string.toCharArray();
		Arrays.sort(ch);
			for(int i=0;i<ch.length;) {
				int count=1;
				while(i+count<ch.length && ch[i]==ch[i+count]) {
					count++;
				}
				if(count>1) {
					System.out.print("['"+ch[i]+ "',"+count+"],");
				}
				i+=count;
			}
		}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	String string = sc.nextLine();
	System.out.print("Duplicate Characters are-> ");
	duplicateCharacters(string);
	sc.close();

}

}
