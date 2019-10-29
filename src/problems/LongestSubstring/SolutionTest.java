package problems.LongestSubstring;

import org.junit.*;

public class SolutionTest {
	@Test
	public void test1() {
		Solution s = new Solution();
		String str = "abcabcbb";
		Assert.assertEquals(3, s.lengthOfLongestSubstring(str));
	}
	
	@Test
	public void test2() {
		Solution s = new Solution();
		String str = "bbbb";
		Assert.assertEquals(1, s.lengthOfLongestSubstring(str));
	}
	
	@Test
	public void test3() {
		Solution s = new Solution();
		String str = "pwwkew";
		Assert.assertEquals(3, s.lengthOfLongestSubstring(str));
	}
}
