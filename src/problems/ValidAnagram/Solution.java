package problems.ValidAnagram;

import java.util.Arrays;

public class Solution {
	public boolean isAnagram(String s, String t) {
		char[] sChar = s.toCharArray();
		Arrays.sort(sChar);
		char[] tChar = t.toCharArray();
		Arrays.sort(tChar);
		if (Arrays.equals(sChar, tChar)) {
			return true;
		}
		return false;
	}
}
