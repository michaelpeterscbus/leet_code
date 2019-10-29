package problems.IntersectionOf2Arrays;

import org.junit.*;

public class SolutionTest {
	@Test
	public void test1() {
		Solution s = new Solution();
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		int[] solution = {2};
		Assert.assertArrayEquals(solution, s.intersection(nums1, nums2));
	}
	
	@Test
	public void test2() {
		Solution s = new Solution();
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		int[] solution = {4,9};
		Assert.assertArrayEquals(solution, s.intersection(nums1, nums2));
	}
}
