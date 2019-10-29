package problems.ContainsDuplicate;

import org.junit.*;

public class SolutionTest {
	
	@Test
	public void test1() {
		Solution s = new Solution();
		int[] nums = {1,2,3,1};
		Assert.assertTrue(s.containsDuplicate(nums));
	}
	
	@Test
	public void test2() {
		Solution s = new Solution();
		int[] nums = {1,2,3,4};
		Assert.assertFalse(s.containsDuplicate(nums));
	}
	
	@Test
	public void test3() {
		Solution s = new Solution();
		int[] nums = {1,1,1,3,3,4,3,2,4,2};
		Assert.assertTrue(s.containsDuplicate(nums));
	}
}	
