package problems.PowerOfThree;

public class Solution {
    public boolean isPowerOfThree(int n) {
        if (n == 0) return false;
        if (n == 1) return true;
		double log3 = Math.log(n)/Math.log(3);
		double log3Int = Math.round(log3);
		if (Math.abs(log3 - log3Int) < 1e-10) {
			log3 = log3Int;
		}
		return log3 / Math.floor(log3) == 1;
	}
}
