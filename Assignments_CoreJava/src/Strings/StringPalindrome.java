package Strings;

public class StringPalindrome {
	public static boolean isPalindrome(String string) {
		char []ch = string.toCharArray();
		int left=0;int right = ch.length-1;
		while(left<right) {
			if(ch[left]!=ch[right]) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "NamaN";
		String str2 = "Ankesh";
		System.out.println("Is String Palindrome: "+isPalindrome(str));
		System.out.println("Is String Palindrome: "+isPalindrome(str2));
	}

}
