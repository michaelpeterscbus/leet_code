package problems.RemoveDuplicatesSortedArray;

import org.junit.Assert;
import org.junit.Test;


public class SolutionTest {
	@Test
	public void test1() {
		Solution s = new Solution();
		int[] nums = {1,1,2};
		Assert.assertEquals(2, s.removeDuplicates(nums));
	}
	
	@Test
	public void test2() {
		Solution s = new Solution();
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		Assert.assertEquals(5, s.removeDuplicates(nums));
	}
}
