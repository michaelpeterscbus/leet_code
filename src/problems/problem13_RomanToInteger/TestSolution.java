package problems.problem13_RomanToInteger;

import org.junit.*;
public class TestSolution {

	@Test
	public void IReturns1() {
	Solution s = new Solution();
	Assert.assertEquals(1, s.romanToInt("I"));
	}
	
	@Test
	public void IVReturns4() {
	Solution s = new Solution();
	Assert.assertEquals(4, s.romanToInt("IV"));
	}
	
	@Test
	public void IXReturns9() {
	Solution s = new Solution();
	Assert.assertEquals(9, s.romanToInt("IX"));
	}
	
	@Test
	public void LVIIIReturns58() {
	Solution s = new Solution();
	Assert.assertEquals(58, s.romanToInt("LVIII"));
	}
	
	@Test
	public void MCMXCIVReturns1994() {
	Solution s = new Solution();
	Assert.assertEquals(1994, s.romanToInt("MCMXCIV"));
	}
}
