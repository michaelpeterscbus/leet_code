package problems.MyAtoi;

public class Solution {
    public int myAtoi(String str) {
    		str = str.trim();
    		boolean isNegative = false;
    		if (str.isEmpty() || str == null) return 0;
        if (str.charAt(0) == '+' ) {
        		if(str.length()>2 && str.charAt(1) == '-') return 0;
        		str = str.substring(1);
        }
        if (str.isEmpty() || str == null) return 0;
        String intString ="";
        if (str.charAt(0) != 45 && (str.charAt(0) < 48 || str.charAt(0) > 57)){
        		return 0;
        }
        if(str.charAt(0) == 45) {
        		if(str.length() < 2) return 0;
        		if (str.charAt(1) < 48 || str.charAt(1) > 57) {
        			return 0;
        		}
        }
        if(str.charAt(0) == 45) {
        		isNegative = true;
		}
        for(int i = 0; i < str.length(); i++) {
        		if(i == 0 && isNegative) {
        			i++;
        		}
        		if ((str.charAt(i) >= 48 && str.charAt(i) <= 57)) {
        			intString = intString + str.charAt(i);
        		}else {
        			break;
        		}
        }
        if(isNegative) {
        		intString = "-" + intString;
        }
        if (intString.equals("0")) return 0;
        if (Double.parseDouble(intString) >= Math.pow(2, 31)) return (int) Math.pow(2, 31);
        if (Double.parseDouble(intString) < Math.pow(-2, 31)) return (int) Math.pow(-2, 31);
        return Integer.parseInt(intString);
    }
}
