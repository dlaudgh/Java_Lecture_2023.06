package ch11_API.sec04_string;

/**
 * 자바 API에 없는 유용한 String Library
 */
public class Strings {
	public static int count(String src, String target) {
		String eliminated = src.replace(target, "");
		int len = (src.length() - eliminated.length()) / target.length();
		return len;
	}
	
	public static boolean isPalindrome(String str) {
		return str.equals(reverse(str));
	}
	
	public static String reverse(String str) {
		String reverseStr = "";
		for (int i = str.length()-1; i >= 0; i--)
			reverseStr += str.charAt(i);
		return reverseStr;
	}
}
