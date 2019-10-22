package problems.problem28_ImplementStrStr;

public class Solution {
	public int strStr(String haystack, String needle) {
		if (needle.equals("") || needle.isEmpty()) {
			return 0;
		}

		int len = needle.length();
		for (int i = 0; i < haystack.length(); i++) {
			if (i + len < haystack.length()) {
				if (haystack.substring(i, i + len).equals(needle)) {
					return i;
				}
			} else {
				if (haystack.substring(i).equals(needle)) {
					return i;
				}
			}
		}
		return -1;
	}
}
