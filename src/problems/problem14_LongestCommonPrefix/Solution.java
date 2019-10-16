package problems.problem14_LongestCommonPrefix;

class Solution {
    public static String longestCommonPrefix(String[] strs) {
    	String prefix = "";
    	if (strs.length != 0) {
    		prefix = strs[0];
    	}
    	for (int i = 1; i < strs.length; i++) {
    		while(prefix.length() > 0 && !strs[i].startsWith(prefix))
    			prefix = prefix.substring(0,prefix.length() - 1);
    		}
    	return prefix;
    }
}