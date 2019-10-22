package problems.problem13_RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	 public int romanToInt(String s) {
	        Map<String, Integer> romanMap = new HashMap<String, Integer>();
	        romanMap.put("I", 1);
	        romanMap.put("II", 2);
	        romanMap.put("III", 3);
	        romanMap.put("IV", 4);
	        romanMap.put("V", 5);
	        romanMap.put("IX", 9);
	        romanMap.put("X", 10);
	        romanMap.put("XL", 40);
	        romanMap.put("L", 50);
	        romanMap.put("XC", 90);
	        romanMap.put("C", 100);
	        romanMap.put("CD", 400);
	        romanMap.put("D", 500);
	        romanMap.put("CM", 900);
	        romanMap.put("M", 1000);
	        
	        int result = 0;
	        for(int i = 0; i < s.length(); i++) {
	        	if (s.length() - i - 1 >= 1) {
	        		if (s.substring(i, i+2).equals("CM")){
	        			result += romanMap.get("CM");
	        			i++;
	        		}else if (s.substring(i, i+2).equals("CD")) {	
	        			result += romanMap.get("CD");
	        			i++;
	        		}else if (s.substring(i, i+2).equals("XC")) {	
	        			result += romanMap.get("XC");
	        			i++;
	        		}else if (s.substring(i, i+2).equals("XL")) {	
	        			result += romanMap.get("XL");
	        			i++;
	        		}else if (s.substring(i, i+2).equals("IX")) {	
	        			result += romanMap.get("IX");
	        			i++;
	        		}else if (s.substring(i, i+2).equals("IV")) {	
	        			result += romanMap.get("IV");
	        			i++;
	        		}else {
	        			result += romanMap.get(s.substring(i, i+1));
	        		}
	        }else {
	        	result += romanMap.get(s.substring(i, i+1));
	        }
	        	
	        }
	        
		 return result;
	    }
}
