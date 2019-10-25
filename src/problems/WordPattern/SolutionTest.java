package problems.WordPattern;

import org.junit.*;

public class SolutionTest {
	@Test
	public void test1() {
		Solution s = new Solution();
		String pattern = "abba";
		String str = "dog cat cat dog";
		Assert.assertTrue(s.wordPattern(pattern, str));
	}
	@Test
	public void test2() {
		Solution s = new Solution();
		String pattern = "abba";
		String str = "dog cat cat fish";
		Assert.assertFalse(s.wordPattern(pattern, str));
	}
	
	@Test
	public void test3() {
		Solution s = new Solution();
		String pattern = "aaaa";
		String str = "dog cat cat dog";
		Assert.assertFalse(s.wordPattern(pattern, str));
	}
	
	@Test
	public void test4() {
		Solution s = new Solution();
		String pattern = "abba";
		String str = "dog dog dog dog";
		Assert.assertFalse(s.wordPattern(pattern, str));
	}
	
	@Test
	public void test5() {
		Solution s = new Solution();
		String pattern = "aaa";
		String str = "aa aa aa aa";
		Assert.assertFalse(s.wordPattern(pattern, str));
	}
}
