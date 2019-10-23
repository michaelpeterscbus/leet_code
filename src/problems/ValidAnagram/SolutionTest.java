package problems.ValidAnagram;

import org.junit.*;

public class SolutionTest {
	
	@Test
	public void anagramReturnsTrue() {
		Solution s = new Solution();
		String st = "anagram";
		String t = "nagaram";
		Assert.assertTrue(s.isAnagram(st, t));
	}
	
	@Test
	public void nonAnagramReturnsFalse() {
		Solution s = new Solution();
		String st = "rat";
		String t = "car";
		Assert.assertFalse(s.isAnagram(st, t));
	}
}
