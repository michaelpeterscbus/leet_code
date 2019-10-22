package problems.FactorialTrailingZeroes;

import java.math.BigDecimal;

public class Solution {
	public int trailingZeroes(int n) {
		int INT_MAX = 2147483647;
		if (n < 0) return 0;
		int result = 0;
		for (int i = 5; n/i > 0; i=i*5) {
			result = result + n/i;
			if (i > INT_MAX/5) return result;
		}
		return result;	
//		float i = n;
//		while (n > 1) {
//			n--;
//			i *= n;
//		}
//		String s = floatToString(i);
//		int zeroes = 0;
//		for (int j = s.length() - 1; j >= 1; j--) {
//			if (s.charAt(j) == '0') {
//				zeroes++;
//			} else {
//				return zeroes;
//			}
//		}
//		return 0;
//	}
//	
//	public static String floatToString(Float d) {
//	    if (d == null)
//	        return null;
//	    if (d.isNaN() || d.isInfinite())
//	        return d.toString();
//
//	    if (d.doubleValue() == 0)
//	        return "0";
//	    return new BigDecimal(d.toString()).stripTrailingZeros().toPlainString();
	}
}
