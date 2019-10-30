package problems.ContainerWithMostWater;

import org.junit.*;

public class SolutionTest {
	@Test
	public void test1() {
		Solution s = new Solution();
		int[] nums = {1,8,6,2,5,4,8,3,7};
		Assert.assertEquals(49, s.maxArea(nums));
	}
}
