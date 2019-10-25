package problems.WordPattern;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean wordPattern(String pattern, String str) {
    	String[] strArray = str.split(" ");
    	if(strArray.length != pattern.length()) {
    		return false;
    	}
    	char[] charArray = new char[pattern.length()];
    	for(int i =0; i < pattern.length(); i++) {
    		charArray[i] = pattern.charAt(i);
    	}
    	
    	Map<Character, String> patternMap= new HashMap<Character, String>();
        
        for (int i = 0; i < strArray.length; i++) {
        	if (!patternMap.containsKey(charArray[i])) {
        		if(!patternMap.containsValue(strArray[i])) {
        			patternMap.put(charArray[i], strArray[i]);
        		}else {
        			return false;
        		}
        	}else
        		if (!patternMap.get(charArray[i]).equals(strArray[i])){
        			return false;
        	}
        }
        return true;
    }
}
