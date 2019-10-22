package problems.problem35_SearchInsertPosition;

import org.junit.Assert;
import org.junit.Test;



public class SolutionTest {
	@Test
	public void exampleOne() {
		Solution s = new Solution();
		int[] nums = {1,3,5,6};
		Assert.assertEquals(2, s.searchInsert(nums, 5));
	}
	
	@Test
	public void exampleTwo() {
		Solution s = new Solution();
		int[] nums = {1,3,5,6};
		Assert.assertEquals(1, s.searchInsert(nums, 2));
	}
	
	@Test
	public void exampleThree() {
		Solution s = new Solution();
		int[] nums = {1,3,5,6};
		Assert.assertEquals(4, s.searchInsert(nums, 7));
	}
	
	@Test
	public void exampleFour() {
		Solution s = new Solution();
		int[] nums = {1,3,5,6};
		Assert.assertEquals(0, s.searchInsert(nums, 0));
	}
}
