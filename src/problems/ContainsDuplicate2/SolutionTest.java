package problems.ContainsDuplicate2;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
	@Test
	public void test1() {
		Solution s = new Solution();
		int[] nums = {1,2,3,1};
		Assert.assertTrue(s.containsNearbyDuplicate(nums, 3));
	}
	
	@Test
	public void test2() {
		Solution s = new Solution();
		int[] nums = {1,0,1,1};
		Assert.assertTrue(s.containsNearbyDuplicate(nums, 1));
	}
	
	@Test
	public void test3() {
		Solution s = new Solution();
		int[] nums = {1,2,3,1,2,3};
		Assert.assertFalse(s.containsNearbyDuplicate(nums, 2));
	}
	
	@Test
	public void test4() {
		Solution s = new Solution();
		int[] nums = {99,99};
		Assert.assertTrue(s.containsNearbyDuplicate(nums, 2));
	}
}
