package problems.PowerOfThree;

import org.junit.*;

public class SolutionTest {
	
	@Test
	public void test0() {
		Solution s = new Solution();
		Assert.assertFalse(s.isPowerOfThree(0));
	}
	
	@Test
	public void test1() {
		Solution s = new Solution();
		Assert.assertTrue(s.isPowerOfThree(1));
	}
	
	@Test
	public void test243() {
		Solution s = new Solution();
		Assert.assertTrue(s.isPowerOfThree(243));
	}
	
	
}
