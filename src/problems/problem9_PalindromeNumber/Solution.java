package problems.problem9_PalindromeNumber;

public class Solution {
	public static boolean isPalindrome(int x) {
		String str = Integer.toString(x);
		String reverseStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverseStr = reverseStr + str.charAt(i);
		}
		if (str.equals(reverseStr)) {
			return true;
		}
		return false;
	}
}
