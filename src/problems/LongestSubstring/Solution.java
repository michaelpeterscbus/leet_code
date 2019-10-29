package problems.LongestSubstring;

public class Solution {
	public int lengthOfLongestSubstring(String s) {
		String longest;
		int count = 0, temp, j = 0;
		while(j < s.length()) {
			temp = 0;
			longest = "";
			for(int i = j; i < s.length(); i++) {
	        	if(!longest.contains(Character.toString(s.charAt(i)))) {
	        		longest = longest + Character.toString(s.charAt(i));
	        		temp++;
	        	}else {
	        		break;
	        	}
	        }
			if(temp > count) {
				count = temp;
			}
			j++;
		}
		return count;
    }
}
