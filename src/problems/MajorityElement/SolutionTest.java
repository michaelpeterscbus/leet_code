package problems.MajorityElement;

import org.junit.*;

public class SolutionTest {
	@Test
	public void test1() {
		Solution s = new Solution();
		int[] input = {3,2,3};
		Assert.assertEquals(3, s.majorityElement(input));
	}
	
	@Test
	public void test2() {
		Solution s = new Solution();
		int[] input = {2,2,1,1,1,2,2};
		Assert.assertEquals(2, s.majorityElement(input));
	}
}
