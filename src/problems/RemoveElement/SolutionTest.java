package problems.RemoveElement;

import org.junit.*;

public class SolutionTest {
	@Test
	public void test1() {
		Solution s = new Solution();
		int[] nums = {3,2,2,3};
		int val = 3;
		Assert.assertEquals(2, s.removeElement(nums, val));
	}
	
	@Test
	public void test2() {
		Solution s = new Solution();
		int[] nums = {0,1,2,2,3,0,4,2};
		int val = 2;
		Assert.assertEquals(5, s.removeElement(nums, val));
	}
}
