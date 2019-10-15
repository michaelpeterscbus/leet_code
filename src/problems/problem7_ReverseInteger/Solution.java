package problems.problem7_ReverseInteger;

public class Solution {
	 public static int reverse(int x) {
	        String str= Integer.toString(x);
	        String reverseStr = "";
	        boolean isNegative = false;
	        for (int i=str.length() - 1; i>=0; i--) {
	        	if(str.charAt(i) == ('-')) {
	        		isNegative=true;
	        	}else {
	        	reverseStr = reverseStr + str.charAt(i);
	        	
	        }
	        if(isNegative) {
	        	reverseStr = "-" + reverseStr;
	        }
	    }
	        Long l = Long.parseLong(reverseStr);
	        if (l <= Math.pow(2, 31) - 1 && l >= Math.pow(-2, 31)) {
	        	return l.intValue();
	        }
	        return 0;
	 }
}
