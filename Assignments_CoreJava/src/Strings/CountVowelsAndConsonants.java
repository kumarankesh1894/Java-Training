package Strings;
import java.util.*;
public class CountVowelsAndConsonants {
		public static int [] countVowelAndConsonant(String str) {
			char[]ch = str.toCharArray();
			int vowelCount=0; int consonantCount=0;
			for(int i=0;i<ch.length;i++) {
				if(Character.isLetter(ch[i])) {
					if(ch[i]=='a' || ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='O'||ch[i]=='E'||ch[i]=='I'||ch[i]=='U') {
						vowelCount++;
					}else {
						consonantCount++;
					}
				}
			}
			return new int[]{vowelCount,consonantCount};
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int []result  = countVowelAndConsonant(str);
		System.out.println(result[0]+" "+result[1]);
		sc.close();
	}

}
