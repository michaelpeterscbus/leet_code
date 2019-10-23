package problems.AddDigits;

public class Solution {
	
    public int addDigits(int num) {
        String s = Integer.toString(num);
        int sum = 10;
        while (sum >= 10){
        	sum = 0;
        	for (int i = 0; i < s.length(); i++) {
        		int k = Character.getNumericValue(s.charAt(i));
        		sum += k;
        	}
        	s = Integer.toString(sum);
        }
        return sum;
    }
}
